/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j implements Iterator {
    static float field_i;
    private l field_f;
    static int field_e;
    private l field_d;
    static boolean field_g;
    private int field_c;
    static mg[] field_k;
    static e field_h;
    static int field_l;
    static int field_b;
    static String field_a;
    private gk field_j;

    public static void b(int param0) {
        field_k = null;
        int var1 = 97 % ((-32 - param0) / 44);
        field_a = null;
        field_h = null;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        if (this.field_j.field_h[this.field_c + -1] == this.field_d) {
          L0: while (true) {
            if (this.field_c < this.field_j.field_a) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              if (this.field_j.field_h[fieldTemp$1].field_f == this.field_j.field_h[-1 + this.field_c]) {
                this.field_d = this.field_j.field_h[-1 + this.field_c];
                continue L0;
              } else {
                this.field_d = this.field_j.field_h[this.field_c + -1].field_f;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        int var2 = 0;
        l var3 = null;
        l var4 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        if (this.field_d == this.field_j.field_h[-1 + this.field_c]) {
          L0: while (true) {
            if (this.field_c < this.field_j.field_a) {
              fieldTemp$2 = this.field_c;
              this.field_c = this.field_c + 1;
              var3 = this.field_j.field_h[fieldTemp$2].field_f;
              if (var3 != this.field_j.field_h[this.field_c + -1]) {
                this.field_d = var3.field_f;
                this.field_f = var3;
                return var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_d;
          this.field_d = var4.field_f;
          this.field_f = var4;
          return var4;
        }
    }

    final static gh a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        gh var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        gh stackIn_13_0 = null;
        gh stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_18_0 = null;
        gh stackOut_12_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (null != oa.field_h) {
              if (param1 != null) {
                if (0 != param1.length()) {
                  var6 = (CharSequence) ((Object) param1);
                  var2 = c.a(var6, true);
                  if (var2 != null) {
                    if (param0 == 0) {
                      var3 = (gh) ((Object) oa.field_h.a((long)var2.hashCode(), (byte) 82));
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_Hb);
                          var4 = c.a(var7, true);
                          if (!var4.equals(var2)) {
                            var3 = (gh) ((Object) oa.field_h.c(48));
                            continue L1;
                          } else {
                            stackOut_18_0 = (gh) (var3);
                            stackIn_19_0 = stackOut_18_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackOut_12_0 = (gh) null;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  stackOut_6_0 = null;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref);
            stackOut_22_1 = new StringBuilder().append("j.E(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gh) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    private final void a(boolean param0) {
        if (param0) {
            return;
        }
        this.field_d = this.field_j.field_h[0].field_f;
        this.field_c = 1;
        this.field_f = null;
    }

    final static void a(boolean param0, int param1) {
        vc.a(false, param0, -16113);
        if (param1 <= -124) {
            return;
        }
        j.a(true, 95);
    }

    final static hh a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hh stackIn_4_0 = null;
        hh stackIn_7_0 = null;
        hh stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        hh stackIn_25_0 = null;
        hh stackIn_39_0 = null;
        hh stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        hh stackOut_12_0 = null;
        hh stackOut_24_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        hh stackOut_42_0 = null;
        hh stackOut_38_0 = null;
        hh stackOut_6_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = a.field_H;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 <= (var2_int ^ -1)) {
                if (param0.charAt(0) == 34) {
                  if (-35 != (param0.charAt(-1 + var2_int) ^ -1)) {
                    stackOut_12_0 = jj.field_f;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 != 92) {
                            L3: {
                              if (34 != var5) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L3;
                                } else {
                                  stackOut_24_0 = jj.field_f;
                                  stackIn_25_0 = stackOut_24_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          } else {
                            L4: {
                              if (var3 != 0) {
                                stackOut_20_0 = 0;
                                stackIn_21_0 = stackOut_20_0;
                                break L4;
                              } else {
                                stackOut_19_0 = 1;
                                stackIn_21_0 = stackOut_19_0;
                                break L4;
                              }
                            }
                            var3 = stackIn_21_0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = param1;
                  L5: while (true) {
                    if (var2_int > var4) {
                      L6: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (0 != (nf.field_b.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L6;
                          } else {
                            stackOut_42_0 = jj.field_f;
                            stackIn_43_0 = stackOut_42_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L7: {
                            if (var4 == 0) {
                              break L7;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_38_0 = jj.field_f;
                          stackIn_39_0 = stackOut_38_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L5;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackOut_6_0 = cb.field_a;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var2);
            stackOut_48_1 = new StringBuilder().append("j.F(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_39_0;
                } else {
                  return stackIn_43_0;
                }
              }
            }
          }
        }
    }

    public final void remove() {
        if (!(null != this.field_f)) {
            throw new IllegalStateException();
        }
        this.field_f.a(false);
        this.field_f = null;
    }

    final static boolean a(int param0) {
        if (param0 == -1) {
          if ((dj.field_n ^ -1) <= -21) {
            if (me.b(9)) {
              if (-1 > (mf.field_h ^ -1)) {
                if (md.a(11265)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          j.a(true, -78);
          if ((dj.field_n ^ -1) <= -21) {
            if (me.b(9)) {
              if (-1 > (mf.field_h ^ -1)) {
                if (md.a(11265)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    j(gk param0) {
        this.field_f = null;
        try {
            this.field_j = param0;
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_a = "Rankings";
    }
}
