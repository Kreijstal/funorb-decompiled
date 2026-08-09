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
        return this.field_a.field_e != this.field_d;
    }

    public final void remove() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            if (this.field_c != null) {
              this.field_c.e(0);
              this.field_c = null;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "hh.remove()");
        }
    }

    public static void b(byte param0) {
        try {
            field_b = null;
            if (param0 <= 41) {
                field_b = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "hh.D(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        la var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        ve var5_ref = null;
        ve var6 = null;
        String var6_ref = null;
        ve var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 128) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var1 = ne.field_a;
            var2 = var1.h(param0 ^ 16255);
            if (0 != var2) {
              if ((var2 ^ -1) != -2) {
                if (-3 == (var2 ^ -1)) {
                  L2: {
                    if (-2 == (q.field_a ^ -1)) {
                      q.field_a = 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 != var2) {
                    if (-5 != (var2 ^ -1)) {
                      hb.a((Throwable) null, 0, "F1: " + jc.b(77));
                      lj.a((byte) 118);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      q.field_a = 1;
                      var3 = var1.g(param0 ^ 128);
                      la.field_q = ((String) (var3)).intern();
                      var4 = var1.h(16383);
                      hj.a((byte) 100, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    L3: {
                      if (-3 == (q.field_a ^ -1)) {
                        q.field_a = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                L4: {
                  if (ag.field_d != null) {
                    break L4;
                  } else {
                    ag.field_d = new bj(128);
                    ei.field_o = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1.g(0);
                  if (((String) (var3)).equals("")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1.g(0);
                  var5 = var1.g(0);
                  var6 = ob.a(param0 + -218, var4_ref_String);
                  if (var6 == null) {
                    var6 = ob.a(param0 + -78, var5);
                    if (var6 == null) {
                      break L6;
                    } else {
                      ag.field_d.a(var6, (long)r.a((CharSequence) ((Object) var4_ref_String), -11133).hashCode(), param0 + -189);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var6 == null) {
                    var6 = new ve();
                    ag.field_d.a(var6, (long)r.a((CharSequence) ((Object) var4_ref_String), -11133).hashCode(), -105);
                    fieldTemp$0 = ei.field_o;
                    ei.field_o = ei.field_o + 1;
                    var6.field_R = fieldTemp$0;
                    oj.field_d.a((byte) -97, var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 == null) {
                    break L8;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L8;
                  }
                }
                var6.field_ib = (String) (var3);
                var6.field_jb = var4_ref_String;
                var6.a(-104);
                var7 = (ve) ((Object) oj.field_d.b(2));
                L9: while (true) {
                  L10: {
                    if (var7 == null) {
                      break L10;
                    } else {
                      if (!aj.a(true, var7, var6)) {
                        break L10;
                      } else {
                        var7 = (ve) ((Object) oj.field_d.a(10));
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (var7 != null) {
                        break L12;
                      } else {
                        oj.field_d.a((byte) -106, var6);
                        if (var8 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    lj.a(var7, var6, -126);
                    break L11;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L13: {
                if (ug.field_cb == null) {
                  ug.field_cb = new bj(128);
                  jc.field_c = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var1.h(16383) != 1) {
                  stackIn_15_0 = 0;
                  break L14;
                } else {
                  stackIn_15_0 = 1;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1.g(0);
                if (var3_int == 0) {
                  break L15;
                } else {
                  var1.g(0);
                  break L15;
                }
              }
              L16: {
                var5_ref = nj.a((byte) 125, var4_ref_String);
                var6_ref = var1.g(0);
                var7_ref = r.a((CharSequence) ((Object) var4_ref_String), -11133);
                if (var7_ref == null) {
                  var7_ref = var4_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var5_ref != null) {
                  break L17;
                } else {
                  var5_ref = nj.a((byte) 124, var6_ref);
                  if (var5_ref == null) {
                    break L17;
                  } else {
                    ug.field_cb.a(var5_ref, (long)var7_ref.hashCode(), param0 ^ -182);
                    break L17;
                  }
                }
              }
              L18: {
                if (var5_ref == null) {
                  var5_ref = new ve();
                  ug.field_cb.a(var5_ref, (long)var7_ref.hashCode(), param0 ^ 240);
                  fieldTemp$1 = jc.field_c;
                  jc.field_c = jc.field_c + 1;
                  var5_ref.field_R = fieldTemp$1;
                  pb.field_d.a((byte) -111, var5_ref);
                  break L18;
                } else {
                  break L18;
                }
              }
              var5_ref.field_jb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1_ref), "hh.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public final Object next() {
        Object var1 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var1 = this.field_d;
                if (var1 == this.field_a.field_e) {
                  break L2;
                } else {
                  this.field_d = ((gb) (var1)).field_k;
                  if (!TrackController.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var1 = null;
              this.field_d = null;
              break L1;
            }
            this.field_c = (gb) (var1);
            stackIn_6_0 = var1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (var1), "hh.next()");
        }
        return stackIn_6_0;
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        String var1 = null;
        int decompiledRegionSelector0 = 0;
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
              if (param0 > 45) {
                var1 = uj.a(-119);
                ra.field_y = new rl(var1, (String) null, true, false, false);
                gl.field_E.d((byte) -120, re.field_g);
                re.field_g.b(ra.field_y, -82);
                re.field_g.o(0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "hh.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    hh(rj param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = null;
        try {
          L0: {
            this.field_a = param0;
            this.field_d = this.field_a.field_e.field_k;
            this.field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("hh.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
            L3: {
              qh.field_i = true;
              if (param0 == -28717) {
                break L3;
              } else {
                hh.b(-61);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "hh.A(" + param0 + ')');
        }
    }

    static {
        field_b = "Create a free account to start using this feature";
    }
}
