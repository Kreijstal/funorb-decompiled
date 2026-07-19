/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class li implements sp {
    private long field_a;
    static String field_b;

    public final String a(boolean param0) {
        String var3 = null;
        if (param0) {
          if (!this.a(26921)) {
            if (kh.a(-104) < this.field_a + 350L) {
              return null;
            } else {
              return this.b(8192);
            }
          } else {
            return null;
          }
        } else {
          var3 = (String) null;
          li.a(-62, -108, (String) null);
          if (!this.a(26921)) {
            if (kh.a(-104) < this.field_a + 350L) {
              return null;
            } else {
              return this.b(8192);
            }
          } else {
            return null;
          }
        }
    }

    abstract pt c(int param0);

    public final void a(byte param0) {
        String discarded$0 = null;
        if (param0 <= 62) {
            discarded$0 = this.b(-122);
            this.field_a = kh.a(-74);
            return;
        }
        this.field_a = kh.a(-74);
    }

    abstract String b(int param0);

    public final pt b(boolean param0) {
        if (!(!this.a(26921))) {
            return vb.field_o;
        }
        if (!param0) {
            this.a((byte) 120);
            if (!((kh.a(-113) ^ -1L) <= (this.field_a - -350L ^ -1L))) {
                return jc.field_Pc;
            }
            return this.c(0);
        }
        if (!((kh.a(-113) ^ -1L) <= (this.field_a - -350L ^ -1L))) {
            return jc.field_Pc;
        }
        return this.c(0);
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -90) {
            String var2 = (String) null;
            li.a(0, -79, (String) null);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 101 % ((65 - param0) / 43);
              nm.field_a = false;
              ss.field_t = false;
              if (ml.field_m == null) {
                break L1;
              } else {
                if (!ml.field_m.field_z) {
                  break L1;
                } else {
                  L2: {
                    if ((param1 ^ -1) == -9) {
                      L3: {
                        if (nf.field_a) {
                          param2 = jr.field_p;
                          break L3;
                        } else {
                          param2 = id.field_e;
                          break L3;
                        }
                      }
                      param1 = 2;
                      vr.field_b.a(se.field_a, 122);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    var4 = 1;
                    if (10 == param1) {
                      bt.a(10);
                      var4 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var4 == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (nm.field_a) {
                          param2 = sn.a(bc.field_v, 107, new String[]{param2});
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (!ae.field_f) {
                          break L7;
                        } else {
                          param2 = sl.field_n;
                          break L7;
                        }
                      }
                      ml.field_m.a((byte) -117, param1, param2);
                      break L5;
                    }
                  }
                  if (256 == param1) {
                    break L1;
                  } else {
                    if (10 != param1) {
                      if (nf.field_a) {
                        break L1;
                      } else {
                        vr.field_b.h(310);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("li.I(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    static {
        field_b = "to return to the normal view.";
    }
}
