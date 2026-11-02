/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDeque implements Iterable {
    static String field_d;
    static String field_e;
    static int field_h;
    DualLinkNode field_f;
    static Sprite[] field_i;
    static Sprite[][] field_a;
    static String field_b;
    static int[][] field_j;
    static String field_c;
    static String field_g;

    final void a(DualLinkNode param0, int param1) {
        if (param0.secondaryPrevious != null) {
          param0.a(12695);
        }
        if (param1 != 2) {
          return;
        }
        try {
          param0.secondaryNext = this.field_f;
          param0.secondaryPrevious = this.field_f.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "ak.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          if (we.b(false)) {
            TorChallenge.field_H.a(e.field_m, param0, qa.field_b, true);
            TorChallenge.field_H.j(-86);
            while (kj.e((byte) -124)) {
              TorChallenge.field_H.a(di.field_m, b.field_J, -58);
            }
            return;
          }
          if (null != gi.field_d &&
            gi.field_d.field_i) {
            ij.c((byte) -109);
            TorChallenge.field_H.a((byte) 123, (UiComponent) (new nh(TorChallenge.field_H, de.field_b)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var1), "ak.G(" + param0 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new SecondaryNodeDequeIterator(this));
    }

    final static void a(int param0, int param1, int param2, int param3, Sprite[] param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param4 != null &&
            0 < param1) {
            var5_int = param4[0].field_q;
            var6 = param4[2].field_q;
            if (param3 > -115) {
              return;
            }
            var7 = param4[1].field_q;
            param4[0].g(param0, param2);
            param4[2].g(param1 + (param0 - var6), param2);
            SoftwareRasterizer.a(bk.field_s);
            SoftwareRasterizer.a(var5_int + param0, param2, -var6 + (param0 + param1), param4[1].field_v + param2);
            var8 = var5_int + param0;
            var9 = param1 + param0 - var6;
            for (param0 = var8; var9 > param0; param0 = param0 + var7) {
              param4[1].g(param0, param2);
            }
            SoftwareRasterizer.b(bk.field_s);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ak.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = (Sprite[][]) null;
        field_e = null;
        if (param0 < -19) {
          field_j = (int[][]) null;
          field_d = null;
          field_g = null;
          return;
        }
        field_h = 101;
        field_j = (int[][]) null;
        field_d = null;
        field_g = null;
    }

    final DualLinkNode a(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 0) {
          field_a = (Sprite[][]) null;
          var2 = this.field_f.secondaryNext;
          if (this.field_f != var2) {
            var2.a(12695);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_f.secondaryNext;
        if (this.field_f != var2Lifetime1) {
          var2Lifetime1.a(12695);
          return var2Lifetime1;
        }
        return null;
    }

    final static java.awt.Container b(int param0) {
        if (gi.field_b != null) {
          return (java.awt.Container) ((Object) gi.field_b);
        }
        if (param0 == 4) {
          return (java.awt.Container) ((Object) gi.b(param0 + 12472));
        }
        Sprite[] var2 = (Sprite[]) null;
        SecondaryNodeDeque.a(12, -9, 70, 32, (Sprite[]) null);
        return (java.awt.Container) ((Object) gi.b(param0 + 12472));
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 95) {
          SecondaryNodeDeque.a((byte) -6);
          if (param1 == 160) {
            return true;
          }
          if (32 == param1) {
            return true;
          }
          if (95 == param1) {
            return true;
          }
          if (param1 != 45) {
            return false;
          }
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (95 == param1) {
          return true;
        }
        if (param1 != 45) {
          return false;
        }
        return true;
    }

    private SecondaryNodeDeque() throws Throwable {
        throw new Error();
    }

    static {
        field_h = 0;
        field_a = new Sprite[3][];
        field_d = "Type your age in years";
        field_j = new int[4][4];
        field_b = "Service unavailable";
        field_g = "Try again";
        field_e = "Account created successfully!";
        field_c = "Your email address is used to identify this account";
    }
}
