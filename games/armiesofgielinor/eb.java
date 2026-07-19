/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static je field_a;
    static int field_b;
    static String field_e;
    static String field_d;
    static je field_c;

    final static void a(boolean param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (76 != param1) {
              L1: {
                if (!param0) {
                  L2: {
                    if (16 == param1) {
                      param1 = 78;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (25 != param1) {
                      break L3;
                    } else {
                      param1 = 79;
                      break L3;
                    }
                  }
                  L4: {
                    if ((param1 ^ -1) != -49) {
                      break L4;
                    } else {
                      param1 = 80;
                      break L4;
                    }
                  }
                  if (param1 == 85) {
                    param1 = 89;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (param2) {
                var3_int = 1;
                L5: while (true) {
                  if (var3_int >= mn.field_m[param1].length) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    mn.field_k[param1][var3_int] = null;
                    var3_int++;
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "eb.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 1) {
          field_c = (je) null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static int a(byte param0, int param1) {
        param1 = ((-1431655766 & param1) >>> 716488737) + (1431655765 & param1);
        param1 = (param1 & 858993459) - -((param1 & -858993458) >>> -799002878);
        param1 = 252645135 & (param1 >>> 539582692) + param1;
        if (param0 >= -70) {
          field_e = (String) null;
          param1 = param1 + (param1 >>> 1897789992);
          param1 = param1 + (param1 >>> 261794928);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 1897789992);
          param1 = param1 + (param1 >>> 261794928);
          return param1 & 255;
        }
    }

    static {
        field_d = "Send private message";
        field_e = "Month";
        field_b = 5;
    }
}
