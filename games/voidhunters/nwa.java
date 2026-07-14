/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nwa implements ntb {
    static eab field_c;
    static int field_a;
    static boolean field_d;
    private rha[] field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
            nwa.a(20);
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (param0 > 57) {
          L0: {
            cla.field_a = param1;
            if (null == ((nwa) this).field_b) {
              break L0;
            } else {
              var3 = 0;
              L1: while (true) {
                if (((nwa) this).field_b.length <= var3) {
                  break L0;
                } else {
                  var4 = param1 - ((nwa) this).field_b[var3].field_a;
                  if (oq.field_c <= var4) {
                    ((nwa) this).field_b = (rha[]) (Object) dt.a(bob.field_e, var3, 15667, (Object[]) (Object) ((nwa) this).field_b);
                    if (((nwa) this).field_b == null) {
                      break L0;
                    } else {
                      var3--;
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        nwa var3 = (nwa) (Object) param1;
        if (param0 < 54) {
            return;
        }
        var3.field_b = (rha[]) (Object) sqb.a((tv[]) (Object) var3.field_b, (tv[]) (Object) var3.field_b, 1, bob.field_e, false);
    }

    final static tjb a(llb param0, int[] param1, int param2, llb param3, llb param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        tjb[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        pi var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = VoidHunters.field_G;
                    var5 = param1.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new tjb[var5];
                    var9 = 49;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = param2;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var10_int >= var5) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = usa.field_o.a(param1[var10_int], -122);
                        var6[var10_int] = var11.a(80);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 6: {
                    return new tjb(0L, param0, param4, param3, var8, param1, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(rha param0, boolean param1) {
        param0.field_a = cla.field_a;
        ((nwa) this).field_b = (rha[]) (Object) ija.a((Object) (Object) param0, (Object[]) (Object) ((nwa) this).field_b, 0, bob.field_e);
        if (!(hb.field_a >= ((nwa) this).field_b.length)) {
            ((nwa) this).field_b = (rha[]) (Object) dt.a(bob.field_e, 0, 15667, (Object[]) (Object) ((nwa) this).field_b);
        }
        if (!param1) {
            field_a = 89;
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        rha[] var4 = null;
        int var5 = 0;
        rha[] var6 = null;
        int var7 = 0;
        rha var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var9 = VoidHunters.field_G;
        var3 = param0;
        var4 = ((nwa) this).field_b;
        if (param1 < -109) {
          L0: {
            if (var4 != null) {
              stackOut_4_0 = var4.length;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            var3.a(-632, var5, 8);
            if (0 == var5) {
              break L1;
            } else {
              var6 = var4;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var6.length) {
                  break L1;
                } else {
                  L3: {
                    var8 = var6[var7];
                    stackOut_8_0 = (faa) var3;
                    stackOut_8_1 = -74;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var8 == null) {
                      stackOut_10_0 = (faa) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      stackOut_9_0 = (faa) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                    stb.a(2, 1, var3, (tv) (Object) var8);
                    var7++;
                    continue L2;
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        ((nwa) this).field_b = (rha[]) (Object) kcb.a(8, bob.field_e, param0, 1, -69, (tv[]) (Object) ((nwa) this).field_b);
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = ((nwa) this).a((byte) -113, (tv) null);
        }
    }

    public final void a(tv param0, int param1) {
        nwa var3 = (nwa) (Object) param0;
        boolean discarded$0 = tja.a((ntb[]) (Object) var3.field_b, 1, (ntb[]) (Object) var3.field_b, false, 5547);
        int var4 = 0;
        if (dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) var3.field_b, 121)) {
            System.out.println("Message[] messages has changed. ");
            var4 = 1;
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of MessageLog has changed");
        }
        if (param1 > -19) {
            Object var5 = null;
            ((nwa) this).a((rha) null, true);
        }
    }

    public final boolean a(byte param0, tv param1) {
        nwa var3 = (nwa) (Object) param1;
        int var4 = 22 % ((param0 - 22) / 59);
        return dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) ((nwa) this).field_b, 116);
    }

    final rha[] a(byte param0) {
        if (param0 < 44) {
            field_c = null;
        }
        return ((nwa) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
