/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static int[] field_d;
    static String field_b;
    static bn field_c;
    static int field_a;
    private Object field_e;

    final cn a(int param0) {
        IllegalAccessException var2 = null;
        java.lang.reflect.InvocationTargetException var2_ref = null;
        Object var3 = null;
        cn stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        cn stackOut_5_0 = null;
        if (((il) this).field_e instanceof cn) {
          return (cn) ((il) this).field_e;
        } else {
          try {
            L0: {
              if (param0 == 16) {
                break L0;
              } else {
                ((il) this).field_e = null;
                break L0;
              }
            }
            var3 = null;
            stackOut_5_0 = (cn) hd.field_e.invoke(((il) this).field_e, (Object[]) null);
            stackIn_6_0 = stackOut_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_6_0;
          }
          var2_ref = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
        }
        return null;
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = DungeonAssault.field_K;
        if (!Character.isISOControl(param1)) {
          if (!pp.a(-63, param1)) {
            var6 = wk.field_f;
            var2 = var6;
            var3 = 0;
            L0: while (true) {
              if (var6.length <= var3) {
                var2 = ul.field_c;
                var3 = 0;
                L1: while (true) {
                  if (var2.length <= var3) {
                    if (!param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    var4 = var2[var3];
                    if (param1 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                var4 = var6[var3];
                if (param1 != var4) {
                  var3++;
                  continue L0;
                } else {
                  return true;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    il(cn param0) {
        IllegalAccessException var2 = null;
        java.lang.reflect.InvocationTargetException var2_ref = null;
        InstantiationException var2_ref2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((il) this).field_e = (Object) (Object) param0;
                    if (hd.field_h == null) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ql.field_e[0] = (Object) (Object) param0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ((il) this).field_e = hd.field_h.newInstance(ql.field_e);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IllegalAccessException ? 4 : (stateCaught_2 instanceof java.lang.reflect.InvocationTargetException ? 5 : 6));
                        continue stateLoop;
                    }
                }
                case 3: {
                }
                case 4: {
                    var2 = (IllegalAccessException) (Object) caughtException;
                }
                case 5: {
                    var2_ref = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                }
                case 6: {
                    var2_ref2 = (InstantiationException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 <= 103) {
            field_d = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Most dungeon rooms contain rats scavenging for food. The rats in this room are much, much larger and do more than scavenge.";
        field_c = null;
        field_d = new int[]{15, 15, 16};
    }
}
