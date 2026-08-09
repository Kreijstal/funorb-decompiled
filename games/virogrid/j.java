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
        int var2;
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
        int fieldTemp$1 = 0;
        int var2;
        l var3;
        l var4;
        var2 = Virogrid.field_F ? 1 : 0;
        if (this.field_d == this.field_j.field_h[-1 + this.field_c]) {
          L0: while (true) {
            if (this.field_c < this.field_j.field_a) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              var3 = this.field_j.field_h[fieldTemp$1].field_f;
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
        gh var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        gh stackIn_13_0 = null;
        gh stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
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
                            stackIn_19_0 = (gh) (var3);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = (gh) null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  stackIn_7_0 = null;
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
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("j.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
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
        hh stackIn_4_0 = null;
        hh stackIn_7_0 = null;
        hh stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        hh stackIn_25_0 = null;
        hh stackIn_39_0 = null;
        hh stackIn_43_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = a.field_H;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 <= (var2_int ^ -1)) {
                if (param0.charAt(0) == 34) {
                  if (-35 != (param0.charAt(-1 + var2_int) ^ -1)) {
                    stackIn_13_0 = jj.field_f;
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
                                  stackIn_25_0 = jj.field_f;
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
                                stackIn_21_0 = 0;
                                break L4;
                              } else {
                                stackIn_21_0 = 1;
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
                            stackIn_43_0 = jj.field_f;
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
                          stackIn_39_0 = jj.field_f;
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
                stackIn_7_0 = cb.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var2);

            stackIn_50_1 = new StringBuilder().append("j.F(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L8;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
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
