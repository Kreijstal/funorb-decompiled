/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends ck {
    int field_p;
    static wj field_o;
    static boolean field_A;
    static byte[] field_w;
    static el field_y;
    byte[] field_B;
    static wk[][] field_x;
    static boolean field_q;
    static String field_u;
    static int field_z;
    long field_v;
    static String field_C;
    static boolean field_r;
    static fk field_s;
    static String field_t;

    public static void d() {
        field_x = null;
        field_w = null;
        field_o = null;
        field_C = null;
        field_t = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final static void a(String param0, int param1, boolean param2, int param3, java.awt.Color param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = sl.field_n.getGraphics();
                  if (null != wc.field_f) {
                    break L2;
                  } else {
                    wc.field_f = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param2) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, na.field_i, li.field_A);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param4 != null) {
                    break L4;
                  } else {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (ll.field_j == null) {
                        ll.field_j = sl.field_n.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = ll.field_j.getGraphics();
                    var10.setColor(param4);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param1 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(3 * param1 + 2, 2, 300 - 3 * param1, 30);
                    var10.setFont(wc.field_f);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (304 - 6 * param0.length()) / 2, 22);
                    boolean discarded$1 = var9.drawImage(ll.field_j, -152 + na.field_i / 2, -18 + li.field_A / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = na.field_i / 2 + -152;
                    var8 = -18 + li.field_A / 2;
                    var9.setColor(param4);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 + 2, param1 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 - -1, 301, 31);
                    var9.fillRect(2 + var7 + 3 * param1, 2 + var8, 300 + -(param1 * 3), 30);
                    var9.setFont(wc.field_f);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 - -((-(6 * param0.length()) + 304) / 2), 22 + var8);
                    break L7;
                  }
                }
                L8: {
                  if (id.field_Wb == null) {
                    break L8;
                  } else {
                    var9.setFont(wc.field_f);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(id.field_Wb, na.field_i / 2 + -(6 * id.field_Wb.length() / 2), -26 + li.field_A / 2);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                sl.field_n.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("kc.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L10;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L10;
            }
          }
          L11: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(300).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L11;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final static String a(int[] param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String stackIn_133_0 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_132_0 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param0.length) {
                var6 = 0;
                L2: while (true) {
                  if (var6 >= 8) {
                    L3: {
                      var5 = cd.field_c[1];
                      var6 = ul.a((byte) -84, param0[0]);
                      if (var6 < 0) {
                        break L3;
                      } else {
                        if (var6 >= cd.field_c.length) {
                          break L3;
                        } else {
                          var5 = cd.field_c[var6];
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var6 == 0) {
                        var3_int = var3_int ^ 8176765;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var5 = var5 + "-";
                      if (var6 == 1) {
                        var3_int = var3_int ^ 1155849;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (2 != var6) {
                        break L6;
                      } else {
                        var3_int = var3_int ^ 5624312;
                        break L6;
                      }
                    }
                    L7: {
                      if (var6 == 3) {
                        var3_int = var3_int ^ 7177436;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var6 == 4) {
                        var3_int = var3_int ^ 5318225;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var6 != 5) {
                        break L9;
                      } else {
                        var3_int = var3_int ^ 18177652;
                        break L9;
                      }
                    }
                    L10: {
                      if (var6 == 6) {
                        var3_int = var3_int ^ 7171409;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var6 != 7) {
                        break L11;
                      } else {
                        var3_int = var3_int ^ 3140392;
                        break L11;
                      }
                    }
                    L12: {
                      if (8 == var6) {
                        var3_int = var3_int ^ 5104464;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (var6 == 9) {
                        var3_int = var3_int ^ 5940651;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (var6 != 10) {
                        break L14;
                      } else {
                        var3_int = var3_int ^ 7257749;
                        break L14;
                      }
                    }
                    L15: {
                      if (var6 == 11) {
                        var3_int = var3_int ^ 2016943;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var7 = var3_int;
                    var8 = 0;
                    L16: while (true) {
                      if (var8 >= 5) {
                        var10 = 0;
                        var8 = var10;
                        L17: while (true) {
                          if (~param1.length >= ~var10) {
                            L18: {
                              if (1 == var4) {
                                var5 = var5 + "-V1";
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var4 == 2) {
                                var5 = var5 + "-V2";
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (var4 != 3) {
                                break L20;
                              } else {
                                var5 = var5 + "-V3";
                                break L20;
                              }
                            }
                            L21: {
                              if (var4 != 4) {
                                break L21;
                              } else {
                                var5 = var5 + "-V4";
                                break L21;
                              }
                            }
                            L22: {
                              if (var4 != 5) {
                                break L22;
                              } else {
                                var5 = var5 + "-V5";
                                break L22;
                              }
                            }
                            L23: {
                              if (var4 == 6) {
                                var5 = var5 + "-<img=18>";
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            stackOut_132_0 = (String) var5;
                            stackIn_133_0 = stackOut_132_0;
                            break L0;
                          } else {
                            L24: {
                              if (param1[var10] != 0) {
                                break L24;
                              } else {
                                if (var4 < 1) {
                                  var4 = 1;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            L25: {
                              if (1 != param1[var10]) {
                                break L25;
                              } else {
                                if (2 <= var4) {
                                  break L25;
                                } else {
                                  var4 = 2;
                                  break L25;
                                }
                              }
                            }
                            L26: {
                              if (param1[var10] != 2) {
                                break L26;
                              } else {
                                if (var4 < 3) {
                                  var4 = 3;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            L27: {
                              if (param1[var10] != 3) {
                                break L27;
                              } else {
                                if (var4 < 4) {
                                  var4 = 4;
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L28: {
                              if (param1[var10] != 4) {
                                break L28;
                              } else {
                                if (var4 >= 5) {
                                  break L28;
                                } else {
                                  var4 = 5;
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              if (param1[var10] != 5) {
                                break L29;
                              } else {
                                if (var4 < 1) {
                                  var4 = 1;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            L30: {
                              if (param1[var10] != 6) {
                                break L30;
                              } else {
                                if (var4 < 2) {
                                  var4 = 2;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            L31: {
                              if (param1[var10] != 7) {
                                break L31;
                              } else {
                                if (var4 < 3) {
                                  var4 = 3;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              if (param1[var10] != 8) {
                                break L32;
                              } else {
                                if (var4 < 4) {
                                  var4 = 4;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            L33: {
                              if (param1[var10] != 9) {
                                break L33;
                              } else {
                                if (var4 >= 5) {
                                  break L33;
                                } else {
                                  var4 = 5;
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (param1[var10] != 10) {
                                break L34;
                              } else {
                                if (var4 < 1) {
                                  var4 = 1;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L35: {
                              if (param1[var10] != 11) {
                                break L35;
                              } else {
                                if (var4 >= 2) {
                                  break L35;
                                } else {
                                  var4 = 2;
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              if (param1[var10] != 12) {
                                break L36;
                              } else {
                                if (var4 >= 3) {
                                  break L36;
                                } else {
                                  var4 = 3;
                                  break L36;
                                }
                              }
                            }
                            L37: {
                              if (param1[var10] != 13) {
                                break L37;
                              } else {
                                if (var4 < 4) {
                                  var4 = 4;
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            L38: {
                              if (param1[var10] != 14) {
                                break L38;
                              } else {
                                if (var4 >= 5) {
                                  break L38;
                                } else {
                                  var4 = 5;
                                  break L38;
                                }
                              }
                            }
                            L39: {
                              if (param1[var10] != 20) {
                                break L39;
                              } else {
                                if (6 <= var4) {
                                  break L39;
                                } else {
                                  var4 = 6;
                                  break L39;
                                }
                              }
                            }
                            var10++;
                            continue L17;
                          }
                        }
                      } else {
                        L40: {
                          L41: {
                            if (var7 % 35 <= 0) {
                              break L41;
                            } else {
                              if (var7 % 35 < 26) {
                                var5 = var5 + (char)(65 - -((var7 % 35 - 1) % 26));
                                break L40;
                              } else {
                                break L41;
                              }
                            }
                          }
                          if (var7 % 35 >= 26) {
                            var5 = var5 + (char)((-26 + var7 % 35) % 10 + 48);
                            break L40;
                          } else {
                            break L40;
                          }
                        }
                        var7 = var7 / 35;
                        var8++;
                        continue L16;
                      }
                    }
                  } else {
                    var3_int = 8388607 & (var3_int ^ 10 * var3_int);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L42: {
                  if (-1 == param0[var6]) {
                    break L42;
                  } else {
                    var3_int = var3_int + param0[var6];
                    break L42;
                  }
                }
                L43: {
                  if (param0[var6] == 49) {
                    var4 = 6;
                    break L43;
                  } else {
                    break L43;
                  }
                }
                var3_int = (var3_int ^ 10 * var3_int) & 8388607;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L44: {
            var3 = decompiledCaughtException;
            stackOut_134_0 = (RuntimeException) var3;
            stackOut_134_1 = new StringBuilder().append("kc.A(");
            stackIn_136_0 = stackOut_134_0;
            stackIn_136_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param0 == null) {
              stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
              stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L44;
            } else {
              stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
              stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
              stackOut_135_2 = "{...}";
              stackIn_137_0 = stackOut_135_0;
              stackIn_137_1 = stackOut_135_1;
              stackIn_137_2 = stackOut_135_2;
              break L44;
            }
          }
          L45: {
            stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
            stackOut_137_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(',');
            stackIn_139_0 = stackOut_137_0;
            stackIn_139_1 = stackOut_137_1;
            stackIn_138_0 = stackOut_137_0;
            stackIn_138_1 = stackOut_137_1;
            if (param1 == null) {
              stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
              stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
              stackOut_139_2 = "null";
              stackIn_140_0 = stackOut_139_0;
              stackIn_140_1 = stackOut_139_1;
              stackIn_140_2 = stackOut_139_2;
              break L45;
            } else {
              stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
              stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
              stackOut_138_2 = "{...}";
              stackIn_140_0 = stackOut_138_0;
              stackIn_140_1 = stackOut_138_1;
              stackIn_140_2 = stackOut_138_2;
              break L45;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_140_0, stackIn_140_2 + ',' + 2 + ')');
        }
        return stackIn_133_0;
    }

    kc(long param0, int param1, byte[] param2) {
        try {
            ((kc) this).field_p = param1;
            ((kc) this).field_v = param0;
            ((kc) this).field_B = param2;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "kc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = false;
        field_w = new byte[]{(byte) 1, (byte) 0, (byte) 0};
        field_u = "Choose a chassis for your sentinel configuration. Each chassis is equipped with a default set of weapons and modules.";
        field_C = "New Game";
        field_t = "Show all game chat";
    }
}
