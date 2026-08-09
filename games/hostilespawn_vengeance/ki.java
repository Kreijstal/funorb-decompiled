/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static bd field_b;
    static String field_a;
    static bd field_c;
    static fk field_f;
    static bd field_e;
    static String field_d;

    final static void a(int param0) {
        g.a((byte) 2, 17);
        if (param0 != -1) {
            field_c = (bd) null;
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, byte param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = se.field_h.getGraphics();
                  if (vh.field_d == null) {
                    vh.field_d = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param0) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, hf.field_h, qc.field_s);
                    break L3;
                  }
                }
                L4: {
                  if (param3 == null) {
                    param3 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null != he.field_y) {
                        break L6;
                      } else {
                        he.field_y = se.field_h.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = he.field_y.getGraphics();
                    var10.setColor(param3);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param1, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param1 * 3 + 2, 2, 300 - param1 * 3, 30);
                    var10.setFont(vh.field_d);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, (-(6 * param2.length()) + 304) / 2, 22);
                    var9.drawImage(he.field_y, -152 + hf.field_h / 2, qc.field_s / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + hf.field_h / 2;
                    var8 = -18 + qc.field_s / 2;
                    var9.setColor(param3);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, 2 + var8, 3 * param1, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(param1 * 3 + (var7 + 2), 2 + var8, -(3 * param1) + 300, 30);
                    var9.setFont(vh.field_d);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, (304 + -(param2.length() * 6)) / 2 + var7, var8 - -22);
                    break L7;
                  }
                }
                L8: {
                  var6 = 50 % ((param4 - -62) / 50);
                  if (ed.field_e != null) {
                    var9.setFont(vh.field_d);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(ed.field_e, hf.field_h / 2 + -(ed.field_e.length() * 6 / 2), qc.field_s / 2 + -26);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                se.field_h.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L11;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, bd param7) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        String stackIn_206_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        double var32 = 0.0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        var47 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (0 == param5) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8_int = param7.field_w;
                var9 = param7.field_y;
                var10 = param7.field_z;
                var11 = param7.field_A;
                var12 = param7.field_D;
                param0 = param0 - (var9 << 1411782308);
                param1 = param1 - (var8_int << 582665188);
                var15 = (double)(param6 & 65535) * 0.00009587379924285257;
                var17 = (int)Math.floor(Math.sin(var15) * (double)param5 + 0.5);
                var18 = (int)Math.floor(0.5 + Math.cos(var15) * (double)param5);
                var19 = var18 * -param1 + var17 * -param0;
                var20 = -param0 * var18 + --param1 * var17;
                var21 = (-param1 + (var10 << -702722172)) * var18 - -(-param0 * var17);
                var22 = var17 * -((var10 << 766581252) - param1) + var18 * -param0;
                var23 = (-param0 + (var11 << 2116824548)) * var17 + -param1 * var18;
                var24 = var18 * ((var11 << -2028365148) - param0) + var17 * --param1;
                var25 = var17 * (-param0 + (var11 << 645919812)) + var18 * ((var10 << -1985413212) - param1);
                if (!param3) {
                  break L1;
                } else {
                  ki.a(-102);
                  break L1;
                }
              }
              L2: {
                var26 = (-param0 + (var11 << 1897008580)) * var18 + -((var10 << -1625391868) - param1) * var17;
                if (var19 < var21) {
                  var28 = var21;
                  var27 = var19;
                  break L2;
                } else {
                  var28 = var19;
                  var27 = var21;
                  break L2;
                }
              }
              L3: {
                if (var27 > var23) {
                  var27 = var23;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var27 <= var25) {
                  break L4;
                } else {
                  var27 = var25;
                  break L4;
                }
              }
              L5: {
                if (var28 >= var23) {
                  break L5;
                } else {
                  var28 = var23;
                  break L5;
                }
              }
              L6: {
                if (var28 < var25) {
                  var28 = var25;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var20 < var22) {
                  var29 = var20;
                  var30 = var22;
                  break L7;
                } else {
                  var29 = var22;
                  var30 = var20;
                  break L7;
                }
              }
              L8: {
                if (var24 < var29) {
                  var29 = var24;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var26 >= var29) {
                  break L9;
                } else {
                  var29 = var26;
                  break L9;
                }
              }
              L10: {
                if (var30 >= var24) {
                  break L10;
                } else {
                  var30 = var24;
                  break L10;
                }
              }
              L11: {
                var28 = var28 - -4095 >> -1568099700;
                if (var30 >= var26) {
                  break L11;
                } else {
                  var30 = var26;
                  break L11;
                }
              }
              L12: {
                var29 = var29 >> 12;
                var27 = var27 >> 12;
                var28 = var28 + param4;
                var27 = var27 + param4;
                var30 = var30 - -4095 >> 1834103244;
                var29 = var29 + param2;
                var27 = var27 >> 4;
                var28 = var28 + 15 >> 1405596932;
                var29 = var29 >> 4;
                var30 = var30 + param2;
                if (var28 <= si.field_l) {
                  break L12;
                } else {
                  var28 = si.field_l;
                  break L12;
                }
              }
              L13: {
                if (var27 >= si.field_b) {
                  break L13;
                } else {
                  var27 = si.field_b;
                  break L13;
                }
              }
              L14: {
                if (var29 < si.field_j) {
                  var29 = si.field_j;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var30 = 15 + var30 >> 176975972;
                var28 = -var28 + var27;
                if (var30 > si.field_a) {
                  var30 = si.field_a;
                  break L15;
                } else {
                  break L15;
                }
              }
              if (var28 >= 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var30 = -var30 + var29;
                if ((var30 ^ -1) <= -1) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L16: {
                    var31 = var27 + var29 * si.field_e;
                    var32 = 16777216.0 / (double)param5;
                    var34 = (int)Math.floor(var32 * Math.sin(var15) + 0.5);
                    var35 = (int)Math.floor(0.5 + Math.cos(var15) * var32);
                    var36 = -param4 + (8 + (var27 << 1660450692));
                    var37 = 8 + (var29 << 838599876) - param2;
                    var38 = (param1 << 2017259016) + -(var37 * var34 >> -1252754108);
                    var39 = (param0 << -1570622296) + (var37 * var35 >> -1574138460);
                    if (0 != var35) {
                      if (-1 >= (var35 ^ -1)) {
                        if (var34 == 0) {
                          var41 = var30;
                          L17: while (true) {
                            if ((var41 ^ -1) <= -1) {
                              break L16;
                            } else {
                              L18: {
                                var42 = var31;
                                var43 = var38 + (var35 * var36 >> -1012166364);
                                var44 = var39;
                                var45 = var28;
                                if ((var44 ^ -1) <= -1) {
                                  if (-1 >= (var44 - (var11 << -201396660) ^ -1)) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if ((var43 ^ -1) <= -1) {
                                        break L19;
                                      } else {
                                        var40 = (-1 + (var35 - var43)) / var35;
                                        var45 = var45 + var40;
                                        var43 = var43 + var35 * var40;
                                        var42 = var42 + var40;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      var40 = (-var35 + -(var10 << 1280773868) + 1 + var43) / var35;
                                      if (var45 >= (-var35 + -(var10 << 1280773868) + 1 + var43) / var35) {
                                        break L20;
                                      } else {
                                        var45 = var40;
                                        break L20;
                                      }
                                    }
                                    L21: while (true) {
                                      if ((var45 ^ -1) <= -1) {
                                        break L18;
                                      } else {
                                        L22: {
                                          var46 = var12[var10 * (var44 >> 2075591276) + (var43 >> 886140940)];
                                          var43 = var43 + var35;
                                          if (var46 == 0) {
                                            var42++;
                                            break L22;
                                          } else {
                                            var14 = si.field_i[var42];
                                            var13 = var14 + var46;
                                            var46 = (16711935 & var14) + (var46 & 16711935);
                                            var14 = (var13 + -var46 & 65536) + (var46 & 16777472);
                                            incrementValue$0 = var42;
                                            var42++;
                                            si.field_i[incrementValue$0] = ll.a(-(var14 >>> -1166917432) + var14, -var14 + var13);
                                            break L22;
                                          }
                                        }
                                        var45++;
                                        continue L21;
                                      }
                                    }
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              var41++;
                              var39 = var39 + var35;
                              var31 = var31 + si.field_e;
                              continue L17;
                            }
                          }
                        } else {
                          if ((var34 ^ -1) > -1) {
                            var41 = var30;
                            L23: while (true) {
                              if ((var41 ^ -1) <= -1) {
                                break L16;
                              } else {
                                L24: {
                                  var42 = var31;
                                  var43 = (var36 * var35 >> 744116260) + var38;
                                  var44 = var39 - -(var34 * var36 >> 255290500);
                                  var45 = var28;
                                  if ((var43 ^ -1) <= -1) {
                                    break L24;
                                  } else {
                                    var40 = (var35 - (1 + var43)) / var35;
                                    var45 = var45 + var40;
                                    var43 = var43 + var35 * var40;
                                    var44 = var44 + var34 * var40;
                                    var42 = var42 + var40;
                                    break L24;
                                  }
                                }
                                L25: {
                                  var40 = (var43 + 1 - ((var10 << 1502211948) + var35)) / var35;
                                  if ((var43 + 1 - ((var10 << 1502211948) + var35)) / var35 <= var45) {
                                    break L25;
                                  } else {
                                    var45 = var40;
                                    break L25;
                                  }
                                }
                                L26: {
                                  var40 = -(var11 << -1092766932) + var44;
                                  if (0 <= -(var11 << -1092766932) + var44) {
                                    var40 = (var34 + -var40) / var34;
                                    var45 = var45 + var40;
                                    var44 = var44 + var34 * var40;
                                    var43 = var43 + var40 * var35;
                                    var42 = var42 + var40;
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                                L27: {
                                  var40 = (var44 + -var34) / var34;
                                  if (var45 >= (var44 + -var34) / var34) {
                                    break L27;
                                  } else {
                                    var45 = var40;
                                    break L27;
                                  }
                                }
                                L28: while (true) {
                                  if (var45 >= 0) {
                                    var38 = var38 - var34;
                                    var31 = var31 + si.field_e;
                                    var41++;
                                    var39 = var39 + var35;
                                    continue L23;
                                  } else {
                                    L29: {
                                      var46 = var12[(var43 >> 632654604) + var10 * (var44 >> 352520172)];
                                      var44 = var44 + var34;
                                      var43 = var43 + var35;
                                      if ((var46 ^ -1) != -1) {
                                        var14 = si.field_i[var42];
                                        var13 = var46 + var14;
                                        var46 = (var46 & 16711935) + (16711935 & var14);
                                        var14 = (16777472 & var46) - -(65536 & -var46 + var13);
                                        incrementValue$1 = var42;
                                        var42++;
                                        si.field_i[incrementValue$1] = ll.a(var14 - (var14 >>> -1132959384), -var14 + var13);
                                        break L29;
                                      } else {
                                        var42++;
                                        break L29;
                                      }
                                    }
                                    var45++;
                                    continue L28;
                                  }
                                }
                              }
                            }
                          } else {
                            var41 = var30;
                            L30: while (true) {
                              if (0 <= var41) {
                                break L16;
                              } else {
                                L31: {
                                  var42 = var31;
                                  var43 = var38 - -(var35 * var36 >> 1887328644);
                                  var44 = (var34 * var36 >> 1931287844) + var39;
                                  var45 = var28;
                                  if (0 > var43) {
                                    var40 = (var35 + (-1 + -var43)) / var35;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    var44 = var44 + var34 * var40;
                                    var43 = var43 + var40 * var35;
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                                L32: {
                                  var40 = (-(var10 << -632765396) + (var43 + 1 + -var35)) / var35;
                                  if ((-(var10 << -632765396) + (var43 + 1 + -var35)) / var35 <= var45) {
                                    break L32;
                                  } else {
                                    var45 = var40;
                                    break L32;
                                  }
                                }
                                L33: {
                                  if (-1 < (var44 ^ -1)) {
                                    var40 = (-var44 + var34 - 1) / var34;
                                    var43 = var43 + var40 * var35;
                                    var44 = var44 + var34 * var40;
                                    var45 = var45 + var40;
                                    var42 = var42 + var40;
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                                L34: {
                                  var40 = (-var34 + (var44 + 1) + -(var11 << -152371700)) / var34;
                                  if ((-var34 + (var44 + 1) + -(var11 << -152371700)) / var34 > var45) {
                                    var45 = var40;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                L35: while (true) {
                                  if ((var45 ^ -1) <= -1) {
                                    var31 = var31 + si.field_e;
                                    var41++;
                                    var38 = var38 - var34;
                                    var39 = var39 + var35;
                                    continue L30;
                                  } else {
                                    L36: {
                                      var46 = var12[(var43 >> -892783380) + var10 * (var44 >> -1714768596)];
                                      var43 = var43 + var35;
                                      var44 = var44 + var34;
                                      if ((var46 ^ -1) != -1) {
                                        var14 = si.field_i[var42];
                                        var13 = var14 + var46;
                                        var46 = (16711935 & var46) - -(var14 & 16711935);
                                        var14 = (65536 & -var46 + var13) + (var46 & 16777472);
                                        incrementValue$2 = var42;
                                        var42++;
                                        si.field_i[incrementValue$2] = ll.a(var13 - var14, var14 + -(var14 >>> -1614577016));
                                        break L36;
                                      } else {
                                        var42++;
                                        break L36;
                                      }
                                    }
                                    var45++;
                                    continue L35;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (var34 == 0) {
                          var41 = var30;
                          L37: while (true) {
                            if (-1 >= (var41 ^ -1)) {
                              break L16;
                            } else {
                              L38: {
                                var42 = var31;
                                var43 = (var35 * var36 >> 1090573988) + var38;
                                var44 = var39;
                                var45 = var28;
                                if ((var44 ^ -1) > -1) {
                                  break L38;
                                } else {
                                  if (0 <= var44 - (var11 << 916377932)) {
                                    break L38;
                                  } else {
                                    L39: {
                                      var40 = var43 + -(var10 << 821807308);
                                      if (var43 + -(var10 << 821807308) >= 0) {
                                        var40 = (var35 + -var40) / var35;
                                        var42 = var42 + var40;
                                        var43 = var43 + var40 * var35;
                                        var45 = var45 + var40;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      var40 = (var43 + -var35) / var35;
                                      if (var45 < (var43 + -var35) / var35) {
                                        var45 = var40;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    L41: while (true) {
                                      if (var45 >= 0) {
                                        break L38;
                                      } else {
                                        L42: {
                                          var46 = var12[(var43 >> -926819540) + var10 * (var44 >> -600506676)];
                                          if (var46 != 0) {
                                            var14 = si.field_i[var42];
                                            var13 = var14 + var46;
                                            var46 = (16711935 & var14) + (16711935 & var46);
                                            var14 = (16777472 & var46) - -(65536 & var13 - var46);
                                            incrementValue$3 = var42;
                                            var42++;
                                            si.field_i[incrementValue$3] = ll.a(-var14 + var13, -(var14 >>> 1826620456) + var14);
                                            break L42;
                                          } else {
                                            var42++;
                                            break L42;
                                          }
                                        }
                                        var43 = var43 + var35;
                                        var45++;
                                        continue L41;
                                      }
                                    }
                                  }
                                }
                              }
                              var39 = var39 + var35;
                              var41++;
                              var31 = var31 + si.field_e;
                              continue L37;
                            }
                          }
                        } else {
                          if (-1 < (var34 ^ -1)) {
                            var41 = var30;
                            L43: while (true) {
                              if ((var41 ^ -1) <= -1) {
                                break L16;
                              } else {
                                L44: {
                                  var42 = var31;
                                  var43 = (var36 * var35 >> 1143202148) + var38;
                                  var44 = var39 + (var34 * var36 >> -1943006940);
                                  var45 = var28;
                                  var40 = var43 - (var10 << -1095855348);
                                  if (var43 - (var10 << -1095855348) < 0) {
                                    break L44;
                                  } else {
                                    var40 = (-var40 + var35) / var35;
                                    var44 = var44 + var40 * var34;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    var43 = var43 + var40 * var35;
                                    break L44;
                                  }
                                }
                                L45: {
                                  var40 = (var43 - var35) / var35;
                                  if ((var43 - var35) / var35 <= var45) {
                                    break L45;
                                  } else {
                                    var45 = var40;
                                    break L45;
                                  }
                                }
                                L46: {
                                  var40 = -(var11 << -1965792820) + var44;
                                  if (-(var11 << -1965792820) + var44 < 0) {
                                    break L46;
                                  } else {
                                    var40 = (-var40 + var34) / var34;
                                    var45 = var45 + var40;
                                    var43 = var43 + var35 * var40;
                                    var44 = var44 + var34 * var40;
                                    var42 = var42 + var40;
                                    break L46;
                                  }
                                }
                                L47: {
                                  var40 = (var44 - var34) / var34;
                                  if ((var44 - var34) / var34 <= var45) {
                                    break L47;
                                  } else {
                                    var45 = var40;
                                    break L47;
                                  }
                                }
                                L48: while (true) {
                                  if (0 <= var45) {
                                    var39 = var39 + var35;
                                    var38 = var38 - var34;
                                    var41++;
                                    var31 = var31 + si.field_e;
                                    continue L43;
                                  } else {
                                    L49: {
                                      var46 = var12[(var43 >> 231383212) + var10 * (var44 >> -295024212)];
                                      var44 = var44 + var34;
                                      var43 = var43 + var35;
                                      if (0 != var46) {
                                        var14 = si.field_i[var42];
                                        var13 = var14 + var46;
                                        var46 = (16711935 & var46) + (16711935 & var14);
                                        var14 = (16777472 & var46) - -(var13 - var46 & 65536);
                                        incrementValue$4 = var42;
                                        var42++;
                                        si.field_i[incrementValue$4] = ll.a(var14 + -(var14 >>> -20813368), var13 + -var14);
                                        break L49;
                                      } else {
                                        var42++;
                                        break L49;
                                      }
                                    }
                                    var45++;
                                    continue L48;
                                  }
                                }
                              }
                            }
                          } else {
                            var41 = var30;
                            L50: while (true) {
                              if (-1 >= (var41 ^ -1)) {
                                break L16;
                              } else {
                                L51: {
                                  var42 = var31;
                                  var43 = (var36 * var35 >> -1581188732) + var38;
                                  var44 = var39 - -(var36 * var34 >> -881786076);
                                  var45 = var28;
                                  var40 = var43 + -(var10 << 160731116);
                                  if (var43 + -(var10 << 160731116) < 0) {
                                    break L51;
                                  } else {
                                    var40 = (var35 - var40) / var35;
                                    var44 = var44 + var34 * var40;
                                    var42 = var42 + var40;
                                    var43 = var43 + var40 * var35;
                                    var45 = var45 + var40;
                                    break L51;
                                  }
                                }
                                L52: {
                                  var40 = (var43 + -var35) / var35;
                                  if ((var43 + -var35) / var35 > var45) {
                                    var45 = var40;
                                    break L52;
                                  } else {
                                    break L52;
                                  }
                                }
                                L53: {
                                  if (-1 >= (var44 ^ -1)) {
                                    break L53;
                                  } else {
                                    var40 = (-var44 + (var34 - 1)) / var34;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    var44 = var44 + var34 * var40;
                                    var43 = var43 + var40 * var35;
                                    break L53;
                                  }
                                }
                                L54: {
                                  var40 = (-var34 + (-(var11 << 1924726188) + (1 + var44))) / var34;
                                  if ((-var34 + (-(var11 << 1924726188) + (1 + var44))) / var34 <= var45) {
                                    break L54;
                                  } else {
                                    var45 = var40;
                                    break L54;
                                  }
                                }
                                L55: while (true) {
                                  if ((var45 ^ -1) <= -1) {
                                    var39 = var39 + var35;
                                    var38 = var38 - var34;
                                    var31 = var31 + si.field_e;
                                    var41++;
                                    continue L50;
                                  } else {
                                    L56: {
                                      var46 = var12[(var44 >> 1829781708) * var10 - -(var43 >> -668365396)];
                                      var43 = var43 + var35;
                                      var44 = var44 + var34;
                                      if (-1 != (var46 ^ -1)) {
                                        var14 = si.field_i[var42];
                                        var13 = var46 - -var14;
                                        var46 = (16711935 & var14) + (16711935 & var46);
                                        var14 = (var13 + -var46 & 65536) + (var46 & 16777472);
                                        incrementValue$5 = var42;
                                        var42++;
                                        si.field_i[incrementValue$5] = ll.a(var14 + -(var14 >>> -562217176), var13 + -var14);
                                        break L56;
                                      } else {
                                        var42++;
                                        break L56;
                                      }
                                    }
                                    var45++;
                                    continue L55;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (-1 == (var34 ^ -1)) {
                        var41 = var30;
                        L57: while (true) {
                          if (0 <= var41) {
                            break L16;
                          } else {
                            L58: {
                              var42 = var31;
                              var43 = var38;
                              var44 = var39;
                              var45 = var28;
                              if (-1 >= (var43 ^ -1)) {
                                if ((var44 ^ -1) <= -1) {
                                  if ((-(var10 << 1958872652) + var43 ^ -1) > -1) {
                                    if (-1 >= (var44 + -(var11 << -1619782964) ^ -1)) {
                                      break L58;
                                    } else {
                                      L59: while (true) {
                                        if (-1 >= (var45 ^ -1)) {
                                          break L58;
                                        } else {
                                          L60: {
                                            var46 = var12[(var43 >> -690199892) + (var44 >> 1151898732) * var10];
                                            if (-1 == (var46 ^ -1)) {
                                              var42++;
                                              break L60;
                                            } else {
                                              var14 = si.field_i[var42];
                                              var13 = var46 - -var14;
                                              var46 = (16711935 & var46) - -(16711935 & var14);
                                              var14 = (var46 & 16777472) + (-var46 + var13 & 65536);
                                              incrementValue$6 = var42;
                                              var42++;
                                              si.field_i[incrementValue$6] = ll.a(var13 - var14, -(var14 >>> -1858362648) + var14);
                                              break L60;
                                            }
                                          }
                                          var45++;
                                          continue L59;
                                        }
                                      }
                                    }
                                  } else {
                                    break L58;
                                  }
                                } else {
                                  break L58;
                                }
                              } else {
                                break L58;
                              }
                            }
                            var41++;
                            var31 = var31 + si.field_e;
                            continue L57;
                          }
                        }
                      } else {
                        if (-1 >= (var34 ^ -1)) {
                          var41 = var30;
                          L61: while (true) {
                            if (0 <= var41) {
                              break L16;
                            } else {
                              L62: {
                                var42 = var31;
                                var43 = var38;
                                var44 = var39 + (var36 * var34 >> 1943614692);
                                var45 = var28;
                                if (var43 < 0) {
                                  break L62;
                                } else {
                                  if (0 > var43 - (var10 << -886203476)) {
                                    L63: {
                                      if (-1 >= (var44 ^ -1)) {
                                        break L63;
                                      } else {
                                        var40 = (-1 + (var34 + -var44)) / var34;
                                        var44 = var44 + var40 * var34;
                                        var42 = var42 + var40;
                                        var45 = var45 + var40;
                                        break L63;
                                      }
                                    }
                                    L64: {
                                      var40 = (-var34 + var44 + (1 - (var11 << -1332892276))) / var34;
                                      if (var45 < (-var34 + var44 + (1 - (var11 << -1332892276))) / var34) {
                                        var45 = var40;
                                        break L64;
                                      } else {
                                        break L64;
                                      }
                                    }
                                    L65: while (true) {
                                      if (-1 >= (var45 ^ -1)) {
                                        break L62;
                                      } else {
                                        L66: {
                                          var46 = var12[(var43 >> -284943220) + var10 * (var44 >> 737028428)];
                                          if (var46 != 0) {
                                            var14 = si.field_i[var42];
                                            var13 = var46 + var14;
                                            var46 = (16711935 & var14) + (var46 & 16711935);
                                            var14 = (var46 & 16777472) - -(var13 + -var46 & 65536);
                                            incrementValue$7 = var42;
                                            var42++;
                                            si.field_i[incrementValue$7] = ll.a(-(var14 >>> 1731114472) + var14, -var14 + var13);
                                            break L66;
                                          } else {
                                            var42++;
                                            break L66;
                                          }
                                        }
                                        var44 = var44 + var34;
                                        var45++;
                                        continue L65;
                                      }
                                    }
                                  } else {
                                    break L62;
                                  }
                                }
                              }
                              var41++;
                              var31 = var31 + si.field_e;
                              var38 = var38 - var34;
                              continue L61;
                            }
                          }
                        } else {
                          var41 = var30;
                          L67: while (true) {
                            if (0 <= var41) {
                              break L16;
                            } else {
                              L68: {
                                var42 = var31;
                                var43 = var38;
                                var44 = (var34 * var36 >> -781675420) + var39;
                                var45 = var28;
                                if (0 <= var43) {
                                  if ((-(var10 << -2125681812) + var43 ^ -1) <= -1) {
                                    break L68;
                                  } else {
                                    L69: {
                                      var40 = -(var11 << 444537740) + var44;
                                      if (0 > -(var11 << 444537740) + var44) {
                                        break L69;
                                      } else {
                                        var40 = (-var40 + var34) / var34;
                                        var44 = var44 + var40 * var34;
                                        var42 = var42 + var40;
                                        var45 = var45 + var40;
                                        break L69;
                                      }
                                    }
                                    L70: {
                                      var40 = (-var34 + var44) / var34;
                                      if (var45 >= (-var34 + var44) / var34) {
                                        break L70;
                                      } else {
                                        var45 = var40;
                                        break L70;
                                      }
                                    }
                                    L71: while (true) {
                                      if (0 <= var45) {
                                        break L68;
                                      } else {
                                        L72: {
                                          var46 = var12[(var43 >> -888437012) + var10 * (var44 >> -95983060)];
                                          var44 = var44 + var34;
                                          if (0 != var46) {
                                            var14 = si.field_i[var42];
                                            var13 = var14 + var46;
                                            var46 = (16711935 & var14) + (16711935 & var46);
                                            var14 = (var13 - var46 & 65536) + (var46 & 16777472);
                                            incrementValue$8 = var42;
                                            var42++;
                                            si.field_i[incrementValue$8] = ll.a(-var14 + var13, var14 + -(var14 >>> 449735176));
                                            break L72;
                                          } else {
                                            var42++;
                                            break L72;
                                          }
                                        }
                                        var45++;
                                        continue L71;
                                      }
                                    }
                                  }
                                } else {
                                  break L68;
                                }
                              }
                              var41++;
                              var31 = var31 + si.field_e;
                              var38 = var38 - var34;
                              continue L67;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L73: {
            var8 = decompiledCaughtException;
            stackIn_205_0 = (RuntimeException) (var8);

            stackIn_205_1 = new StringBuilder().append("ki.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_206_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackIn_206_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackIn_206_2 = "null";
              break L73;
            } else {
              stackIn_206_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackIn_206_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackIn_206_2 = "{...}";
              break L73;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_206_0), stackIn_206_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    static {
        field_a = "Your objective is to bring the ship's reactor back online. You can press <img=0> to view your objectives at any time. The location of your current objective is shown by the yellow pointer.";
        field_d = "Par time: <col=ffffff>";
    }
}
