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
        RuntimeException var5_ref = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
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
                    boolean discarded$1 = var9.drawImage(he.field_y, -152 + hf.field_h / 2, qc.field_s / 2 + -18, (java.awt.image.ImageObserver) null);
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
                  var6 = 0;
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
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("ki.C(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 44 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, bd param7) {
        int var8_int = 0;
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
            var8_int = param7.field_w;
            var9 = param7.field_y;
            var10 = param7.field_z;
            var11 = param7.field_A;
            var12 = param7.field_D;
            param0 = param0 - (var9 << 4);
            param1 = param1 - (var8_int << 4);
            var15 = (double)(param6 & 65535) * 0.00009587379924285257;
            var17 = (int)Math.floor(Math.sin(var15) * (double)param5 + 0.5);
            var18 = (int)Math.floor(0.5 + Math.cos(var15) * (double)param5);
            var19 = var18 * -param1 + var17 * -param0;
            var20 = -param0 * var18 + --param1 * var17;
            var21 = (-param1 + (var10 << 4)) * var18 - -(-param0 * var17);
            var22 = var17 * -((var10 << 4) - param1) + var18 * -param0;
            var23 = (-param0 + (var11 << 4)) * var17 + -param1 * var18;
            var24 = var18 * ((var11 << 4) - param0) + var17 * --param1;
            var25 = var17 * (-param0 + (var11 << 4)) + var18 * ((var10 << 4) - param1);
            if (!param3) {
              break L0;
            } else {
              ki.a(-102);
              break L0;
            }
          }
          L1: {
            var26 = (-param0 + (var11 << 4)) * var18 + -((var10 << 4) - param1) * var17;
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
            if (~var27 < ~var23) {
              var27 = var23;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (~var27 >= ~var25) {
              break L3;
            } else {
              var27 = var25;
              break L3;
            }
          }
          L4: {
            if (~var28 <= ~var23) {
              break L4;
            } else {
              var28 = var23;
              break L4;
            }
          }
          L5: {
            if (~var28 > ~var25) {
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
            if (~var24 > ~var29) {
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
            var28 = var28 - -4095 >> 12;
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
            var30 = var30 - -4095 >> 12;
            var29 = var29 + param2;
            var27 = var27 >> 4;
            var28 = var28 + 15 >> 4;
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
            var30 = 15 + var30 >> 4;
            var28 = -var28 + var27;
            if (~var30 < ~si.field_a) {
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
            if (var30 >= 0) {
              return;
            } else {
              L15: {
                var31 = var27 + var29 * si.field_e;
                var32 = 16777216.0 / (double)param5;
                var34 = (int)Math.floor(var32 * Math.sin(var15) + 0.5);
                var35 = (int)Math.floor(0.5 + Math.cos(var15) * var32);
                var36 = -param4 + (8 + (var27 << 4));
                var37 = 8 + (var29 << 4) - param2;
                var38 = (param1 << 8) + -(var37 * var34 >> 4);
                var39 = (param0 << 8) + (var37 * var35 >> 4);
                if (0 != var35) {
                  if (var35 >= 0) {
                    if (var34 == 0) {
                      var41 = var30;
                      L16: while (true) {
                        if (var41 >= 0) {
                          break L15;
                        } else {
                          L17: {
                            var42 = var31;
                            var43 = var38 + (var35 * var36 >> 4);
                            var44 = var39;
                            var45 = var28;
                            if (var44 >= 0) {
                              if (var44 - (var11 << 12) >= 0) {
                                break L17;
                              } else {
                                L18: {
                                  if (var43 >= 0) {
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
                                  var40 = (-var35 + -(var10 << 12) + 1 + var43) / var35;
                                  if (~var45 <= ~((-var35 + -(var10 << 12) + 1 + var43) / var35)) {
                                    break L19;
                                  } else {
                                    var45 = var40;
                                    break L19;
                                  }
                                }
                                L20: while (true) {
                                  if (var45 >= 0) {
                                    break L17;
                                  } else {
                                    L21: {
                                      var46 = var12[var10 * (var44 >> 12) + (var43 >> 12)];
                                      var43 = var43 + var35;
                                      if (var46 == 0) {
                                        var42++;
                                        break L21;
                                      } else {
                                        var14 = si.field_i[var42];
                                        var13 = var14 + var46;
                                        var46 = (16711935 & var14) + (var46 & 16711935);
                                        var14 = (var13 + -var46 & 65536) + (var46 & 16777472);
                                        int incrementValue$9 = var42;
                                        var42++;
                                        si.field_i[incrementValue$9] = ll.a(-(var14 >>> 8) + var14, -var14 + var13);
                                        break L21;
                                      }
                                    }
                                    var45++;
                                    continue L20;
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
                      if (var34 < 0) {
                        var41 = var30;
                        L22: while (true) {
                          if (var41 >= 0) {
                            break L15;
                          } else {
                            L23: {
                              var42 = var31;
                              var43 = (var36 * var35 >> 4) + var38;
                              var44 = var39 - -(var34 * var36 >> 4);
                              var45 = var28;
                              if (var43 >= 0) {
                                break L23;
                              } else {
                                var40 = (var35 - (1 + var43)) / var35;
                                var45 = var45 + var40;
                                var43 = var43 + var35 * var40;
                                var44 = var44 + var34 * var40;
                                var42 = var42 + var40;
                                break L23;
                              }
                            }
                            L24: {
                              var40 = (var43 + 1 - ((var10 << 12) + var35)) / var35;
                              if (~((var43 + 1 - ((var10 << 12) + var35)) / var35) >= ~var45) {
                                break L24;
                              } else {
                                var45 = var40;
                                break L24;
                              }
                            }
                            L25: {
                              var40 = -(var11 << 12) + var44;
                              if (0 <= -(var11 << 12) + var44) {
                                var40 = (var34 + -var40) / var34;
                                var45 = var45 + var40;
                                var44 = var44 + var34 * var40;
                                var43 = var43 + var40 * var35;
                                var42 = var42 + var40;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              var40 = (var44 + -var34) / var34;
                              if (var45 >= (var44 + -var34) / var34) {
                                break L26;
                              } else {
                                var45 = var40;
                                break L26;
                              }
                            }
                            L27: while (true) {
                              if (var45 >= 0) {
                                var38 = var38 - var34;
                                var31 = var31 + si.field_e;
                                var41++;
                                var39 = var39 + var35;
                                continue L22;
                              } else {
                                L28: {
                                  var46 = var12[(var43 >> 12) + var10 * (var44 >> 12)];
                                  var44 = var44 + var34;
                                  var43 = var43 + var35;
                                  if (var46 != 0) {
                                    var14 = si.field_i[var42];
                                    var13 = var46 + var14;
                                    var46 = (var46 & 16711935) + (16711935 & var14);
                                    var14 = (16777472 & var46) - -(65536 & -var46 + var13);
                                    int incrementValue$10 = var42;
                                    var42++;
                                    si.field_i[incrementValue$10] = ll.a(var14 - (var14 >>> 8), -var14 + var13);
                                    break L28;
                                  } else {
                                    var42++;
                                    break L28;
                                  }
                                }
                                var45++;
                                continue L27;
                              }
                            }
                          }
                        }
                      } else {
                        var41 = var30;
                        L29: while (true) {
                          if (0 <= var41) {
                            break L15;
                          } else {
                            L30: {
                              var42 = var31;
                              var43 = var38 - -(var35 * var36 >> 4);
                              var44 = (var34 * var36 >> 4) + var39;
                              var45 = var28;
                              if (0 > var43) {
                                var40 = (var35 + (-1 + -var43)) / var35;
                                var42 = var42 + var40;
                                var45 = var45 + var40;
                                var44 = var44 + var34 * var40;
                                var43 = var43 + var40 * var35;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              var40 = (-(var10 << 12) + (var43 + 1 + -var35)) / var35;
                              if (~((-(var10 << 12) + (var43 + 1 + -var35)) / var35) >= ~var45) {
                                break L31;
                              } else {
                                var45 = var40;
                                break L31;
                              }
                            }
                            L32: {
                              if (var44 < 0) {
                                var40 = (-var44 + var34 - 1) / var34;
                                var43 = var43 + var40 * var35;
                                var44 = var44 + var34 * var40;
                                var45 = var45 + var40;
                                var42 = var42 + var40;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: {
                              var40 = (-var34 + (var44 + 1) + -(var11 << 12)) / var34;
                              if (~((-var34 + (var44 + 1) + -(var11 << 12)) / var34) < ~var45) {
                                var45 = var40;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            L34: while (true) {
                              if (var45 >= 0) {
                                var31 = var31 + si.field_e;
                                var41++;
                                var38 = var38 - var34;
                                var39 = var39 + var35;
                                continue L29;
                              } else {
                                L35: {
                                  var46 = var12[(var43 >> 12) + var10 * (var44 >> 12)];
                                  var43 = var43 + var35;
                                  var44 = var44 + var34;
                                  if (var46 != 0) {
                                    var14 = si.field_i[var42];
                                    var13 = var14 + var46;
                                    var46 = (16711935 & var46) - -(var14 & 16711935);
                                    var14 = (65536 & -var46 + var13) + (var46 & 16777472);
                                    int incrementValue$11 = var42;
                                    var42++;
                                    si.field_i[incrementValue$11] = ll.a(var13 - var14, var14 + -(var14 >>> 8));
                                    break L35;
                                  } else {
                                    var42++;
                                    break L35;
                                  }
                                }
                                var45++;
                                continue L34;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (var34 == 0) {
                      var41 = var30;
                      L36: while (true) {
                        if (var41 >= 0) {
                          break L15;
                        } else {
                          L37: {
                            var42 = var31;
                            var43 = (var35 * var36 >> 4) + var38;
                            var44 = var39;
                            var45 = var28;
                            if (var44 < 0) {
                              break L37;
                            } else {
                              if (0 <= var44 - (var11 << 12)) {
                                break L37;
                              } else {
                                L38: {
                                  var40 = var43 + -(var10 << 12);
                                  if (var43 + -(var10 << 12) >= 0) {
                                    var40 = (var35 + -var40) / var35;
                                    var42 = var42 + var40;
                                    var43 = var43 + var40 * var35;
                                    var45 = var45 + var40;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                                L39: {
                                  var40 = (var43 + -var35) / var35;
                                  if (var45 < (var43 + -var35) / var35) {
                                    var45 = var40;
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L40: while (true) {
                                  if (var45 >= 0) {
                                    break L37;
                                  } else {
                                    L41: {
                                      var46 = var12[(var43 >> 12) + var10 * (var44 >> 12)];
                                      if (var46 != 0) {
                                        var14 = si.field_i[var42];
                                        var13 = var14 + var46;
                                        var46 = (16711935 & var14) + (16711935 & var46);
                                        var14 = (16777472 & var46) - -(65536 & var13 - var46);
                                        int incrementValue$12 = var42;
                                        var42++;
                                        si.field_i[incrementValue$12] = ll.a(-var14 + var13, -(var14 >>> 8) + var14);
                                        break L41;
                                      } else {
                                        var42++;
                                        break L41;
                                      }
                                    }
                                    var43 = var43 + var35;
                                    var45++;
                                    continue L40;
                                  }
                                }
                              }
                            }
                          }
                          var39 = var39 + var35;
                          var41++;
                          var31 = var31 + si.field_e;
                          continue L36;
                        }
                      }
                    } else {
                      if (var34 < 0) {
                        var41 = var30;
                        L42: while (true) {
                          if (var41 >= 0) {
                            break L15;
                          } else {
                            L43: {
                              var42 = var31;
                              var43 = (var36 * var35 >> 4) + var38;
                              var44 = var39 + (var34 * var36 >> 4);
                              var45 = var28;
                              var40 = var43 - (var10 << 12);
                              if (var43 - (var10 << 12) < 0) {
                                break L43;
                              } else {
                                var40 = (-var40 + var35) / var35;
                                var44 = var44 + var40 * var34;
                                var42 = var42 + var40;
                                var45 = var45 + var40;
                                var43 = var43 + var40 * var35;
                                break L43;
                              }
                            }
                            L44: {
                              var40 = (var43 - var35) / var35;
                              if ((var43 - var35) / var35 <= var45) {
                                break L44;
                              } else {
                                var45 = var40;
                                break L44;
                              }
                            }
                            L45: {
                              var40 = -(var11 << 12) + var44;
                              if (-(var11 << 12) + var44 < 0) {
                                break L45;
                              } else {
                                var40 = (-var40 + var34) / var34;
                                var45 = var45 + var40;
                                var43 = var43 + var35 * var40;
                                var44 = var44 + var34 * var40;
                                var42 = var42 + var40;
                                break L45;
                              }
                            }
                            L46: {
                              var40 = (var44 - var34) / var34;
                              if (~((var44 - var34) / var34) >= ~var45) {
                                break L46;
                              } else {
                                var45 = var40;
                                break L46;
                              }
                            }
                            L47: while (true) {
                              if (0 <= var45) {
                                var39 = var39 + var35;
                                var38 = var38 - var34;
                                var41++;
                                var31 = var31 + si.field_e;
                                continue L42;
                              } else {
                                L48: {
                                  var46 = var12[(var43 >> 12) + var10 * (var44 >> 12)];
                                  var44 = var44 + var34;
                                  var43 = var43 + var35;
                                  if (0 != var46) {
                                    var14 = si.field_i[var42];
                                    var13 = var14 + var46;
                                    var46 = (16711935 & var46) + (16711935 & var14);
                                    var14 = (16777472 & var46) - -(var13 - var46 & 65536);
                                    int incrementValue$13 = var42;
                                    var42++;
                                    si.field_i[incrementValue$13] = ll.a(var14 + -(var14 >>> 8), var13 + -var14);
                                    break L48;
                                  } else {
                                    var42++;
                                    break L48;
                                  }
                                }
                                var45++;
                                continue L47;
                              }
                            }
                          }
                        }
                      } else {
                        var41 = var30;
                        L49: while (true) {
                          if (var41 >= 0) {
                            break L15;
                          } else {
                            L50: {
                              var42 = var31;
                              var43 = (var36 * var35 >> 4) + var38;
                              var44 = var39 - -(var36 * var34 >> 4);
                              var45 = var28;
                              var40 = var43 + -(var10 << 12);
                              if (var43 + -(var10 << 12) < 0) {
                                break L50;
                              } else {
                                var40 = (var35 - var40) / var35;
                                var44 = var44 + var34 * var40;
                                var42 = var42 + var40;
                                var43 = var43 + var40 * var35;
                                var45 = var45 + var40;
                                break L50;
                              }
                            }
                            L51: {
                              var40 = (var43 + -var35) / var35;
                              if ((var43 + -var35) / var35 > var45) {
                                var45 = var40;
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                            L52: {
                              if (var44 >= 0) {
                                break L52;
                              } else {
                                var40 = (-var44 + (var34 - 1)) / var34;
                                var42 = var42 + var40;
                                var45 = var45 + var40;
                                var44 = var44 + var34 * var40;
                                var43 = var43 + var40 * var35;
                                break L52;
                              }
                            }
                            L53: {
                              var40 = (-var34 + (-(var11 << 12) + (1 + var44))) / var34;
                              if ((-var34 + (-(var11 << 12) + (1 + var44))) / var34 <= var45) {
                                break L53;
                              } else {
                                var45 = var40;
                                break L53;
                              }
                            }
                            L54: while (true) {
                              if (var45 >= 0) {
                                var39 = var39 + var35;
                                var38 = var38 - var34;
                                var31 = var31 + si.field_e;
                                var41++;
                                continue L49;
                              } else {
                                L55: {
                                  var46 = var12[(var44 >> 12) * var10 - -(var43 >> 12)];
                                  var43 = var43 + var35;
                                  var44 = var44 + var34;
                                  if (var46 != 0) {
                                    var14 = si.field_i[var42];
                                    var13 = var46 - -var14;
                                    var46 = (16711935 & var14) + (16711935 & var46);
                                    var14 = (var13 + -var46 & 65536) + (var46 & 16777472);
                                    int incrementValue$14 = var42;
                                    var42++;
                                    si.field_i[incrementValue$14] = ll.a(var14 + -(var14 >>> 8), var13 + -var14);
                                    break L55;
                                  } else {
                                    var42++;
                                    break L55;
                                  }
                                }
                                var45++;
                                continue L54;
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
                    L56: while (true) {
                      if (0 <= var41) {
                        break L15;
                      } else {
                        L57: {
                          var42 = var31;
                          var43 = var38;
                          var44 = var39;
                          var45 = var28;
                          if (var43 >= 0) {
                            if (var44 >= 0) {
                              if (-(var10 << 12) + var43 < 0) {
                                if (var44 + -(var11 << 12) >= 0) {
                                  break L57;
                                } else {
                                  L58: while (true) {
                                    if (var45 >= 0) {
                                      break L57;
                                    } else {
                                      L59: {
                                        var46 = var12[(var43 >> 12) + (var44 >> 12) * var10];
                                        if (var46 == 0) {
                                          var42++;
                                          break L59;
                                        } else {
                                          var14 = si.field_i[var42];
                                          var13 = var46 - -var14;
                                          var46 = (16711935 & var46) - -(16711935 & var14);
                                          var14 = (var46 & 16777472) + (-var46 + var13 & 65536);
                                          int incrementValue$15 = var42;
                                          var42++;
                                          si.field_i[incrementValue$15] = ll.a(var13 - var14, -(var14 >>> 8) + var14);
                                          break L59;
                                        }
                                      }
                                      var45++;
                                      continue L58;
                                    }
                                  }
                                }
                              } else {
                                break L57;
                              }
                            } else {
                              break L57;
                            }
                          } else {
                            break L57;
                          }
                        }
                        var41++;
                        var31 = var31 + si.field_e;
                        continue L56;
                      }
                    }
                  } else {
                    if (var34 >= 0) {
                      var41 = var30;
                      L60: while (true) {
                        if (0 <= var41) {
                          break L15;
                        } else {
                          L61: {
                            var42 = var31;
                            var43 = var38;
                            var44 = var39 + (var36 * var34 >> 4);
                            var45 = var28;
                            if (var43 < 0) {
                              break L61;
                            } else {
                              if (0 > var43 - (var10 << 12)) {
                                L62: {
                                  if (var44 >= 0) {
                                    break L62;
                                  } else {
                                    var40 = (-1 + (var34 + -var44)) / var34;
                                    var44 = var44 + var40 * var34;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    break L62;
                                  }
                                }
                                L63: {
                                  var40 = (-var34 + var44 + (1 - (var11 << 12))) / var34;
                                  if (var45 < (-var34 + var44 + (1 - (var11 << 12))) / var34) {
                                    var45 = var40;
                                    break L63;
                                  } else {
                                    break L63;
                                  }
                                }
                                L64: while (true) {
                                  if (var45 >= 0) {
                                    break L61;
                                  } else {
                                    L65: {
                                      var46 = var12[(var43 >> 12) + var10 * (var44 >> 12)];
                                      if (var46 != 0) {
                                        var14 = si.field_i[var42];
                                        var13 = var46 + var14;
                                        var46 = (16711935 & var14) + (var46 & 16711935);
                                        var14 = (var46 & 16777472) - -(var13 + -var46 & 65536);
                                        int incrementValue$16 = var42;
                                        var42++;
                                        si.field_i[incrementValue$16] = ll.a(-(var14 >>> 8) + var14, -var14 + var13);
                                        break L65;
                                      } else {
                                        var42++;
                                        break L65;
                                      }
                                    }
                                    var44 = var44 + var34;
                                    var45++;
                                    continue L64;
                                  }
                                }
                              } else {
                                break L61;
                              }
                            }
                          }
                          var41++;
                          var31 = var31 + si.field_e;
                          var38 = var38 - var34;
                          continue L60;
                        }
                      }
                    } else {
                      var41 = var30;
                      L66: while (true) {
                        if (0 <= var41) {
                          break L15;
                        } else {
                          L67: {
                            var42 = var31;
                            var43 = var38;
                            var44 = (var34 * var36 >> 4) + var39;
                            var45 = var28;
                            if (0 <= var43) {
                              if (-(var10 << 12) + var43 >= 0) {
                                break L67;
                              } else {
                                L68: {
                                  var40 = -(var11 << 12) + var44;
                                  if (0 > -(var11 << 12) + var44) {
                                    break L68;
                                  } else {
                                    var40 = (-var40 + var34) / var34;
                                    var44 = var44 + var40 * var34;
                                    var42 = var42 + var40;
                                    var45 = var45 + var40;
                                    break L68;
                                  }
                                }
                                L69: {
                                  var40 = (-var34 + var44) / var34;
                                  if (var45 >= (-var34 + var44) / var34) {
                                    break L69;
                                  } else {
                                    var45 = var40;
                                    break L69;
                                  }
                                }
                                L70: while (true) {
                                  if (0 <= var45) {
                                    break L67;
                                  } else {
                                    L71: {
                                      var46 = var12[(var43 >> 12) + var10 * (var44 >> 12)];
                                      var44 = var44 + var34;
                                      if (0 != var46) {
                                        var14 = si.field_i[var42];
                                        var13 = var14 + var46;
                                        var46 = (16711935 & var14) + (16711935 & var46);
                                        var14 = (var13 - var46 & 65536) + (var46 & 16777472);
                                        int incrementValue$17 = var42;
                                        var42++;
                                        si.field_i[incrementValue$17] = ll.a(-var14 + var13, var14 + -(var14 >>> 8));
                                        break L71;
                                      } else {
                                        var42++;
                                        break L71;
                                      }
                                    }
                                    var45++;
                                    continue L70;
                                  }
                                }
                              }
                            } else {
                              break L67;
                            }
                          }
                          var41++;
                          var31 = var31 + si.field_e;
                          var38 = var38 - var34;
                          continue L66;
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
