/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String[] field_d;
    static int field_b;
    static o[] field_c;
    static String field_a;

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            dd.b(true);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(boolean param0) {
        int stackIn_9_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        wi var3_ref_wi = null;
        ob var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        String var7 = null;
        jd var9 = null;
        byte[] var13 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = te.field_N;
              if (param0) {
                break L1;
              } else {
                var7 = (String) null;
                dd.a((byte) -90, (String) null, -21);
                break L1;
              }
            }
            var2 = var9.j(255);
            if (0 != var2) {
              if ((var2 ^ -1) != -2) {
                hi.a((Throwable) null, "A1: " + oc.a(false), 1);
                je.a(false);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                var3 = var9.e(true);
                var4 = (ob) ((Object) he.field_d.a((byte) 51));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var3 != var4.field_i) {
                        var4 = (ob) ((Object) he.field_d.b(-70));
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 == null) {
                    je.a(false);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4.c(10);
                    return;
                  }
                }
              }
            } else {
              var3_ref_wi = (wi) ((Object) bc.field_J.a((byte) 51));
              if (var3_ref_wi == null) {
                L4: {
                  if (param0) {
                    stackIn_9_0 = 0;
                    break L4;
                  } else {
                    stackIn_9_0 = 1;
                    break L4;
                  }
                }
                je.a(stackIn_9_0 != 0);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L5: {
                  var4_int = var9.j(255);
                  if (-1 != (var4_int ^ -1)) {
                    var13 = new byte[var4_int];
                    var9.a(var4_int, 0, -122, var13);
                    break L5;
                  } else {
                    var5 = null;
                    break L5;
                  }
                }
                var9.field_m = var9.field_m + 4;
                if (!var9.k(4)) {
                  je.a(false);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_ref_wi.c(10);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "dd.A(" + param0 + ')');
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
              return;
            }
          }
        }
    }

    final static void a(byte param0, String param1, int param2) {
        int var4 = 0;
        try {
            ce.field_b = false;
            ta.field_b = false;
            int var3_int = 59 / ((param0 - -69) / 36);
            if (ah.field_e != null) {
                if (!ah.field_e.field_J) {
                    return;
                }
                if ((param2 ^ -1) == -9) {
                    if (k.field_b) {
                        param1 = se.field_x;
                    } else {
                        param1 = ah.field_h;
                    }
                    param2 = 2;
                    ve.field_a.a(25, me.field_h);
                }
                var4 = 1;
                if (10 == param2) {
                    dc.d((byte) 127);
                    var4 = 0;
                }
                if (var4 != 0) {
                    if (!(!ta.field_b)) {
                        param1 = bb.a(jc.field_a, new String[]{param1}, -63);
                    }
                    if (!(!ga.field_G)) {
                        param1 = kc.field_L;
                    }
                    ah.field_e.a(param1, param2, (byte) -77);
                }
                if (256 != param2 && param2 != 10) {
                    if (k.field_b) {
                        return;
                    }
                    ve.field_a.i(68);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "dd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = 110;
        field_a = "Continue";
    }
}
