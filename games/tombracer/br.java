/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends od {
    char[] field_k;
    int[] field_l;
    static long field_p;
    char[] field_o;
    int[] field_q;
    boolean field_m;
    String field_n;

    private final void a(int param0, int param1, uia param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char stackIn_17_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        char stackOut_15_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (1 != param0) {
            if ((param0 ^ -1) != -3) {
              if (param0 == 3) {
                var4 = param2.h(255);
                ((br) this).field_o = new char[var4];
                ((br) this).field_l = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    L2: {
                      ((br) this).field_l[var5] = param2.d(126);
                      var6 = param2.c((byte) 71);
                      stackOut_14_0 = ((br) this).field_o;
                      stackOut_14_1 = var5;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (var6 == 0) {
                        stackOut_16_0 = (char[]) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = (char)0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L2;
                      } else {
                        stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = wpa.a((byte) 11, (byte) var6);
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L2;
                      }
                    }
                    stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (-5 != param0) {
                  break L0;
                } else {
                  ((br) this).field_m = true;
                  break L0;
                }
              }
            } else {
              var4 = param2.h(255);
              ((br) this).field_q = new int[var4];
              ((br) this).field_k = new char[var4];
              var5 = 0;
              L3: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  L4: {
                    ((br) this).field_q[var5] = param2.d(126);
                    var6 = param2.c((byte) 99);
                    stackOut_5_0 = ((br) this).field_k;
                    stackOut_5_1 = var5;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (-1 != var6) {
                      stackOut_7_0 = (char[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = wpa.a((byte) 11, (byte) var6);
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L4;
                    } else {
                      stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 0;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L4;
                    }
                  }
                  stackIn_8_0[stackIn_8_1] = (char) stackIn_8_2;
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            ((br) this).field_n = param2.e((byte) -76);
            break L0;
          }
        }
        L5: {
          if (param1 <= -67) {
            break L5;
          } else {
            var8 = null;
            ((br) this).a((uia) null, -82);
            break L5;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (((br) this).field_l != null) {
            for (var2 = 0; ((br) this).field_l.length > var2; var2++) {
                ((br) this).field_l[var2] = fh.a(((br) this).field_l[var2], 32768);
            }
        }
        if (!(null == ((br) this).field_q)) {
            var4 = 0;
            var2 = var4;
            while (var4 < ((br) this).field_q.length) {
                ((br) this).field_q[var4] = fh.a(((br) this).field_q[var4], 32768);
                var4++;
            }
        }
        if (param0 != 10211) {
            ((br) this).field_n = null;
        }
    }

    final void a(uia param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param1 == -26706) {
            break L0;
          } else {
            var5 = null;
            ((br) this).a((uia) null, -59);
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.h(255);
          if (var3 != 0) {
            this.a(var3, -90, param0);
            continue L1;
          } else {
            return;
          }
        }
    }

    br() {
        ((br) this).field_m = false;
    }

    static {
    }
}
