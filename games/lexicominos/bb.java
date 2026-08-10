/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends nb implements jk {
    private String[] field_D;
    private ag field_L;
    private kf[] field_G;
    static m field_J;
    static volatile int field_I;
    static String field_K;
    static String[] field_F;
    static db field_C;

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        le var5 = ql.field_Q;
        if (null != this.field_D) {
            var5.a(ka.field_a, this.field_t + param2, param1 + this.field_o, this.field_j, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_E);
        }
    }

    final void a(String[] param0, boolean param1) {
        kf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        kf stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        kf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        kf stackIn_20_0;
        int stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_A.g(-81);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      L3: {
                        if (!param1) {
                          break L3;
                        } else {
                          field_J = (m) null;
                          break L3;
                        }
                      }
                      var4 = new uj(ql.field_Q, 0, 1);
                      this.field_G = new kf[1 + var3_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          L5: {
                            this.field_G[var3_int] = new kf(bc.field_J, (vd) (this));
                            this.field_G[var3_int].field_i = (rd) ((Object) var4);
                            stackIn_19_0 = this.field_G[var3_int];

                            stackIn_19_1 = 15;

                            stackIn_19_2 = 100;

                            if (param1) {
                              stackIn_20_0 = (kf) ((Object) stackIn_19_0);
                              stackIn_20_1 = stackIn_19_1;
                              stackIn_20_2 = stackIn_19_2;
                              stackIn_20_3 = 0;
                              break L5;
                            } else {
                              stackIn_20_0 = (kf) ((Object) stackIn_19_0);
                              stackIn_20_1 = stackIn_19_1;
                              stackIn_20_2 = stackIn_19_2;
                              stackIn_20_3 = 1;
                              break L5;
                            }
                          }
                          ((kf) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2, stackIn_20_3 != 0, (1 + var3_int) * 16 + 20, 0);
                          this.b((byte) -80, this.field_G[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L6: {
                            this.field_G[var5] = new kf(this.field_D[var5], (vd) (this));
                            this.field_G[var5].field_i = (rd) ((Object) var4);
                            this.field_G[var5].field_q = cb.field_A;
                            stackIn_15_0 = this.field_G[var5];

                            stackIn_15_1 = 15;

                            stackIn_15_2 = 80;

                            if (param1) {
                              stackIn_16_0 = (kf) ((Object) stackIn_15_0);
                              stackIn_16_1 = stackIn_15_1;
                              stackIn_16_2 = stackIn_15_2;
                              stackIn_16_3 = 0;
                              break L6;
                            } else {
                              stackIn_16_0 = (kf) ((Object) stackIn_15_0);
                              stackIn_16_1 = stackIn_15_1;
                              stackIn_16_2 = stackIn_15_2;
                              stackIn_16_3 = 1;
                              break L6;
                            }
                          }
                          ((kf) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, 20 + 16 * var5, 0);
                          this.b((byte) 112, this.field_G[var5]);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_D[var4_int] = pj.a((CharSequence) ((Object) param0[var4_int]), (byte) -126).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_D = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("bb.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 120 % ((param3 - -13) / 55);
            if (super.a(param0, param1, param2, (byte) 42)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackIn_7_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param1) {
                  stackIn_11_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("bb.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= this.field_D.length) {
                L2: {
                  if (this.field_G[this.field_D.length] == param4) {
                    this.field_L.a((byte) -12);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param2 == 215535458) {
                    break L3;
                  } else {
                    field_F = (String[]) null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_G[var6_int] != param4) {
                    break L4;
                  } else {
                    this.field_L.a(this.field_D[var6_int], (byte) 110);
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("bb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    var4 = ck.a(param0, (byte) -48);
                    if (var4 == null) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (cf.a(var4.charAt(0), (byte) 78)) {
                            break L2;
                          } else {
                            if (cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param0.length()) {
                                  if ((var5 ^ -1) < param2) {
                                    stackIn_33_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!cf.a((char) var7, (byte) 78)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (2 > var5) {
                                      break L5;
                                    } else {
                                      if (param1) {
                                        break L5;
                                      } else {
                                        stackIn_28_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("bb.D(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L6;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  return stackIn_33_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_F = null;
        field_C = null;
        field_K = null;
        if (param0 != -26) {
            field_C = (db) null;
        }
        field_J = null;
    }

    bb(ag param0) {
        super(0, 0, 0, 0, (rd) null);
        try {
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = 0;
        field_J = new m("email");
        field_K = "Create";
        field_F = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new db(311, 450);
    }
}
