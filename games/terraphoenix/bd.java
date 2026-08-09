/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bd {
    private int field_h;
    ci[] field_b;
    private int field_e;
    private int field_l;
    static String[] field_f;
    ci field_c;
    static int field_d;
    private boolean field_i;
    static sa field_m;
    private int field_n;
    static String field_j;
    private int field_g;
    static int field_a;
    static mf field_k;

    final bd a(int param0, int param1) {
        this.field_l = param1;
        if (param0 != -19426) {
            this.field_e = -101;
            return (bd) (this);
        }
        return (bd) (this);
    }

    final void a(int param0, gl param1, int param2, int param3, hf param4) {
        pk stackIn_18_0 = null;
        String stackIn_18_1 = null;
        pk stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_25_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              jl.a(this.field_b, param1.field_n, param0 + param1.field_u, param1.field_p, (byte) 18, param1.field_w + param2);
              if (null != this.field_c) {
                L2: {
                  var6_int = this.field_g + param1.field_w + param2;
                  if (1 == param4.field_h) {
                    var6_int = var6_int + (-this.field_c.field_q + param1.field_p) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_h + (param0 + param1.field_u);
                  if (param4.field_a != 1) {
                    break L3;
                  } else {
                    var7 = var7 + (param1.field_n + -this.field_c.field_u) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (param4.field_h != 2) {
                    break L4;
                  } else {
                    var6_int = var6_int + (-this.field_c.field_q + param1.field_p);
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param4.field_a ^ -1)) {
                    var7 = var7 + (param1.field_n + -this.field_c.field_u);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_c.b(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            L6: {
              var6 = param4.b(param1, 32032);
              if (var6 == null) {
                break L6;
              } else {
                if (param4.field_j == null) {
                  break L6;
                } else {
                  if (-1 < (this.field_n ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      stackIn_18_0 = param4.field_j;

                      stackIn_18_1 = (String) (var6);

                      if (2147483647 == (this.field_g ^ -1)) {
                        stackIn_19_0 = (pk) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = 0;
                        break L7;
                      } else {
                        stackIn_19_0 = (pk) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = this.field_g;
                        break L7;
                      }
                    }
                    L8: {




                      stackIn_21_2 = stackIn_19_2 + (param2 + param1.field_w + param4.field_d);

                      if (2147483647 == (this.field_h ^ -1)) {
                        stackIn_19_0 = (pk) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = 0;
                        break L8;
                      } else {
                        stackIn_19_0 = (pk) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = this.field_h;
                        break L8;
                      }
                    }
                    L9: {






                      stackIn_24_3 = stackIn_22_3 + (param1.field_u + param0) + param4.field_b;

                      stackIn_24_4 = -param4.field_l + (param1.field_p + -param4.field_d);

                      stackIn_24_5 = param1.field_n + -param4.field_b - param4.field_f;

                      stackIn_24_6 = this.field_n;

                      stackIn_24_7 = this.field_l;

                      if ((this.field_e ^ -1) != 2147483647) {
                        stackIn_19_0 = (pk) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = this.field_e;
                        break L9;
                      } else {
                        stackIn_19_0 = (pk) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = 256;
                        break L9;
                      }
                    }
                    ((pk) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param4.field_h, param4.field_a, param4.field_m);
                    break L6;
                  }
                }
              }
            }
            if (param3 == 1) {
              break L0;
            } else {
              this.field_g = -106;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var6_ref);

            stackIn_31_1 = new StringBuilder().append("bd.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ')');
        }
    }

    final bd b(int param0, boolean param1) {
        this.field_n = param0;
        if (!param1) {
            return (bd) null;
        }
        return (bd) (this);
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            he stackIn_13_0;
            java.net.URL stackIn_13_1;
            java.net.URL stackIn_13_2;
            java.net.URL stackIn_13_3;
            StringBuilder stackIn_13_4;
            he stackIn_14_0;
            java.net.URL stackIn_14_1;
            java.net.URL stackIn_14_2;
            java.net.URL stackIn_14_3;
            StringBuilder stackIn_14_4;
            String stackIn_14_5;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            int var4 = 0;
            mf var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            var7 = Terraphoenix.field_V;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 != null) {
                    var3 = pc.a(param0, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 != null) {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                u.a(var3, 113);
                var8 = qf.a(var3, 0, ":", "%3a");
                var9 = qf.a(var8, 0, "@", "%40");
                var4 = -44 % ((3 - param2) / 63);
                var10 = qf.a(var9, 0, "&", "%26");
                var11 = qf.a(var10, 0, "#", "%23");
                if (td.field_b != null) {
                  L4: {
                    stackIn_13_0 = d.field_K;

                    stackIn_13_1 = null;

                    stackIn_13_2 = null;

                    stackIn_13_3 = td.field_b.getCodeBase();

                    stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ve.field_b).append("&u=");

                    if (null != sa.field_f) {
                      stackIn_14_0 = (he) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = sa.field_f;
                      break L4;
                    } else {
                      stackIn_14_0 = (he) ((Object) stackIn_13_0);
                      stackIn_14_1 = null;
                      stackIn_14_2 = null;
                      stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                      stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                      stackIn_14_5 = "" + pf.field_c;
                      break L4;
                    }
                  }
                  var5 = ((he) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + he.field_j + "&v2=" + he.field_d + "&e=" + var11), -71);
                  L5: while (true) {
                    if (-1 != (var5.field_d ^ -1)) {
                      L6: {
                        if (var5.field_d != 1) {
                          break L6;
                        } else {
                          var6 = (DataInputStream) (var5.field_e);
                          var6.read();
                          var6.close();
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      gi.a((byte) -122, 1L);
                      continue L5;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final bd a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 >= -24) {
          L0: {
            this.c(-92, -27);
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((bd) (this)).field_i = stackIn_8_1 != 0;
          return (bd) (this);
        } else {
          L1: {
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((bd) (this)).field_i = stackIn_4_1 != 0;
          return (bd) (this);
        }
    }

    final bd b(int param0, int param1) {
        if (param0 < 38) {
            field_j = (String) null;
            this.field_g = param1;
            return (bd) (this);
        }
        this.field_g = param1;
        return (bd) (this);
    }

    final void a(int param0) {
        this.field_h = 0;
        this.field_c = null;
        this.field_b = null;
        this.field_n = 0;
        this.field_g = 0;
        this.field_l = -1;
        int var2 = 100 / ((param0 - -48) / 47);
        this.field_e = 256;
    }

    final void a(int param0, bd param1) {
        try {
            param1.field_c = this.field_c;
            param1.field_e = this.field_e;
            param1.field_i = this.field_i;
            param1.field_g = this.field_g;
            param1.field_l = this.field_l;
            param1.field_b = this.field_b;
            int var3_int = -63 / ((1 - param0) / 43);
            param1.field_n = this.field_n;
            param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "bd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final bd a(ci[] param0, byte param1) {
        RuntimeException var3 = null;
        bd stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_b = param0;
            if (param1 == 45) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bd.L(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (bd) (this);
        }
    }

    final void a(gl param0, bd param1, hf param2, int param3, byte param4, int param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_i) {
                param1.a(param3, param0, param5, 1, param2);
                param1.a(-95);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((this.field_l ^ -1) > 0) {
                break L2;
              } else {
                param1.field_l = this.field_l;
                break L2;
              }
            }
            L3: {
              if ((this.field_g ^ -1) == 2147483647) {
                break L3;
              } else {
                param1.field_g = this.field_g;
                break L3;
              }
            }
            L4: {
              if (-2147483648 != this.field_h) {
                param1.field_h = this.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_e ^ -1) != 2147483647) {
                param1.field_e = this.field_e;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param4 < -125) {
                break L6;
              } else {
                this.b(-126, true);
                break L6;
              }
            }
            L7: {
              if (this.field_n >= -1) {
                param1.field_n = this.field_n;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_c != null) {
                param1.field_c = this.field_c;
                break L8;
              } else {
                break L8;
              }
            }
            if (null == this.field_b) {
              break L0;
            } else {
              param1.field_b = this.field_b;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var7);

            stackIn_26_1 = new StringBuilder().append("bd.K(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final bd c(int param0, int param1) {
        this.field_h = param1;
        if (param0 != 2) {
            return (bd) null;
        }
        return (bd) (this);
    }

    bd() {
        this.field_h = -2147483648;
        this.field_e = -2147483648;
        this.field_i = false;
        this.field_b = null;
        this.field_c = null;
        this.field_g = -2147483648;
        this.field_l = -2;
        this.field_n = -2;
    }

    public static void b(int param0) {
        field_k = null;
        field_m = null;
        field_j = null;
        field_f = null;
        int var1 = 119 % ((param0 - -36) / 41);
    }

    static {
        field_f = new String[]{"The basic military fatigues offer minimal protection to attacks.", "Combat armour uses advanced reactive plating to absorb attacks and deflect damage away from the wearer.", "Battle armour uses alien-armoured plates taken from the battle field and their UFOs, remoulding them to provide a suit of tight fitting armour that will greatly increace the chance of our soldiers surviving in the field against the aliens' superior firepower.", "Shielded armour takes a regular suit of battle armour and places an alien shield module in the chest piece. This has the effect of allowing a soldier to use a heavy weapon while also recieving the benefit of all-round shielding."};
        field_j = "achievements to collect";
        field_d = 4;
    }
}
