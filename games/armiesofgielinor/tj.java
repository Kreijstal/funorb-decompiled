/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class tj extends kb implements gw {
    static na field_C;
    at field_D;

    final int g(int param0) {
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = 0;
        bb var3 = new bb(((tj) this).field_D);
        if (param0 != -31989) {
            boolean discarded$0 = ((tj) this).a(false);
        }
        kb var4 = (kb) (Object) var3.c(param0 ^ -31943);
        while (var4 != null) {
            var5 = var4.g(-31989);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (kb) (Object) var3.b(50);
        }
        return var2;
    }

    final boolean b(byte param0, kb param1) {
        bb var5 = null;
        kb var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((tj) this).field_D.a(false)) {
            return false;
        }
        bb var3 = new bb(((tj) this).field_D);
        if (param0 >= -121) {
            tj.d((byte) 127);
        }
        kb var4 = (kb) (Object) var3.c(50);
        while (var4 != null) {
            if (!(!var4.a(false))) {
                var5 = new bb(((tj) this).field_D);
                tc discarded$0 = var5.a((tc) (Object) var4, true);
                var6 = (kb) (Object) var5.b(50);
                while (var6 != null) {
                    if (var6.a(11, param1)) {
                        return true;
                    }
                    var6 = (kb) (Object) var5.b(50);
                }
            }
            var4 = (kb) (Object) var3.b(50);
        }
        return false;
    }

    void f(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((tj) this).field_D);
        if (param0 != 1) {
            field_C = null;
        }
        kb var3 = (kb) (Object) var2.c(50);
        while (var3 != null) {
            var3.f(param0 + 0);
            var3 = (kb) (Object) var2.b(50);
        }
    }

    kb e(byte param0) {
        bb var2 = null;
        kb var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = new bb(((tj) this).field_D);
          if (param0 >= 24) {
            break L0;
          } else {
            ((tj) this).field_D = null;
            break L0;
          }
        }
        var3 = (kb) (Object) var2.c(50);
        L1: while (true) {
          if (var3 != null) {
            if (var3.a(false)) {
              return var3;
            } else {
              var3 = (kb) (Object) var2.b(50);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, kb param1) {
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var3 = new bb(((tj) this).field_D);
        if (param0 != 11) {
            return true;
        }
        kb var4 = (kb) (Object) var3.c(param0 + 39);
        while (var4 != null) {
            if (var4.a(param0 ^ 0, param1)) {
                return true;
            }
            var4 = (kb) (Object) var3.b(param0 + 39);
        }
        return false;
    }

    final boolean a(boolean param0, kb param1) {
        bb var5 = null;
        kb var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
            Object var8 = null;
            boolean discarded$0 = ((tj) this).a((kb) null, 21, '￘', -49);
        }
        if (((tj) this).field_D.a(param0)) {
            return false;
        }
        bb var9 = new bb(((tj) this).field_D);
        kb var4 = (kb) (Object) var9.a(50);
        while (var4 != null) {
            if (var4.a(false)) {
                var5 = new bb(((tj) this).field_D);
                tc discarded$1 = var5.a(false, (tc) (Object) var4);
                var6 = (kb) (Object) var5.b((byte) -112);
                while (var6 != null) {
                    if (!(!var6.a(11, param1))) {
                        return true;
                    }
                    var6 = (kb) (Object) var5.b((byte) -112);
                }
            }
            var4 = (kb) (Object) var9.b((byte) -112);
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var8 = new bb(((tj) this).field_D);
        kb var9 = (kb) (Object) var8.c(50);
        while (var9 != null) {
            // ifeq L90
            if (var9.a(false)) {
                if (var9.a(param0, param1, param2, param3, param4, 94, param6)) {
                    return true;
                }
            }
            var9 = (kb) (Object) var8.b(50);
        }
        if (param5 <= 93) {
            int discarded$0 = ((tj) this).g(116);
            return false;
        }
        return false;
    }

    final void a(byte param0, kb param1) {
        ((tj) this).field_D.a((byte) -119, (tc) (Object) param1);
        if (param0 != 10) {
            ((tj) this).f(-101);
        }
    }

    String h(int param0) {
        String var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((tj) this).field_D);
        kb var3 = (kb) (Object) var2.c(param0 ^ 21434);
        while (var3 != null) {
            var4 = var3.h(21384);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (kb) (Object) var2.b(50);
        }
        if (param0 == 21384) {
            return null;
        }
        ((tj) this).field_D = null;
        return null;
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 <= 103) {
            field_C = null;
        }
        bb var8 = new bb(((tj) this).field_D);
        kb var9 = (kb) (Object) var8.c(50);
        while (var9 != null) {
            // ifeq L111
            if (!(!var9.a(param0, ((tj) this).field_B + param1, ((tj) this).field_p + param2, 107, param4, param5, param6))) {
                return true;
            }
            var9 = (kb) (Object) var8.b(50);
        }
        return false;
    }

    boolean a(boolean param0) {
        if (param0) {
            ((tj) this).field_D = null;
        }
        return null != ((tj) this).e((byte) 94) ? true : false;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (param2 != 26477) {
            return null;
        }
        if (((tj) this).a(param3, param0, (byte) 96, param1)) {
            ((tj) this).a(param0, param3, true, param1);
            this.a(param3, 81, param1, param0);
        }
        return param1;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param2, param3 ^ 0, param4);
        if (param3 != 8192) {
            field_C = null;
        }
        this.i(0);
    }

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var5 = new bb(((tj) this).field_D);
        kb var6 = (kb) (Object) var5.c(50);
        if (param1 != 81) {
            return;
        }
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; param3 >= var7; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(1 + param3, param2, 26477, param0);
            var6 = (kb) (Object) var5.b(50);
        }
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var7 = new bb(((tj) this).field_D);
        int var8 = -73 / ((-58 - param3) / 53);
        kb var9 = (kb) (Object) var7.c(50);
        while (var9 != null) {
            // ifeq L98
            var9.a(((tj) this).field_p + param0, param1, param2, (byte) -112, param4, param5 - -((tj) this).field_B);
            var9 = (kb) (Object) var7.b(50);
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var9 = new bb(((tj) this).field_D);
        kb var8 = (kb) (Object) var9.c(50);
        while (var8 != null) {
            // ifeq L85
            if (var8.a(false)) {
                if (var8.a(param0, param1, param2, -12215)) {
                    return true;
                }
            }
            var8 = (kb) (Object) var9.b(50);
        }
        int var6 = param1;
        if ((var6 ^ -1) == -81) {
            return br.field_f[81] ? ((tj) this).a(false, param0) : ((tj) this).b((byte) -123, param0);
        }
        if (param3 != -12215) {
            ((tj) this).field_D = null;
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, kb param3) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(param0, param1, param2, param3);
        bb var5 = new bb(((tj) this).field_D);
        kb var6 = (kb) (Object) var5.c(50);
        while (var6 != null) {
            // ifeq L95
            var6.a(32722, ((tj) this).field_B + param1, param2 - -((tj) this).field_p, param3);
            var6 = (kb) (Object) var5.b(50);
        }
    }

    private final void i(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        bb var2 = new bb(((tj) this).field_D);
        kb var3 = (kb) (Object) var2.c(50);
        if (param0 != 0) {
            return;
        }
        while (var3 != null) {
            var3.e(0);
            var3 = (kb) (Object) var2.b(50);
        }
    }

    tj(int param0, int param1, int param2, int param3, kh param4) {
        super(param0, param1, param2, param3, param4, (qo) null);
        ((tj) this).field_D = new at();
    }

    public static void d(byte param0) {
        if (param0 != -89) {
            tj.j(114);
        }
        field_C = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 == param3) {
            if (!(null == ((tj) this).field_k)) {
                ((tj) this).field_k.a((kb) this, param0, -94, true, param1);
            }
        }
        bb var5 = new bb(((tj) this).field_D);
        kb var6 = (kb) (Object) var5.a(50);
        while (var6 != null) {
            var6.a(param0 + ((tj) this).field_B, ((tj) this).field_p + param1, (byte) -101, param3);
            var6 = (kb) (Object) var5.b((byte) -112);
        }
        if (param2 >= -82) {
            this.i(108);
        }
    }

    final static void j(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            int var2 = 0;
            IOException var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
                        if (ai.field_T != null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        ai.field_T.c(-5758);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (ou.field_h != null) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ou.field_h.a((byte) -117);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == rg.field_b) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            rg.field_b.c((byte) 81);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        var1 = -99 % ((param0 - -48) / 58);
                        if (null == mu.field_b) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var2 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var2 >= mu.field_b.length) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (null != mu.field_b[var2]) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            mu.field_b[var2].c((byte) 81);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var2++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 18: {
                        var3 = (IOException) (Object) caughtException;
                        var2++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
