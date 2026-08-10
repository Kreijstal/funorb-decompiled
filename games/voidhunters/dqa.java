/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dqa extends shb implements nea {
    ij field_t;
    static String field_u;

    boolean e(byte param0) {
        if (param0 != -120) {
            shb var3 = (shb) null;
            this.a((shb) null, -32);
        }
        return null != this.g((byte) -123) ? true : false;
    }

    final boolean a(boolean param0, shb param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        shb var4 = null;
        wc var5 = null;
        shb var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                dqa.b(false);
                break L1;
              }
            }
            if (!this.field_t.b(115)) {
              var3 = new wc(this.field_t);
              var4 = (shb) ((Object) var3.c(570));
              L2: while (true) {
                if (var4 == null) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (!var4.e((byte) -120)) {
                      break L3;
                    } else {
                      var5 = new wc(this.field_t);
                      var5.a(var4, -28791);
                      var6 = (shb) ((Object) var5.a(19072));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(0, param1)) {
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (shb) ((Object) var5.a(19072));
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                  var4 = (shb) ((Object) var3.a(19072));
                  continue L2;
                }
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("dqa.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int var7 = VoidHunters.field_G;
        if (param1 == 0) {
            if (!(null == this.field_q)) {
                this.field_q.a(13, (shb) (this), param0, param3, true);
            }
        }
        wc var5 = new wc(this.field_t);
        if (param2 < 47) {
            return;
        }
        shb var6 = (shb) ((Object) var5.b((byte) 105));
        while (var6 != null) {
            var6.b(param0 - -this.field_g, param1, 112, param3 + this.field_r);
            var6 = (shb) ((Object) var5.a((byte) 108));
        }
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        RuntimeException runtimeException = null;
        wc var7 = null;
        int var8 = 0;
        shb var9 = null;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var8 = -69 % ((param0 - 52) / 52);
            var7 = new wc(this.field_t);
            var9 = (shb) ((Object) var7.c(570));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b((byte) -63)) {
                    break L2;
                  } else {
                    var9.a((byte) -109, param1 - -this.field_g, param2, this.field_r + param3, param4, param5);
                    var9 = (shb) ((Object) var7.a(19072));
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("dqa.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ')');
        }
    }

    void f(byte param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(this.field_t);
        shb var3 = (shb) ((Object) var2.c(570));
        while (var3 != null) {
            var3.f((byte) -34);
            var3 = (shb) ((Object) var2.a(param0 ^ -19106));
        }
        if (param0 != -34) {
            field_u = (String) null;
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        if (param0) {
            field_u = (String) null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        RuntimeException var8 = null;
        shb var9 = null;
        int var10 = 0;
        wc var11 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var11 = new wc(this.field_t);
            var9 = (shb) ((Object) var11.c(570));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b((byte) -63)) {
                    break L2;
                  } else {
                    if (var9.a(param0, param1 - -this.field_g, param2, param3, param4, param5 - -this.field_r, (byte) -61)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var9 = (shb) ((Object) var11.a(19072));
                      continue L1;
                    }
                  }
                }
              }
              if (param6 <= -17) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.d((byte) -101);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("dqa.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final int c(int param0) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = param0;
        wc var3 = new wc(this.field_t);
        shb var4 = (shb) ((Object) var3.c(570));
        while (var4 != null) {
            var5 = var4.c(param0 ^ 0);
            if (!(var2 >= var5)) {
                var2 = var5;
            }
            var4 = (shb) ((Object) var3.a(19072));
        }
        return var2;
    }

    dqa(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4, (sba) null);
        this.field_t = new ij();
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h((byte) 13);
    }

    String d(byte param0) {
        String var4 = null;
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(this.field_t);
        shb var3 = (shb) ((Object) var2.c(570));
        while (var3 != null) {
            var4 = var3.d((byte) 125);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (shb) ((Object) var2.a(19072));
        }
        if (param0 == 125) {
            return null;
        }
        this.field_t = (ij) null;
        return null;
    }

    final static void a(int param0, boolean param1, boolean param2, oib param3, int param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          L0: {
            L1: {
              nfa.field_e[0] = jeb.field_b.nextInt();
              nfa.field_e[1] = jeb.field_b.nextInt();
              nfa.field_e[2] = (int)(iqb.field_p >> -1292461600);
              ss.field_p.field_e = 0;
              nfa.field_e[3] = (int)iqb.field_p;
              ss.field_p.d(nfa.field_e[0], 332614536);
              ss.field_p.d(nfa.field_e[1], 332614536);
              ss.field_p.d(nfa.field_e[2], 332614536);
              ss.field_p.d(nfa.field_e[3], 332614536);
              nq.a((byte) -91, ss.field_p);
              ss.field_p.a(param4, true);
              param3.a(ss.field_p, -26216);
              dpa.field_p.field_e = 0;
              if (!param2) {
                dpa.field_p.c(0, 16);
                break L1;
              } else {
                dpa.field_p.c(0, 18);
                break L1;
              }
            }
            L2: {
              dpa.field_p.field_e = dpa.field_p.field_e + 2;
              var5_int = dpa.field_p.field_e;
              dpa.field_p.d(fk.field_c, 332614536);
              dpa.field_p.a(rda.field_o, 90);
              var6 = 0;
              if (bua.field_o) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!js.field_q) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (param1) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (vda.field_o == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              dpa.field_p.c(0, var6);
              var7 = kh.a(-6465, vpa.b((byte) -121));
              if (var7 == null) {
                var7 = "";
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0 < -64) {
                break L7;
              } else {
                field_u = (String) null;
                break L7;
              }
            }
            L8: {
              dpa.field_p.a(true, var7);
              if (vda.field_o == null) {
                break L8;
              } else {
                dpa.field_p.b((byte) 0, vda.field_o);
                break L8;
              }
            }
            ufa.a(dpa.field_p, (byte) -126, jnb.field_p, bib.field_g, ss.field_p);
            dpa.field_p.a(dpa.field_p.field_e - var5_int, -125);
            lnb.b(-1, 111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("dqa.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final void b(int param0, shb param1) {
        try {
            this.field_t.b(-10258, param1);
            if (param0 != -18756) {
                this.field_t = (ij) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "dqa.PA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        wc var5 = null;
        shb var6 = null;
        int var7 = 0;
        int var8 = 0;
        shb var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var5 = new wc(this.field_t);
            var6 = (shb) ((Object) var5.c(570));
            L1: while (true) {
              if (var6 == null) {
                L2: {
                  if (param1 < -8) {
                    break L2;
                  } else {
                    var9 = (shb) null;
                    this.a(false, (shb) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                discarded$2 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (param3 < var7) {
                    var6.a(false, param0, 1 + param3, param2);
                    var6 = (shb) ((Object) var5.a(19072));
                    continue L1;
                  } else {
                    discarded$3 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("dqa.SA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, shb param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        shb var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 0) {
              var3 = new wc(this.field_t);
              var4 = (shb) ((Object) var3.c(570));
              L1: while (true) {
                if (var4 == null) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4.a(param0 ^ 0, param1)) {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = (shb) ((Object) var3.a(param0 + 19072));
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("dqa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        shb var6_ref_shb = null;
        int var6 = 0;
        int var7 = 0;
        wc var8 = null;
        int stackIn_8_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            var8 = new wc(this.field_t);
            var6_ref_shb = (shb) ((Object) var8.c(570));
            L1: while (true) {
              L2: {
                if (var6_ref_shb == null) {
                  break L2;
                } else {
                  if (!var6_ref_shb.b((byte) -63)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var6_ref_shb.e((byte) -120)) {
                        break L3;
                      } else {
                        if (var6_ref_shb.a(param0 ^ 0, param1, param2, param3)) {
                          stackIn_8_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6_ref_shb = (shb) ((Object) var8.a(param0 + 34906));
                    continue L1;
                  }
                }
              }
              L4: {
                if (param0 == -15834) {
                  break L4;
                } else {
                  this.field_t = (ij) null;
                  break L4;
                }
              }
              var6 = param1;
              if ((var6 ^ -1) == -81) {
                L5: {
                  if (!si.field_o[81]) {
                    stackIn_17_0 = this.a(true, param2);
                    break L5;
                  } else {
                    stackIn_17_0 = this.a(param2, 0);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("dqa.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_17_0;
        }
    }

    private final void h(byte param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 13) {
            return;
        }
        wc var2 = new wc(this.field_t);
        shb var3 = (shb) ((Object) var2.c(570));
        while (var3 != null) {
            var3.a(false);
            var3 = (shb) ((Object) var2.a(param0 + 19059));
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        shb var6 = null;
        int var7 = 0;
        shb var8 = null;
        wc var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            super.a(param0, param1, param2 + 0, param3);
            var9 = new wc(this.field_t);
            var6 = (shb) ((Object) var9.c(param2 + 1551));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b((byte) -63)) {
                    break L2;
                  } else {
                    var6.a(this.field_r + param0, param1 - -this.field_g, -981, param3);
                    var6 = (shb) ((Object) var9.a(19072));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param2 == -981) {
                  break L3;
                } else {
                  var8 = (shb) null;
                  this.a(-120, 53, 71, (shb) null, 57, 10, 54);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("dqa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param1, param2, (byte) 123, param3)) {
                break L1;
              } else {
                this.a(90, param2, param1, param3);
                this.a(param1, (byte) -89, param3, param2);
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.e((byte) -25);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("dqa.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        wc var8 = null;
        RuntimeException var8_ref = null;
        shb var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == -6006) {
              var8 = new wc(this.field_t);
              var9 = (shb) ((Object) var8.c(570));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b((byte) -63)) {
                      break L2;
                    } else {
                      L3: {
                        if (!var9.e((byte) -120)) {
                          break L3;
                        } else {
                          if (var9.a(param0, -6006, param2, param3, param4, param5, param6)) {
                            stackIn_11_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var9 = (shb) ((Object) var8.a(19072));
                      continue L1;
                    }
                  }
                }
                stackIn_14_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8_ref);

            stackIn_17_1 = new StringBuilder().append("dqa.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    shb g(byte param0) {
        wc var2;
        shb var3;
        int var4;
        shb var5;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 <= -3) {
            break L0;
          } else {
            var5 = (shb) null;
            this.a(5, -105, 25, 32, (shb) null, 72, (byte) 42);
            break L0;
          }
        }
        var2 = new wc(this.field_t);
        var3 = (shb) ((Object) var2.c(570));
        L1: while (true) {
          if (var3 != null) {
            if (!var3.e((byte) -120)) {
              var3 = (shb) ((Object) var2.a(19072));
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final boolean a(shb param0, int param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        shb var4 = null;
        wc var5 = null;
        shb var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == 0) {
              if (!this.field_t.b(param1 ^ 113)) {
                var3 = new wc(this.field_t);
                var4 = (shb) ((Object) var3.b((byte) 70));
                L1: while (true) {
                  if (var4 == null) {
                    stackIn_18_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L2: {
                      if (!var4.e((byte) -120)) {
                        break L2;
                      } else {
                        var5 = new wc(this.field_t);
                        var5.a((byte) 88, var4);
                        var6 = (shb) ((Object) var5.a((byte) 108));
                        L3: while (true) {
                          if (var6 == null) {
                            break L2;
                          } else {
                            if (!var6.a(0, param0)) {
                              var6 = (shb) ((Object) var5.a((byte) 108));
                              continue L3;
                            } else {
                              stackIn_14_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                    var4 = (shb) ((Object) var3.a((byte) 108));
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("dqa.OA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    static {
        field_u = "Play the game without logging in just yet";
    }
}
