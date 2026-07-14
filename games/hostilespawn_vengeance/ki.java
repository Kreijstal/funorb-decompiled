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
            field_c = null;
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, byte param4) {
        Exception var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var9 = se.field_h.getGraphics();
                        if (vh.field_d == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vh.field_d = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, hf.field_h, qc.field_s);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param3 == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param3 = new java.awt.Color(140, 17, 17);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null != he.field_y) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        he.field_y = se.field_h.createImage(304, 34);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
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
                        boolean discarded$2 = var9.drawImage(he.field_y, -152 + hf.field_h / 2, qc.field_s / 2 + -18, (java.awt.image.ImageObserver) null);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_ref_Exception = (Exception) (Object) caughtException;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = 50 % ((param4 - -62) / 50);
                        if (ed.field_e != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9.setFont(vh.field_d);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(ed.field_e, hf.field_h / 2 + -(ed.field_e.length() * 6 / 2), qc.field_s / 2 + -26);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (Exception) (Object) caughtException;
                    se.field_h.repaint();
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, bd param7) {
        int var8 = 0;
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
        if (0 == param5) {
          return;
        } else {
          L0: {
            var8 = param7.field_w;
            var9 = param7.field_y;
            var10 = param7.field_z;
            var11 = param7.field_A;
            var12 = param7.field_D;
            param0 = param0 - (var9 << 1411782308);
            param1 = param1 - (var8 << 582665188);
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
              break L0;
            } else {
              ki.a(-102);
              break L0;
            }
          }
          L1: {
            var26 = (-param0 + (var11 << 1897008580)) * var18 + -((var10 << -1625391868) - param1) * var17;
            if (var19 < var21) {
              var28 = var21;
              var27 = var19;
              break L1;
            } else {
              var28 = var19;
              var27 = var21;
              break L1;
            }
          }
          L2: {
            if (var27 > var23) {
              var27 = var23;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var27 <= var25) {
              break L3;
            } else {
              var27 = var25;
              break L3;
            }
          }
          L4: {
            if (var28 >= var23) {
              break L4;
            } else {
              var28 = var23;
              break L4;
            }
          }
          L5: {
            if (var28 < var25) {
              var28 = var25;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (var20 < var22) {
              var29 = var20;
              var30 = var22;
              break L6;
            } else {
              var29 = var22;
              var30 = var20;
              break L6;
            }
          }
          L7: {
            if (var24 < var29) {
              var29 = var24;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (var26 >= var29) {
              break L8;
            } else {
              var29 = var26;
              break L8;
            }
          }
          L9: {
            if (var30 >= var24) {
              break L9;
            } else {
              var30 = var24;
              break L9;
            }
          }
          L10: {
            var28 = var28 - -4095 >> -1568099700;
            if (var30 >= var26) {
              break L10;
            } else {
              var30 = var26;
              break L10;
            }
          }
          L11: {
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
              break L11;
            } else {
              var28 = si.field_l;
              break L11;
            }
          }
          L12: {
            if (var27 >= si.field_b) {
              break L12;
            } else {
              var27 = si.field_b;
              break L12;
            }
          }
          L13: {
            if (var29 < si.field_j) {
              var29 = si.field_j;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            var30 = 15 + var30 >> 176975972;
            var28 = -var28 + var27;
            if (var30 > si.field_a) {
              var30 = si.field_a;
              break L14;
            } else {
              break L14;
            }
          }
          if (var28 >= 0) {
            return;
          } else {
            var30 = -var30 + var29;
            if ((var30 ^ -1) <= -1) {
              return;
            } else {
              L15: {
                var31 = var27 + var29 * si.field_e;
                var32 = 16777216.0 / (double)param5;
                var34 = (int)Math.floor(var32 * Math.sin(var15) + 0.5);
                var35 = (int)Math.floor(0.5 + Math.cos(var15) * var32);
                var36 = -param4 + (8 + (var27 << 1660450692));
                var37 = 8 + (var29 << 838599876) - param2;
                var38 = (param1 << 2017259016) + -(var37 * var34 >> -1252754108);
                var39 = (param0 << -1570622296) + (var37 * var35 >> -1574138460);
                if (0 != var35) {
                  if (-1 >= var35) {
                    if (var34 == 0) {
                      var41 = var30;
                      L16: while (true) {
                        if ((var41 ^ -1) <= -1) {
                          break L15;
                        } else {
                          L17: {
                            var42 = var31;
                            var43 = var38 + (var35 * var36 >> -1012166364);
                            var44 = var39;
                            var45 = var28;
                            if (var44 <= -1) {
                              if (-1 <= var44 - (var11 << -201396660)) {
                                break L17;
                              } else {
                                L18: {
                                  if ((var43 ^ -1) <= -1) {
                                    break L18;
                                  } else {
                                    var40 = (-1 + (var35 - var43)) / var35;
                                    var45 = var45 + var40;
                                    var43 = var43 + var35 * var40;
                                    var42 = var42 + var40;
                                    break L18;
                                  }
                                }
                                L19: {
                                  var40 = (-var35 + -(var10 << 1280773868) + 1 + var43) / var35;
                                  if (var45 >= (-var35 + -(var10 << 1280773868) + 1 + var43) / var35) {
                                    break L19;
                                  } else {
                                    var45 = var40;
                                    break L19;
                                  }
                                }
                                L20: while (true) {
                                  if ((var45 ^ -1) <= -1) {
                                    break L17;
                                  } else {
                                    var46 = var12[var10 * (var44 >> 2075591276) + (var43 >> 886140940)];
                                    var43 = var43 + var35;
                                    if (var46 == 0) {
                                      var42++;
                                      var45++;
                                      continue L20;
                                    } else {
                                      var14 = si.field_i[var42];
                                      var13 = var14 + var46;
                                      var46 = (16711935 & var14) + (var46 & 16711935);
                                      var14 = (var13 + -var46 & 65536) + (var46 & 16777472);
                                      var42++;
                                      si.field_i[var42] = ll.a(-(var14 >>> -1166917432) + var14, -var14 + var13);
                                      var45++;
                                      continue L20;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L17;
                            }
                          }
                          var41++;
                          var39 = var39 + var35;
                          var31 = var31 + si.field_e;
                          continue L16;
                        }
                      }
                    } else {
                      if ((var34 ^ -1) > -1) {
                        var41 = var30;
                        L21: while (true) {
                          if ((var41 ^ -1) <= -1) {
                            break L15;
                          } else {
                            L22: {
                              var42 = var31;
                              var43 = (var36 * var35 >> 744116260) + var38;
                              var44 = var39 - -(var34 * var36 >> 255290500);
                              var45 = var28;
                              if ((var43 ^ -1) <= -1) {
                                break L22;
                              } else {
                                var40 = (var35 - (1 + var43)) / var35;
                                var45 = var45 + var40;
                                var43 = var43 + var35 * var40;
                                var44 = var44 + var34 * var40;
                                var42 = var42 + var40;
                                break L22;
                              }
                            }
                            L23: {
                              var40 = (var43 + 1 - ((var10 << 1502211948) + var35)) / var35;
                              if ((var43 + 1 - ((var10 << 1502211948) + var35)) / var35 <= var45) {
                                break L23;
                              } else {
                                var45 = var40;
                                break L23;
                              }
                            }
                            L24: {
                              var40 = -(var11 << -1092766932) + var44;
                              if (0 <= -(var11 << -1092766932) + var44) {
                                var40 = (var34 + -var40) / var34;
                                var45 = var45 + var40;
                                var44 = var44 + var34 * var40;
                                var43 = var43 + var40 * var35;
                                var42 = var42 + var40;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            L25: {
                              var40 = (var44 + -var34) / var34;
                              if (var45 >= (var44 + -var34) / var34) {
                                break L25;
                              } else {
                                var45 = var40;
                                break L25;
                              }
                            }
                            L26: while (true) {
                              if (var45 >= 0) {
                                var38 = var38 - var34;
                                var31 = var31 + si.field_e;
                                var41++;
                                var39 = var39 + var35;
                                continue L21;
                              } else {
                                var46 = var12[(var43 >> 632654604) + var10 * (var44 >> 352520172)];
                                var44 = var44 + var34;
                                var43 = var43 + var35;
                                if (var46 != 0) {
                                  var14 = si.field_i[var42];
                                  var13 = var46 + var14;
                                  var46 = (var46 & 16711935) + (16711935 & var14);
                                  var14 = (16777472 & var46) - -(65536 & -var46 + var13);
                                  var42++;
                                  si.field_i[var42] = ll.a(var14 - (var14 >>> -1132959384), -var14 + var13);
                                  var45++;
                                  continue L26;
                                } else {
                                  var42++;
                                  var45++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var41 = var30;
                        L27: while (true) {
                          if (0 <= var41) {
                            break L15;
                          } else {
                            L28: {
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
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            L29: {
                              var40 = (-(var10 << -632765396) + (var43 + 1 + -var35)) / var35;
                              if ((-(var10 << -632765396) + (var43 + 1 + -var35)) / var35 <= var45) {
                                break L29;
                              } else {
                                var45 = var40;
                                break L29;
                              }
                            }
                            L30: {
                              if (-1 < (var44 ^ -1)) {
                                var40 = (-var44 + var34 - 1) / var34;
                                var43 = var43 + var40 * var35;
                                var44 = var44 + var34 * var40;
                                var45 = var45 + var40;
                                var42 = var42 + var40;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              var40 = (-var34 + (var44 + 1) + -(var11 << -152371700)) / var34;
                              if ((-var34 + (var44 + 1) + -(var11 << -152371700)) / var34 > var45) {
                                var45 = var40;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            L32: while (true) {
                              if ((var45 ^ -1) <= -1) {
                                var31 = var31 + si.field_e;
                                var41++;
                                var38 = var38 - var34;
                                var39 = var39 + var35;
                                continue L27;
                              } else {
                                var46 = var12[(var43 >> -892783380) + var10 * (var44 >> -1714768596)];
                                var43 = var43 + var35;
                                var44 = var44 + var34;
                                if (var46 != 0) {
                                  var14 = si.field_i[var42];
                                  var13 = var14 + var46;
                                  var46 = (16711935 & var46) - -(var14 & 16711935);
                                  var14 = (65536 & -var46 + var13) + (var46 & 16777472);
                                  var42++;
                                  si.field_i[var42] = ll.a(var13 - var14, var14 + -(var14 >>> -1614577016));
                                  var45++;
                                  continue L32;
                                } else {
                                  var42++;
                                  var45++;
                                  continue L32;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (var34 == 0) {
                      var41 = var30;
                      L33: while (true) {
                        if (-1 >= (var41 ^ -1)) {
                          break L15;
                        } else {
                          L34: {
                            var42 = var31;
                            var43 = (var35 * var36 >> 1090573988) + var38;
                            var44 = var39;
                            var45 = var28;
                            if ((var44 ^ -1) > -1) {
                              break L34;
                            } else {
                              if (0 <= var44 - (var11 << 916377932)) {
                                break L34;
                              } else {
                                L35: {
                                  var40 = var43 + -(var10 << 821807308);
                                  if (var43 + -(var10 << 821807308) >= 0) {
                                    var40 = (var35 + -var40) / var35;
                                    var42 = var42 + var40;
                                    var43 = var43 + var40 * var35;
                                    var45 = var45 + var40;
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                L36: {
                                  var40 = (var43 + -var35) / var35;
                                  if (var45 < (var43 + -var35) / var35) {
                                    var45 = var40;
                                    break L36;
                                  } else {
                                    break L36;
                                  }
                                }
                                L37: while (true) {
                                  if (var45 >= 0) {
                                    break L34;
                                  } else {
                                    L38: {
                                      var46 = var12[(var43 >> -926819540) + var10 * (var44 >> -600506676)];
                                      if (var46 != 0) {
                                        var14 = si.field_i[var42];
                                        var13 = var14 + var46;
                                        var46 = (16711935 & var14) + (16711935 & var46);
                                        var14 = (16777472 & var46) - -(65536 & var13 - var46);
                                        var42++;
                                        si.field_i[var42] = ll.a(-var14 + var13, -(var14 >>> 1826620456) + var14);
                                        break L38;
                                      } else {
                                        var42++;
                                        break L38;
                                      }
                                    }
                                    var43 = var43 + var35;
                                    var45++;
                                    continue L37;
                                  }
                                }
                              }
                            }
                          }
                          var39 = var39 + var35;
                          var41++;
                          var31 = var31 + si.field_e;
                          continue L33;
                        }
                      }
                    } else {
                      if (-1 > var34) {
                        var41 = var30;
                        L39: while (true) {
                          if ((var41 ^ -1) <= -1) {
                            break L15;
                          } else {
                            L40: {
                              var42 = var31;
                              var43 = (var36 * var35 >> 1143202148) + var38;
                              var44 = var39 + (var34 * var36 >> -1943006940);
                              var45 = var28;
                              var40 = var43 - (var10 << -1095855348);
                              if (var43 - (var10 << -1095855348) < 0) {
                                break L40;
                              } else {
                                var40 = (-var40 + var35) / var35;
                                var44 = var44 + var40 * var34;
                                var42 = var42 + var40;
                                var45 = var45 + var40;
                                var43 = var43 + var40 * var35;
                                break L40;
                              }
                            }
                            L41: {
                              var40 = (var43 - var35) / var35;
                              if ((var43 - var35) / var35 <= var45) {
                                break L41;
                              } else {
                                var45 = var40;
                                break L41;
                              }
                            }
                            L42: {
                              var40 = -(var11 << -1965792820) + var44;
                              if (-(var11 << -1965792820) + var44 < 0) {
                                break L42;
                              } else {
                                var40 = (-var40 + var34) / var34;
                                var45 = var45 + var40;
                                var43 = var43 + var35 * var40;
                                var44 = var44 + var34 * var40;
                                var42 = var42 + var40;
                                break L42;
                              }
                            }
                            L43: {
                              var40 = (var44 - var34) / var34;
                              if ((var44 - var34) / var34 <= var45) {
                                break L43;
                              } else {
                                var45 = var40;
                                break L43;
                              }
                            }
                            L44: while (true) {
                              if (0 <= var45) {
                                var39 = var39 + var35;
                                var38 = var38 - var34;
                                var41++;
                                var31 = var31 + si.field_e;
                                continue L39;
                              } else {
                                var46 = var12[(var43 >> 231383212) + var10 * (var44 >> -295024212)];
                                var44 = var44 + var34;
                                var43 = var43 + var35;
                                if (0 != var46) {
                                  var14 = si.field_i[var42];
                                  var13 = var14 + var46;
                                  var46 = (16711935 & var46) + (16711935 & var14);
                                  var14 = (16777472 & var46) - -(var13 - var46 & 65536);
                                  var42++;
                                  si.field_i[var42] = ll.a(var14 + -(var14 >>> -20813368), var13 + -var14);
                                  var45++;
                                  continue L44;
                                } else {
                                  var42++;
                                  var45++;
                                  continue L44;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var41 = var30;
                        L45: while (true) {
                          if (-1 >= (var41 ^ -1)) {
                            break L15;
                          } else {
                            L46: {
                              var42 = var31;
                              var43 = (var36 * var35 >> -1581188732) + var38;
                              var44 = var39 - -(var36 * var34 >> -881786076);
                              var45 = var28;
                              var40 = var43 + -(var10 << 160731116);
                              if (var43 + -(var10 << 160731116) < 0) {
                                break L46;
                              } else {
                                var40 = (var35 - var40) / var35;
                                var44 = var44 + var34 * var40;
                                var42 = var42 + var40;
                                var43 = var43 + var40 * var35;
                                var45 = var45 + var40;
                                break L46;
                              }
                            }
                            L47: {
                              var40 = (var43 + -var35) / var35;
                              if ((var43 + -var35) / var35 > var45) {
                                var45 = var40;
                                break L47;
                              } else {
                                break L47;
                              }
                            }
                            L48: {
                              if (-1 >= (var44 ^ -1)) {
                                break L48;
                              } else {
                                var40 = (-var44 + (var34 - 1)) / var34;
                                var42 = var42 + var40;
                                var45 = var45 + var40;
                                var44 = var44 + var34 * var40;
                                var43 = var43 + var40 * var35;
                                break L48;
                              }
                            }
                            L49: {
                              var40 = (-var34 + (-(var11 << 1924726188) + (1 + var44))) / var34;
                              if ((-var34 + (-(var11 << 1924726188) + (1 + var44))) / var34 <= var45) {
                                break L49;
                              } else {
                                var45 = var40;
                                break L49;
                              }
                            }
                            L50: while (true) {
                              if ((var45 ^ -1) <= -1) {
                                var39 = var39 + var35;
                                var38 = var38 - var34;
                                var31 = var31 + si.field_e;
                                var41++;
                                continue L45;
                              } else {
                                var46 = var12[(var44 >> 1829781708) * var10 - -(var43 >> -668365396)];
                                var43 = var43 + var35;
                                var44 = var44 + var34;
                                if (-1 != (var46 ^ -1)) {
                                  var14 = si.field_i[var42];
                                  var13 = var46 - -var14;
                                  var46 = (16711935 & var14) + (16711935 & var46);
                                  var14 = (var13 + -var46 & 65536) + (var46 & 16777472);
                                  var42++;
                                  si.field_i[var42] = ll.a(var14 + -(var14 >>> -562217176), var13 + -var14);
                                  var45++;
                                  continue L50;
                                } else {
                                  var42++;
                                  var45++;
                                  continue L50;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (-1 == var34) {
                    var41 = var30;
                    L51: while (true) {
                      if (0 <= var41) {
                        break L15;
                      } else {
                        L52: {
                          var42 = var31;
                          var43 = var38;
                          var44 = var39;
                          var45 = var28;
                          if (-1 >= (var43 ^ -1)) {
                            if ((var44 ^ -1) <= -1) {
                              if (-(var10 << 1958872652) + var43 > -1) {
                                if (-1 <= var44 + -(var11 << -1619782964)) {
                                  break L52;
                                } else {
                                  L53: while (true) {
                                    if (-1 >= var45) {
                                      break L52;
                                    } else {
                                      var46 = var12[(var43 >> -690199892) + (var44 >> 1151898732) * var10];
                                      if (-1 == var46) {
                                        var42++;
                                        var45++;
                                        continue L53;
                                      } else {
                                        var14 = si.field_i[var42];
                                        var13 = var46 - -var14;
                                        var46 = (16711935 & var46) - -(16711935 & var14);
                                        var14 = (var46 & 16777472) + (-var46 + var13 & 65536);
                                        var42++;
                                        si.field_i[var42] = ll.a(var13 - var14, -(var14 >>> -1858362648) + var14);
                                        var45++;
                                        continue L53;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L52;
                              }
                            } else {
                              break L52;
                            }
                          } else {
                            break L52;
                          }
                        }
                        var41++;
                        var31 = var31 + si.field_e;
                        continue L51;
                      }
                    }
                  } else {
                    if (-1 <= var34) {
                      var41 = var30;
                      L54: while (true) {
                        if (0 <= var41) {
                          break L15;
                        } else {
                          L55: {
                            var42 = var31;
                            var43 = var38;
                            var44 = var39 + (var36 * var34 >> 1943614692);
                            var45 = var28;
                            if (var43 < 0) {
                              break L55;
                            } else {
                              if (0 > var43 - (var10 << -886203476)) {
                                L56: {
                                  if (-1 >= (var44 ^ -1)) {
                                    break L56;
                                  } else {
                                    var40 = (-1 + (var34 + -var44)) / var34;
                                    var44 = var44 + var40 * var34;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    break L56;
                                  }
                                }
                                L57: {
                                  var40 = (-var34 + var44 + (1 - (var11 << -1332892276))) / var34;
                                  if (var45 < (-var34 + var44 + (1 - (var11 << -1332892276))) / var34) {
                                    var45 = var40;
                                    break L57;
                                  } else {
                                    break L57;
                                  }
                                }
                                L58: while (true) {
                                  if (-1 >= (var45 ^ -1)) {
                                    break L55;
                                  } else {
                                    L59: {
                                      var46 = var12[(var43 >> -284943220) + var10 * (var44 >> 737028428)];
                                      if (var46 != 0) {
                                        var14 = si.field_i[var42];
                                        var13 = var46 + var14;
                                        var46 = (16711935 & var14) + (var46 & 16711935);
                                        var14 = (var46 & 16777472) - -(var13 + -var46 & 65536);
                                        var42++;
                                        si.field_i[var42] = ll.a(-(var14 >>> 1731114472) + var14, -var14 + var13);
                                        break L59;
                                      } else {
                                        var42++;
                                        break L59;
                                      }
                                    }
                                    var44 = var44 + var34;
                                    var45++;
                                    continue L58;
                                  }
                                }
                              } else {
                                break L55;
                              }
                            }
                          }
                          var41++;
                          var31 = var31 + si.field_e;
                          var38 = var38 - var34;
                          continue L54;
                        }
                      }
                    } else {
                      var41 = var30;
                      L60: while (true) {
                        if (0 <= var41) {
                          break L15;
                        } else {
                          L61: {
                            var42 = var31;
                            var43 = var38;
                            var44 = (var34 * var36 >> -781675420) + var39;
                            var45 = var28;
                            if (0 <= var43) {
                              if ((-(var10 << -2125681812) + var43 ^ -1) <= -1) {
                                break L61;
                              } else {
                                L62: {
                                  var40 = -(var11 << 444537740) + var44;
                                  if (0 > -(var11 << 444537740) + var44) {
                                    break L62;
                                  } else {
                                    var40 = (-var40 + var34) / var34;
                                    var44 = var44 + var40 * var34;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    break L62;
                                  }
                                }
                                L63: {
                                  var40 = (-var34 + var44) / var34;
                                  if (var45 >= (-var34 + var44) / var34) {
                                    break L63;
                                  } else {
                                    var45 = var40;
                                    break L63;
                                  }
                                }
                                L64: while (true) {
                                  if (0 <= var45) {
                                    break L61;
                                  } else {
                                    var46 = var12[(var43 >> -888437012) + var10 * (var44 >> -95983060)];
                                    var44 = var44 + var34;
                                    if (0 != var46) {
                                      var14 = si.field_i[var42];
                                      var13 = var14 + var46;
                                      var46 = (16711935 & var14) + (16711935 & var46);
                                      var14 = (var13 - var46 & 65536) + (var46 & 16777472);
                                      var42++;
                                      si.field_i[var42] = ll.a(-var14 + var13, var14 + -(var14 >>> 449735176));
                                      var45++;
                                      continue L64;
                                    } else {
                                      var42++;
                                      var45++;
                                      continue L64;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L61;
                            }
                          }
                          var41++;
                          var31 = var31 + si.field_e;
                          var38 = var38 - var34;
                          continue L60;
                        }
                      }
                    }
                  }
                }
              }
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Your objective is to bring the ship's reactor back online. You can press <img=0> to view your objectives at any time. The location of your current objective is shown by the yellow pointer.";
        field_d = "Par time: <col=ffffff>";
    }
}
