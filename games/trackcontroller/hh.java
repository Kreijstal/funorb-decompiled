/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hh implements Iterator {
    static String field_b;
    private gb field_d;
    private gb field_c;
    private rj field_a;

    public final boolean hasNext() {
        return ((hh) this).field_a.field_e != ((hh) this).field_d;
    }

    public final void remove() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((hh) this).field_c != null) {
              ((hh) this).field_c.e(0);
              ((hh) this).field_c = null;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "hh.remove()");
        }
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "hh.D(" + 52 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        la var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ve var5_ref = null;
        ve var6 = null;
        String var6_ref = null;
        String var7 = null;
        ve var7_ref = null;
        int var8 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = ne.field_a;
            var2 = var1_ref.h(16383);
            if (0 != var2) {
              if (var2 != 1) {
                if (var2 == 2) {
                  L1: {
                    if (q.field_a == 1) {
                      q.field_a = 2;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (3 != var2) {
                    if (var2 != 4) {
                      hb.a((Throwable) null, 0, "F1: " + jc.b(77));
                      lj.a((byte) 118);
                      break L0;
                    } else {
                      q.field_a = 1;
                      var3 = var1_ref.g(0);
                      la.field_q = var3.intern();
                      var4 = var1_ref.h(16383);
                      hj.a((byte) 100, var4);
                      return;
                    }
                  } else {
                    L2: {
                      if (q.field_a == 2) {
                        q.field_a = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  }
                }
              } else {
                L3: {
                  if (ag.field_d != null) {
                    break L3;
                  } else {
                    ag.field_d = new bj(128);
                    ei.field_o = 0;
                    break L3;
                  }
                }
                L4: {
                  var3 = var1_ref.g(0);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1_ref.g(0);
                  var5 = var1_ref.g(0);
                  var6 = ob.a(-90, var4_ref_String);
                  if (var6 == null) {
                    var6 = ob.a(50, var5);
                    if (var6 == null) {
                      break L5;
                    } else {
                      int discarded$7 = -11133;
                      ag.field_d.a((gb) (Object) var6, (long)r.a((CharSequence) (Object) var4_ref_String).hashCode(), -61);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var6 == null) {
                    var6 = new ve();
                    int discarded$8 = -11133;
                    ag.field_d.a((gb) (Object) var6, (long)r.a((CharSequence) (Object) var4_ref_String).hashCode(), -105);
                    int fieldTemp$9 = ei.field_o;
                    ei.field_o = ei.field_o + 1;
                    var6.field_R = fieldTemp$9;
                    oj.field_d.a((byte) -97, (fc) (Object) var6);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var3 == null) {
                    break L7;
                  } else {
                    var3 = var3.intern();
                    break L7;
                  }
                }
                var6.field_ib = var3;
                var6.field_jb = var4_ref_String;
                var6.a(-104);
                var7_ref = (ve) (Object) oj.field_d.b(2);
                L8: while (true) {
                  L9: {
                    if (var7_ref == null) {
                      break L9;
                    } else {
                      if (!aj.a(true, var7_ref, var6)) {
                        break L9;
                      } else {
                        var7_ref = (ve) (Object) oj.field_d.a(10);
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (var7_ref != null) {
                        break L11;
                      } else {
                        oj.field_d.a((byte) -106, (fc) (Object) var6);
                        if (var8 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    int discarded$10 = -126;
                    lj.a((fc) (Object) var7_ref, (fc) (Object) var6);
                    break L10;
                  }
                  return;
                }
              }
            } else {
              L12: {
                if (ug.field_cb == null) {
                  ug.field_cb = new bj(128);
                  jc.field_c = 0;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var1_ref.h(16383) != 1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L13;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  break L13;
                }
              }
              L14: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1_ref.g(0);
                if (var3_int == 0) {
                  break L14;
                } else {
                  String discarded$11 = var1_ref.g(0);
                  break L14;
                }
              }
              L15: {
                var5_ref = nj.a((byte) 125, var4_ref_String);
                var6_ref = var1_ref.g(0);
                int discarded$12 = -11133;
                var7 = r.a((CharSequence) (Object) var4_ref_String);
                if (var7 == null) {
                  var7 = var4_ref_String;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (var5_ref != null) {
                  break L16;
                } else {
                  var5_ref = nj.a((byte) 124, var6_ref);
                  if (var5_ref == null) {
                    break L16;
                  } else {
                    ug.field_cb.a((gb) (Object) var5_ref, (long)var7.hashCode(), -54);
                    break L16;
                  }
                }
              }
              L17: {
                if (var5_ref == null) {
                  var5_ref = new ve();
                  ug.field_cb.a((gb) (Object) var5_ref, (long)var7.hashCode(), 112);
                  int fieldTemp$13 = jc.field_c;
                  jc.field_c = jc.field_c + 1;
                  var5_ref.field_R = fieldTemp$13;
                  pb.field_d.a((byte) -111, (fc) (Object) var5_ref);
                  break L17;
                } else {
                  break L17;
                }
              }
              var5_ref.field_jb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "hh.B(" + 128 + ')');
        }
    }

    public final Object next() {
        gb var1 = null;
        RuntimeException var1_ref = null;
        RuntimeException stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        gb stackOut_5_0 = null;
        try {
          L0: {
            L1: {
              L2: {
                var1 = ((hh) this).field_d;
                if (var1 == ((hh) this).field_a.field_e) {
                  break L2;
                } else {
                  ((hh) this).field_d = var1.field_k;
                  if (!TrackController.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var1 = null;
              ((hh) this).field_d = null;
              break L1;
            }
            ((hh) this).field_c = var1;
            stackOut_5_0 = (gb) var1;
            stackIn_6_0 = (RuntimeException) (Object) stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1_ref, "hh.next()");
        }
        return (Object) (Object) stackIn_6_0;
    }

    final static void a() {
        RuntimeException var1 = null;
        String var1_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!vg.field_o) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (null == kb.field_a) {
                  break L1;
                } else {
                  kb.field_a.t(20252);
                  break L1;
                }
              }
              int discarded$1 = -119;
              var1_ref = uj.a();
              ra.field_y = new rl(var1_ref, (String) null, true, false, false);
              gl.field_E.d((byte) -120, (al) (Object) re.field_g);
              re.field_g.b((al) (Object) ra.field_y, -82);
              re.field_g.o(0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "hh.C(" + 111 + ')');
        }
    }

    hh(rj param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((hh) this).field_c = null;
        try {
          L0: {
            ((hh) this).field_a = param0;
            ((hh) this).field_d = ((hh) this).field_a.field_e.field_k;
            ((hh) this).field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hh.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (rl.field_N == 10) {
                  break L2;
                } else {
                  if (ij.b(1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              nj.a(-27958);
              rl.field_N = 11;
              break L1;
            }
            qh.field_i = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "hh.A(" + -28717 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create a free account to start using this feature";
    }
}
