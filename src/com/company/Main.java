package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int month,day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğdugunuz ay : ");
        month = input.nextInt();

        System.out.println("Doğdugunuz gün : ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "oğlak";
                } else {
                    burc = "kova";
                }
            } else {
                isError = true;
            }
        }


            if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Burcunuz Kova.";

                    } else {
                        burc = "Burcunuz Balık.";
                    }
                } else {
                    isError = true;
                }
            }

                if (month == 3) {
                    if (day >= 1 && day <= 31) {
                        if (day < 21) {
                            burc = "Burcunuz Balık.";

                        } else {
                            burc = "Burcunuz Koç.";
                        }
                    } else {
                        isError = true;
                    }
                }

            if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Burcunuz Koç.";
                    } else {
                        burc = "Burcunuz Boğa.";
                    }
                } else {
                    isError = true;
                }
            }

            if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Burcunuz Boğa.";
                    } else {
                        burc = "Burcunuz İkizler.";
                    }
                } else {
                    isError = true;
                }
            }

        if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Burcunuz İkizler.";
                } else {
                    burc = "Burcunuz Yengeç.";
                }
            } else {
                isError = true;
            }
        }

        if (month == 7 ) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Burcunuz Yengeç.";
                } else {
                    burc = "Burcunuz Aslan.";
                }
            } else {
                isError = true;
            }
        }

        if (month == 8 ) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Burcunuz Aslan.";
                } else {
                    burc = "Burcunuz Başak.";
                }
            } else {
                isError = true;
            }
        }

        if (month == 9 ) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Burcunuz Başak.";
                } else {
                    burc = "Burcunuz Terazi.";
                }
            } else {
                isError = true;
            }
        }

        if (month == 10 ) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Burcunuz Terazi. ";
                } else {
                    burc = "Burcunuz Akrep.";
                }
            } else {
                isError = true;
            }
        }

        if (month == 11 ) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Burcunuz Akrep. ";
                } else {
                    burc = "Burcunuz Yay.";
                }
            } else {
                isError = true;
            }
        }

        if (month == 12 ) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Burcunuz Yay. ";
                } else {
                    burc = "Burcunuz Oğlak.3" +
                            "";
                }
            } else {
                isError = true;
            }
        }



        System.out.println(burc);
            if (isError) {
                System.out.println("Hatalı bir giriş yaptınız tekrar deneyiniz!");
            }
        }




    }

