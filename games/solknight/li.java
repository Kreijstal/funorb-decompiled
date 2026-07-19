/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends gg {
    int field_n;
    static String field_j;
    int field_m;
    static String[] field_h;
    int field_l;
    int field_i;
    int field_o;
    li field_k;

    public static void a(int param0) {
        try {
            field_h = null;
            field_j = null;
            if (param0 != 26333) {
                li.a(-110);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "li.A(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$3 = 0;
        String discarded$4 = null;
        int fieldTemp$5 = 0;
        RuntimeException var1 = null;
        jd var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ia var5_ref = null;
        ia var6 = null;
        String var6_ref = null;
        String var7 = null;
        ia var7_ref = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        ia stackIn_51_0 = null;
        ia stackIn_56_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ia stackOut_50_0 = null;
        ia stackOut_55_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = te.field_N;
            var2 = var1_ref.j(255);
            if ((var2 ^ -1) != -1) {
              if ((var2 ^ -1) == -2) {
                L1: {
                  if (ok.field_a != null) {
                    break L1;
                  } else {
                    ok.field_a = new jh(128);
                    ng.field_c = 0;
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.h(55);
                  if (var3.equals("")) {
                    var3 = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.h(75);
                  var5 = var1_ref.h(56);
                  var6 = mc.a(var4_ref_String, (byte) 105);
                  if (var6 != null) {
                    break L3;
                  } else {
                    var6 = mc.a(var5, (byte) 105);
                    if (var6 == null) {
                      break L3;
                    } else {
                      ok.field_a.a((long)jg.a((CharSequence) ((Object) var4_ref_String), -2).hashCode(), (byte) -109, var6);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != var6) {
                    break L4;
                  } else {
                    var6 = new ia();
                    ok.field_a.a((long)jg.a((CharSequence) ((Object) var4_ref_String), -2).hashCode(), (byte) -109, var6);
                    fieldTemp$3 = ng.field_c;
                    ng.field_c = ng.field_c + 1;
                    var6.field_jb = fieldTemp$3;
                    va.field_f.a(var6, -7044);
                    break L4;
                  }
                }
                L5: {
                  if (null == var3) {
                    break L5;
                  } else {
                    var3 = var3.intern();
                    break L5;
                  }
                }
                var6.field_gb = var3;
                var6.field_ib = var4_ref_String;
                var6.c(10);
                var7_ref = (ia) ((Object) va.field_f.a((byte) 51));
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var7_ref == null) {
                        break L8;
                      } else {
                        stackOut_50_0 = (ia) (var6);
                        stackIn_56_0 = stackOut_50_0;
                        stackIn_51_0 = stackOut_50_0;
                        if (var8 != 0) {
                          break L7;
                        } else {
                          if (!je.a(stackIn_51_0, var7_ref, true)) {
                            break L8;
                          } else {
                            var7_ref = (ia) ((Object) va.field_f.b(-40));
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    stackOut_55_0 = (ia) (var7_ref);
                    stackIn_56_0 = stackOut_55_0;
                    break L7;
                  }
                  L9: {
                    L10: {
                      if (stackIn_56_0 != null) {
                        break L10;
                      } else {
                        va.field_f.a(var6, -7044);
                        if (var8 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ha.a(var6, (byte) 51, var7_ref);
                    break L9;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if ((var2 ^ -1) == -3) {
                  L11: {
                    if (1 == lh.field_p) {
                      lh.field_p = 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L12: {
                    if (param0 >= 116) {
                      break L12;
                    } else {
                      li.a(-55);
                      break L12;
                    }
                  }
                  if (3 == var2) {
                    L13: {
                      if (-3 != (lh.field_p ^ -1)) {
                        break L13;
                      } else {
                        lh.field_p = 1;
                        break L13;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -5) {
                      hi.a((Throwable) null, "F1: " + oc.a(false), 1);
                      je.a(false);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      lh.field_p = 1;
                      var3 = var1_ref.h(37);
                      qa.field_r = var3.intern();
                      var4 = var1_ref.j(255);
                      pk.a((byte) -48, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              L14: {
                if (null != lc.field_m) {
                  break L14;
                } else {
                  lc.field_m = new jh(128);
                  kj.field_O = 0;
                  break L14;
                }
              }
              L15: {
                if ((var1_ref.j(255) ^ -1) != -2) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L15;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L15;
                }
              }
              L16: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1_ref.h(20);
                if (var3_int != 0) {
                  discarded$4 = var1_ref.h(31);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                var5_ref = ug.a(var4_ref_String, 113);
                var6_ref = var1_ref.h(105);
                var7 = jg.a((CharSequence) ((Object) var4_ref_String), -2);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (var5_ref == null) {
                  var5_ref = ug.a(var6_ref, 115);
                  if (var5_ref != null) {
                    lc.field_m.a((long)var7.hashCode(), (byte) -109, var5_ref);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                if (var5_ref != null) {
                  break L19;
                } else {
                  var5_ref = new ia();
                  lc.field_m.a((long)var7.hashCode(), (byte) -109, var5_ref);
                  fieldTemp$5 = kj.field_O;
                  kj.field_O = kj.field_O + 1;
                  var5_ref.field_jb = fieldTemp$5;
                  vb.field_h.a(var5_ref, -7044);
                  break L19;
                }
              }
              var5_ref.field_ib = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "li.B(" + param0 + ')');
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

    li(int param0, int param1, int param2, int param3, int param4) {
        try {
            this.field_i = param4;
            this.field_m = param3;
            this.field_o = param1;
            this.field_l = param0;
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "li.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_h = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = "Loading extra data";
    }
}
