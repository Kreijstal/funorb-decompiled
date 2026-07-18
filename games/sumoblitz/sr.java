/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sr {
    private RandomAccessFile field_h;
    private long field_e;
    private long field_f;
    static jf field_i;
    static boolean field_g;
    static il field_a;
    static int field_b;
    static boolean field_d;
    static String field_c;
    static String[] field_j;

    final int b(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((sr) this).field_h.read(param0, param3, param2);
              if (param1 == 2) {
                break L1;
              } else {
                var6 = null;
                sr.a((java.math.BigInteger) null, 49, (byte[]) null, (java.math.BigInteger) null, (byte) 29, (fs) null, 22);
                break L1;
              }
            }
            L2: {
              if (var5_int > 0) {
                ((sr) this).field_e = ((sr) this).field_e + (long)var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = var5_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("sr.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void d(int param0) {
        si.a(115, 38, 148, param0 + -22028, new int[8], 0, 492);
        iv.field_g[0] = new ak(0);
        if (param0 != 22030) {
            sr.d(35);
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_j = null;
        field_c = null;
        field_i = null;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if (~(((sr) this).field_e + (long)param2) < ~((sr) this).field_f) {
                ((sr) this).field_h.seek(((sr) this).field_f);
                ((sr) this).field_h.write(1);
                throw new EOFException();
            }
            ((sr) this).field_h.write(param0, param1, param2);
            if (param3 != 1) {
                ((sr) this).field_e = -67L;
            }
            ((sr) this).field_e = ((sr) this).field_e + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "sr.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        ((sr) this).field_h.seek(param1);
        ((sr) this).field_e = param1;
        int var4 = -27 / ((-13 - param0) / 49);
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, java.math.BigInteger param3, byte param4, fs param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = pq.a(1, param1);
              if (gf.field_b == null) {
                gf.field_b = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (var9 >= 4) {
                L3: {
                  L4: {
                    if (qc.field_c == null) {
                      break L4;
                    } else {
                      if (var7_int > qc.field_c.field_n.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qc.field_c = new fs(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    qc.field_c.field_p = 0;
                    qc.field_c.a(param2, (byte) -123, param1, param6);
                    qc.field_c.a((byte) -3, var7_int);
                    qc.field_c.a(var15, 104);
                    if (sv.field_c == null) {
                      break L6;
                    } else {
                      if (100 <= sv.field_c.field_n.length) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  sv.field_c = new fs(100);
                  break L5;
                }
                sv.field_c.field_p = 0;
                sv.field_c.b((byte) 25, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (var11 >= 4) {
                    sv.field_c.b(125, param1);
                    sv.field_c.a((byte) 123, param0, param3);
                    param5.a(sv.field_c.field_n, (byte) -123, sv.field_c.field_p, 0);
                    if (param4 <= -6) {
                      param5.a(qc.field_c.field_n, (byte) -123, qc.field_c.field_p, 0);
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    sv.field_c.e(48, var15[var11]);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = gf.field_b.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var7;
            stackOut_22_1 = new StringBuilder().append("sr.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param4).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param5 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param6 + ')');
        }
    }

    final void b(int param0) throws IOException {
        if (((sr) this).field_h != null) {
            ((sr) this).field_h.close();
            ((sr) this).field_h = null;
        }
        if (param0 != 0) {
            Object var3 = null;
            sr.a((java.math.BigInteger) null, 53, (byte[]) null, (java.math.BigInteger) null, (byte) 2, (fs) null, 24);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 <= 34) {
            Object var3 = null;
            sr.a((java.math.BigInteger) null, -30, (byte[]) null, (java.math.BigInteger) null, (byte) -2, (fs) null, -103);
        }
        return ((sr) this).field_h.length();
    }

    sr(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((sr) this).field_h = new RandomAccessFile(param0, param1);
            ((sr) this).field_e = 0L;
            ((sr) this).field_f = param2;
            var5_int = ((sr) this).field_h.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((sr) this).field_h.seek(0L);
                    ((sr) this).field_h.write(var5_int);
                }
            }
            ((sr) this).field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "sr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (((sr) this).field_h != null) {
            System.out.println("");
            ((sr) this).b(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new jf();
        field_d = false;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = new il();
        field_j = new String[]{"HyoujunBot", "He's eager to fight, but he has only normal eyesight. It is possible to hide from him.", "SuiminBot", "Wake him up with a bump. He's slower than HyoujunBot, but he has better traction.", "Accelerator", "Shoots drones in the indicated direction.", "KosokuBot", "He's lighter than HyoujunBot, but faster, with very little traction.", "Armour", "One of these drones has armour. Hit it three times to temporarily deactivate the armour.", "Repeller", "Pushes drones away.", "Teleporter", "Teleports drones between teleporters.", "Pinball bouncer", "Repels drones at high speed.", "Bomb", "One of these drones has a blast charge. It activates on contact, so beware.", "BunkatBot", "On death, he splits into smaller versions of himself.", "Ice pad", "Reduces acceleration and traction, causing severe loss of control.", "Spikes", "A drone in this wave has spikes. Spikes hurt, but they take time to recharge after use.", "Mine", "Not lethal in itself, but its shockwave causes havoc.", "Zap trap", "Lethal on contact, but takes time to recharge.", "Attractor", "Uses a tractor beam to pull drones in.", "SosakuBot", "With high traction and a very long sight range, he'll hunt you down from far away.", "Movement", "Hold your left mouse button or the WASD keys to direct your drone.", "Blast", "Hold Space to deploy an Energy Blast.", "<col=ff0000>Gyojibot</col>", "Do not bore GyojiBot by remaining in one place for too long. For this, he will destroy your drone."};
    }
}
