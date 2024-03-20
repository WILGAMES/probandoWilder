import java.util.Scanner;

public class OtherTestIntegradora {

    public static void main(String[] args) {

        int op = 0, pesoEquipaje = 0;

        int precioXs = 175000;

        Scanner reader = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora de Vuelos ICESi Flight 1.0" + "\n"
                + "Elige una de estas opciones:" + "\n" + "1-Viajar solo" + "\n" + "2-Viajar acompañado");

        op = reader.nextInt();

        switch (op) {
            case 1:

                int numAmigos;

                do {
                    System.out.println("Cuantos amigos van a acompañarte (Max. 3)");

                    numAmigos = reader.nextInt();

                    if (numAmigos > 3) {
                        System.out.println("Solo se permiten un máximo de 3 amigos");
                    }
                } while (numAmigos > 3);

                int[] asientos = new int[numAmigos];
                int[] posiciones = new int[numAmigos];
                int[] maletas = new int[numAmigos];
                int[] numMaletas = new int[numAmigos];
                int[] maletasDocumentadas = new int[numAmigos];
                int[] numMaletasDocumentadas = new int[numAmigos];
                double[] totalVuelo = new double[numAmigos];

                for (int i = 0; i < numAmigos; i++) {
                    System.out.println("Datos para el amigo " + (i + 1));

                    String categoria = "";

                    System.out.println("\nDigite el peso de su equipaje");
                    pesoEquipaje = reader.nextInt();

                    if (pesoEquipaje <= 3) {

                        System.out.println("Que categoria deseas elegir" + "\n"
                                + " XS \n S \n M \n Recuerda que todas las categorias tienen estos beneficios: \n -Eleccion de asiento previo al check-in \n -Maleta Adicional 10kg (Max.3) \n -Maleta Adicional Documentada 23kg (Max.2)");
                        reader.nextLine();
                        categoria = reader.nextLine();

                    } else if (pesoEquipaje > 3 && pesoEquipaje <= 10) {

                        System.out.println(
                                "Que categoria deseas elegir\n S \n M \n Recuerda que todas las categorias tienen estos beneficios: \n -Eleccion de asiento previo al check \n -Maleta Adicional 10kg (Max.3) \n -Maleta Adicional Documentada 23kg (Max.2)");
                        reader.nextLine();
                        categoria = reader.nextLine();

                    } else if (pesoEquipaje > 10) {

                        System.out.println(
                                "Que categoria deseas elegir \n M \n Recuerda que todas las categorias tienen estos beneficios: \n -Eleccion de asiento previo al check \n -Maleta Adicional 10kg (Max.3) \n -Maleta Adicional Documentada 23kg (Max.2)");
                        reader.nextLine();
                        categoria = reader.nextLine();

                    }

                    switch (categoria) {

                        case "XS":

                            System.out.println("Deseas incluir el servicio de asiento" + "\n" + "1-Si" + "\n" + "2-No");

                            asientos[i] = reader.nextInt();

                            if (asientos[i] == 1) {

                                System.out.println("En que posicion deseas estar (Ventana,Medio,Pasillo)");

                                posiciones[i] = reader.nextInt();

                                System.out.println(
                                        "Deseas incluir el sevicio de maleta adicional" + "\n" + "1-Si" + "\n"
                                                + "2-No");

                                maletas[i] = reader.nextInt();

                                if (maletas[i] == 1) {

                                    do {

                                        System.out.println("Cuantas maletas adicionales deseas llevar (Max. 3)");

                                        numMaletas[i] = reader.nextInt();

                                        if (numMaletas[i] > 3) {

                                            System.out.println("Superaste el limite de maleatas adicionales admitidas");

                                        }

                                    } while (numMaletas[i] > 3);

                                    System.out.println("Deseas llevar la maleta adicional documentada");

                                    maletasDocumentadas[i] = reader.nextInt();

                                    if (maletasDocumentadas[i] == 1) {

                                        do {

                                            System.out.println(
                                                    "Cuantas maletas adicionales documetadas deseas llevar (Max. 2)");

                                            numMaletasDocumentadas[i] = reader.nextInt();

                                            if (numMaletasDocumentadas[i] > 3) {

                                                System.out.println(
                                                        "Superaste el limite de maleatas adicionales admitidas");

                                            }

                                        } while (numMaletasDocumentadas[i] > 3);

                                    }

                                }
                            }

                            totalVuelo[i] = arreglosXS(asientos[i], precioXs, posiciones[i], maletas[i], numMaletas[i],
                                    maletasDocumentadas[i],
                                    numMaletasDocumentadas[i]);

                            break;

                        case "S":

                            System.out.println("Deseas incluir el servicio de asiento" + "\n" + "1-Si" + "\n" + "2-No");

                            asientos[i] = reader.nextInt();

                            if (asientos[i] == 1) {

                                System.out.println("En que posicion deseas estar (Ventana,Medio,Pasillo)");

                                posiciones[i] = reader.nextInt();

                                System.out.println(
                                        "Deseas incluir el sevicio de maleta adicional" + "\n" + "1-Si" + "\n"
                                                + "2-No");

                                maletas[i] = reader.nextInt();

                                if (maletas[i] == 1) {

                                    do {

                                        System.out.println("Cuantas maletas adicionales deseas llevar (Max. 3)");

                                        numMaletas[i] = reader.nextInt();

                                        if (numMaletas[i] > 3) {

                                            System.out.println("Superaste el limite de maleatas adicionales admitidas");

                                        }

                                    } while (numMaletas[i] > 3);

                                    System.out.println("Deseas llevar la maleta adicional documentada");

                                    maletasDocumentadas[i] = reader.nextInt();

                                    if (maletasDocumentadas[i] == 1) {

                                        do {

                                            System.out.println(
                                                    "Cuantas maletas adicionales documetadas deseas llevar (Max. 2)");

                                            numMaletasDocumentadas[i] = reader.nextInt();

                                            if (numMaletasDocumentadas[i] > 3) {

                                                System.out.println(
                                                        "Superaste el limite de maleatas adicionales admitidas");

                                            }

                                        } while (numMaletasDocumentadas[i] > 3);

                                    }

                                }
                            }

                            totalVuelo[i] = arreglosS(asientos[i], precioXs, posiciones[i], maletas[i], numMaletas[i],
                                    maletasDocumentadas[i],
                                    numMaletasDocumentadas[i]);

                            break;

                        case "M":

                            System.out.println("En que posicion deseas estar (Ventana,Medio,Pasillo)");

                            posiciones[i] = reader.nextInt();

                            System.out.println(
                                    "Deseas incluir el sevicio de maleta adicional" + "\n" + "1-Si" + "\n" + "2-No");

                            maletas[i] = reader.nextInt();

                            if (maletas[i] == 1) {

                                do {

                                    System.out.println("Cuantas maletas adicionales deseas llevar (Max. 3)");

                                    numMaletas[i] = reader.nextInt();

                                    if (numMaletas[i] > 3) {

                                        System.out.println("Superaste el limite de maleatas adicionales admitidas");

                                    }

                                } while (numMaletas[i] > 3);

                                System.out.println("Deseas llevar la maleta adicional documentada");

                                maletasDocumentadas[i] = reader.nextInt();

                                if (maletasDocumentadas[i] == 1) {

                                    do {

                                        System.out.println(
                                                "Cuantas maletas adicionales documetadas deseas llevar (Max. 2)");

                                        numMaletasDocumentadas[i] = reader.nextInt();

                                        if (numMaletasDocumentadas[i] > 3) {

                                            System.out.println("Superaste el limite de maleatas adicionales admitidas");

                                        }

                                    } while (numMaletasDocumentadas[i] > 3);

                                }

                            }

                            totalVuelo[i] = arreglosM(precioXs, posiciones[i], maletas[i], numMaletas[i],
                                    maletasDocumentadas[i],
                                    numMaletasDocumentadas[i]);

                    }

                }

                double totalGeneral = 0;
                for (int i = 0; i < numAmigos; i++) {
                    System.out.println("Precio del vuelo para el amigo " + (i + 1) + ": " + totalVuelo[i]);
                    totalGeneral += totalVuelo[i];
                }

                System.out.println("Precio total para el grupo: " + totalGeneral);

        }

    }

    public static double arreglosXS(int asientos, int precioXs, int posiciones, int maletas, int numMaleta,
            int maletaDocumentada,
            int numMaletaDocumentada) {

        double precioFinalXs = 0;

        if (asientos == 1) {

            if (posiciones == 1 || posiciones == 3) {

                if (maletas == 1) {
                    if (maletaDocumentada == 1) {

                        precioFinalXs = 65000 + 50000 + 100000 + precioXs;

                    } else if (maletaDocumentada == 2) {

                        precioFinalXs = 65000 + 50000 + precioXs;
                    }

                } else if (maletas == 2) {

                    if (maletaDocumentada == 1) {

                        precioFinalXs = 65000 + 100000 + precioXs;

                    } else if (maletaDocumentada == 2) {

                        precioFinalXs = 65000 + precioXs;
                    }

                }

            } else if (posiciones == 2) {

                if (maletas == 1) {
                    if (maletaDocumentada == 1) {

                        precioFinalXs = 50000 + 50000 + 100000 + precioXs;

                    } else if (maletaDocumentada == 2) {
                        precioFinalXs = 50000 + 50000 + precioXs;
                    }

                } else if (maletas == 2) {
                    if (maletaDocumentada == 1) {
                        precioFinalXs = 50000 + 100000 + precioXs;

                    } else if (maletaDocumentada == 2) {
                        precioFinalXs = 50000 + precioXs;

                    }

                }
            }

        } else if (asientos == 2) {
            if (maletas == 1) {
                if (maletaDocumentada == 1) {

                    precioFinalXs = 50000 + 100000 + precioXs;

                } else if (maletaDocumentada == 2) {
                    precioFinalXs = 50000 + precioXs;

                }

            } else if (maletas == 2) {
                if (maletaDocumentada == 1) {
                    precioFinalXs = 100000 + precioXs;

                } else if (maletaDocumentada == 2) {
                    precioFinalXs = precioXs;

                }

            }
        }

        return precioFinalXs;
    }

    public static double arreglosS(int asientos, int precioXs, int posiciones, int maletas, int numMaleta,
            int maletaDocumentada,
            int numMaletaDocumentada) {
        double precioFinalS = precioXs + (0.25 * precioXs);

        double precioFinalS_2 = 0;

        if (asientos == 1) {

            if (posiciones == 1 || posiciones == 3) {

                if (maletas == 1) {
                    if (maletaDocumentada == 1) {

                        precioFinalS_2 = 65000 + 50000 + 100000 + precioFinalS;

                    } else if (maletaDocumentada == 2) {

                        precioFinalS_2 = 65000 + 50000 + precioFinalS;
                    }

                } else if (maletas == 2) {

                    if (maletaDocumentada == 1) {

                        precioFinalS_2 = 65000 + 100000 + precioFinalS;

                    } else if (maletaDocumentada == 2) {

                        precioFinalS_2 = 65000 + precioFinalS;
                    }

                }

            } else if (posiciones == 2) {

                if (maletas == 1) {
                    if (maletaDocumentada == 1) {

                        precioFinalS_2 = 50000 + 50000 + 100000 + precioFinalS;

                    } else if (maletaDocumentada == 2) {
                        precioFinalS_2 = 50000 + 50000 + precioFinalS;
                    }

                } else if (maletas == 2) {
                    if (maletaDocumentada == 1) {
                        precioFinalS_2 = 50000 + 100000 + precioFinalS;

                    } else if (maletaDocumentada == 2) {
                        precioFinalS_2 = 50000 + precioFinalS;

                    }

                }
            }

        } else if (asientos == 2) {
            if (maletas == 1) {
                if (maletaDocumentada == 1) {

                    precioFinalS_2 = 50000 + 100000 + precioFinalS;

                } else if (maletaDocumentada == 2) {
                    precioFinalS_2 = 50000 + precioFinalS;

                }

            } else if (maletas == 2) {
                if (maletaDocumentada == 1) {
                    precioFinalS_2 = 100000 + precioFinalS;

                } else if (maletaDocumentada == 2) {
                    precioFinalS_2 = precioFinalS;

                }

            }
        }

        return precioFinalS_2;

    }

    public static double arreglosM(int precioXs, int posicion, int maleta, int numMaleta, int maletaDocumentada,
            int numMaletaDocumentada) {

        double precioFinalM = precioXs + (0.30 * precioXs);

        double precioFinalM_2 = 0;

        if (posicion == 1 || posicion == 3) {

            if (maleta == 1) {

                if (maletaDocumentada == 1) {

                    precioFinalM_2 = (50000 + 100000 + 15000) + precioFinalM;

                } else if (maletaDocumentada == 2) {

                    precioFinalM_2 = (50000 + 15000) + precioFinalM;
                }

            } else if (maleta == 2) {

                if (maletaDocumentada == 1) {

                    precioFinalM_2 = (100000 + 15000) + precioFinalM;

                } else if (maletaDocumentada == 2) {

                    precioFinalM_2 = 15000 + precioFinalM;

                }

            }

        } else if (posicion == 2) {

            if (maleta == 1) {

                if (maletaDocumentada == 1) {

                    precioFinalM_2 = (50000 + 100000) + precioFinalM;

                } else if (maletaDocumentada == 2) {

                    precioFinalM_2 = 50000 + precioFinalM;
                }

            } else if (maleta == 2) {

                if (maletaDocumentada == 1) {

                    precioFinalM_2 = 100000 + precioFinalM;

                } else if (maletaDocumentada == 2) {

                    precioFinalM_2 = precioFinalM;

                }

            }

        }

        return precioFinalM_2;

    }

}
