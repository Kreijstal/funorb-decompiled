/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class esb extends qq implements mkb {
    static asb field_j;
    private byte field_i;

    final int b(byte param0) {
        if (param0 != 125) {
            ((esb) this).field_i = (byte) -12;
            return ((esb) this).field_i;
        }
        return ((esb) this).field_i;
    }

    public final boolean a(int param0, int param1, int param2) {
        ((esb) this).field_i = (byte)param0;
        super.a(25427, param1);
        if (param2 <= 81) {
            ((esb) this).a(-84);
            return true;
        }
        return true;
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        Object var4 = null;
        if (param1 <= 16) {
          var4 = null;
          String discarded$2 = esb.a(-9, (CharSequence) null);
          return super.a(false, param0, ((esb) this).field_d.field_Vc);
        } else {
          return super.a(false, param0, ((esb) this).field_d.field_Vc);
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (20 >= var2_int) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            L2: {
              var10 = new char[var2_int];
              var9 = var10;
              var8 = var9;
              var7 = var8;
              var3 = var7;
              if (param0 > 2) {
                break L2;
              } else {
                field_j = null;
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackOut_24_0 = new String(var10);
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(var5 + 32);
                        var4++;
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (97 > var5) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("esb.E(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_25_0;
    }

    public final boolean b(int param0) {
        Object var3 = null;
        if (param0 != -20836) {
          var3 = null;
          String discarded$2 = esb.a(91, (CharSequence) null);
          return super.a((byte) -124, ((esb) this).field_d.field_Vc);
        } else {
          return super.a((byte) -124, ((esb) this).field_d.field_Vc);
        }
    }

    public static void e(int param0) {
        field_j = null;
    }

    esb(jp param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final void a(int param0) {
        if (param0 > -84) {
            return;
        }
        super.a(-119);
    }

    static {
    }
}
