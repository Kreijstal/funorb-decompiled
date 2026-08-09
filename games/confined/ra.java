/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ra implements dm {
    private long field_a;
    static mn field_c;
    static mn field_d;
    static String field_b;

    public static void b(boolean param0) {
        if (!param0) {
            field_c = (mn) null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final fi a(int param0) {
        if (!(!this.a(true))) {
            return gi.field_bb;
        }
        if (!((this.field_a + 350L ^ -1L) >= (ri.a(-3) ^ -1L))) {
            return ab.field_b;
        }
        if (param0 != -3621) {
            this.b((byte) 22);
        }
        return this.c(true);
    }

    public final String a(byte param0) {
        if (param0 < 65) {
            this.field_a = -60L;
        }
        if (this.a(true)) {
            return null;
        }
        if ((ri.a(-3) ^ -1L) > (350L + this.field_a ^ -1L)) {
            return null;
        }
        return this.b((byte) 126);
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param0.length();
              var5 = 0;
              if (param1 >= 115) {
                break L1;
              } else {
                var8 = (CharSequence) null;
                ra.a((CharSequence) null, 84);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
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
                          var2_long = var2_long + (long)(var6 + -64);
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(-21 - -var6);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (0L == var2_long) {
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

            stackIn_25_1 = new StringBuilder().append("ra.K(");

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
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    public final void b(int param0) {
        if (param0 > -46) {
            this.field_a = -58L;
        }
        this.field_a = ri.a(-3);
    }

    abstract fi c(boolean param0);

    abstract String b(byte param0);

    static {
        field_c = new mn();
        field_d = new mn();
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
