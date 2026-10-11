/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb {
    static int[] field_d;
    private byte[][] field_i;
    private byte[][] field_e;
    static String field_a;
    static ti field_b;
    private byte[][] field_h;
    static ng field_f;
    int field_g;
    String[][] field_c;

    final void a(wf param0, byte param1) {
        byte[] array$2 = null;
        byte[] array$1 = null;
        byte[] array$0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4_intLifetime1;
        int var5Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_e = new byte[param0.g((byte) -122)][];
          for (var3_int = 0; var3_int < this.field_e.length; var3_int++) {
            var4_int = (byte)param0.d(true);
            var5 = param0.d((byte) 19);
            array$2 = new byte[var5 + 1];
            this.field_e[var3_int] = array$2;
            this.field_e[var3_int][0] = (byte)var4_int;
            o.a(param0.field_j, param0.field_h, this.field_e[var3_int], 1, var5);
            param0.field_h = param0.field_h + var5;
          }
          this.field_i = new byte[param0.g((byte) -104)][];
          if (param1 < 26) {
            this.field_g = 72;
          }
          for (var3_intLifetime1 = 0; this.field_i.length > var3_intLifetime1; var3_intLifetime1++) {
            var4_intLifetime1 = (byte)param0.d(true);
            var5Lifetime1 = param0.d((byte) 19);
            array$1 = new byte[1 + var5Lifetime1];
            this.field_i[var3_intLifetime1] = array$1;
            this.field_i[var3_intLifetime1][0] = (byte)var4_intLifetime1;
            o.a(param0.field_j, param0.field_h, this.field_i[var3_intLifetime1], 1, var5Lifetime1);
            param0.field_h = param0.field_h + var5Lifetime1;
          }
          for (var3_intLifetime2 = 0; this.field_h.length > var3_intLifetime2; var3_intLifetime2++) {
            array$0 = new byte[param0.d((byte) 19)];
            this.field_h[var3_intLifetime2] = array$0;
            var4 = array$0;
            param0.a(96, var4.length, 0, var4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("eb.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String c(byte param0) {
        if (param0 <= 72) {
          eb.a((byte) -10);
        }
        if (af.field_b) {
          return null;
        }
        if (dj.field_b > ug.field_m) {
          return null;
        }
        if (!(ik.field_j + dj.field_b <= ug.field_m)) {
          return nc.field_p;
        }
        return null;
    }

    private final boolean a(int param0, byte[][] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -18 % ((51 - param2) / 49);
          stackIn_3_0 = (param1[param0][0] == -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("eb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static db a(byte param0) {
        int var4_int = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var1 = bd.field_m[0] * pb.field_h[0];
        byte[] var2 = be.field_f[0];
        int[] var3 = new int[var1];
        int var5 = -59 % ((param0 + 55) / 54);
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = ci.field_b[vg.a(255, (int) var2[var4_int])];
        }
        db var4 = new db(uc.field_fb, eh.field_b, mg.field_x[0], rg.field_c[0], pb.field_h[0], bd.field_m[0], var3);
        gk.a(12428);
        return var4;
    }

    private final int a(byte[][] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          if (1 == param2 &&
            param0.length == 1) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          ne.field_a.field_j = param0[param2];
          ne.field_a.field_h = param1;
          var5_int = 255 & param3;
          var6 = -1;
          var7 = -1;
          while (var6 < var5_int) {
            var7 = ne.field_a.g((byte) -109);
            if (var7 != 0) {
              var6++;
              continue;
            }
            var6 = var6 + (1 + ne.field_a.g((byte) -93));
          }
          stackIn_12_0 = var7;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("eb.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        boolean discarded$1 = false;
        int var8 = 0;
        int stackIn_8_0 = 0;
        byte[][] stackIn_11_0 = null;
        byte[][] stackIn_12_0 = null;
        byte[][] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 256) {
                            statePc = 3;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                discarded$1 = this.a(20, (byte[][]) null, (byte) -51);
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw eb.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0.length == 0) {
                            statePc = 5;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 4. */
                            {
                                statePc = 6;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_3) {
                        statePc = ((Object) stateCaught_3 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw eb.<RuntimeException>$cfr$sneakyThrow(stateCaught_3);
                        }
                        caughtException = stateCaught_3;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    stackIn_8_0 = 256;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackIn_8_0 = 256;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw eb.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5_int = stackIn_8_0;
                        var6 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw eb.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0.length <= var6) {
                            /* Inlined CFG state: 14. */
                            {
                                if (!this.a(param0, 28)) {
                                    statePc = 7;
                                } else {
                                    statePc = 23;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 10. */
                            {
                                stackIn_12_0 = this.field_h;
                                stackIn_11_0 = stackIn_12_0;
                                if (!param2) {
                                    /* Inlined CFG state: 12. */
                                    {
                                        stackIn_13_0 = stackIn_12_0;
                                        stackIn_13_1 = var5_int;
                                        statePc = 13;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 11. */
                                    {
                                        stackIn_13_0 = stackIn_11_0;
                                        stackIn_13_1 = 256;
                                        statePc = 13;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw eb.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = stackIn_13_0[stackIn_13_1];
                        var5_int = 255 & var7[rh.a(param3 + 14561, param1, var7.length)];
                        param0[var6] = el.a((byte)var5_int, (byte) 26);
                        var6++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 16 : -1);
                        if (statePc == -1) {
                            throw eb.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var5);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("eb.G(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = stackIn_17_0;
                    stackIn_19_1 = stackIn_17_1;
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = stackIn_18_0;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = stackIn_19_0;
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param1 == null) {
                        /* Inlined CFG state: 21. */
                        {
                            stackIn_22_0 = stackIn_21_0;
                            stackIn_22_1 = stackIn_21_1;
                            stackIn_22_2 = "null";
                            statePc = 22;
                            continue stateLoop;
                        }
                    } else {
                        /* Inlined CFG state: 20. */
                        {
                            stackIn_22_0 = stackIn_20_0;
                            stackIn_22_1 = stackIn_20_1;
                            stackIn_22_2 = "{...}";
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                }
                case 22: {
                    throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, oj param1, int param2, db param3, char param4, int param5, int param6) {
        try {
          cg.a(param1.field_f, param3, param2, param5, (byte) -72, param1.field_b, param6, param4);
          if (param0 <= 3) {
            db var8 = (db) null;
            eb.a(121, (oj) null, 17, (db) null, 'ﾍ', 59, 10);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "eb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -100) {
          db var2 = (db) null;
          eb.a(-23, (oj) null, -39, (db) null, 'ﾡ', 117, 22);
        }
        field_a = null;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    private final boolean a(char[] param0, int param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < -2 + param0.length; var3_int++) {
            var4 = 1;
            for (var5 = var3_int; param0.length > var5; var5++) {
              var4 = this.a(this.field_i, 1, var4, ua.a(true, param0[var5]));
              if (var4 != 0) {
                if (!this.a(var4, this.field_i, (byte) -61)) {
                  continue;
                }
                return false;
              }
              break;
            }
          }
          for (var3_intLifetime1 = -1 + param0.length; var3_intLifetime1 >= 2; var3_intLifetime1--) {
            var4Lifetime1 = 1;
            for (var5Lifetime1 = var3_intLifetime1; var5Lifetime1 >= 0; var5Lifetime1--) {
              var4Lifetime1 = this.a(this.field_i, 1, var4Lifetime1, ua.a(true, param0[var5Lifetime1]));
              if (var4Lifetime1 != 0) {
                if (this.a(var4Lifetime1, this.field_i, (byte) -35)) {
                  return false;
                }
                continue;
              }
              break;
            }
          }
          var3_intLifetime2 = -16 % ((-46 - param1) / 46);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("eb.I(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(char[] param0, byte param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7Lifetime1;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 1;
          for (var6 = param2; var6 < param0.length; var6++) {
            var7 = 0;
            if (param0[var6] != 0) {
              var7 = ua.a(true, param0[var6]);
            }
            var5 = this.a(this.field_e, 1, var5, (byte) var7);
            if (var5 != 0) {
              if (this.a(var5, this.field_e, (byte) -113)) {
                var4_int = 1 + (-param2 + var6);
              }
              continue;
            }
            break;
          }
          var7Lifetime1 = 25 % ((60 - param1) / 44);
          stackIn_13_0 = var4_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("eb.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    eb(int param0, int param1) {
        this.field_h = new byte[257][];
        this.field_c = new String[param1][2];
        this.field_g = param0;
    }

    final static int d(byte param0) {
        if (param0 != -6) {
          return 81;
        }
        return ph.field_b;
    }

    static {
        field_a = "OF";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
