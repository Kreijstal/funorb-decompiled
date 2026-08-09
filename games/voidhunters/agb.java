/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class agb implements dja {
    public final tv a(byte param0) {
        int var2 = -61 % ((param0 - -64) / 50);
        return (tv) ((Object) new tt());
    }

    final static long a(CharSequence param0, int param1) {
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              if (param1 == -49) {
                break L1;
              } else {
                var8 = (CharSequence) null;
                agb.a((CharSequence) null, 54);
                break L1;
              }
            }
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (65 > var6) {
                        break L5;
                      } else {
                        if (var6 > 90) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 - (-var6 - -65));
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (97 > var6) {
                        break L6;
                      } else {
                        if (var6 > 122) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-97 + (1 - -var6));
                          break L4;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(27 + var6 + -48);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (177917621779460413L <= var2_long) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (-1L != (var2_long % 37L ^ -1L)) {
                    break L8;
                  } else {
                    if ((var2_long ^ -1L) == -1L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackIn_22_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("agb.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            this.a((byte) 63);
            return (tv[]) ((Object) new tt[param1]);
        }
        return (tv[]) ((Object) new tt[param1]);
    }

    static {
    }
}
