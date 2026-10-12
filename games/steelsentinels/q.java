/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class q implements Iterable {
    static NodeDeque field_m;
    int field_e;
    static ic field_f;
    static int field_h;
    static float field_l;
    private IntrusiveNode field_b;
    static String field_a;
    static String field_g;
    static SceneWidget field_d;
    static int field_i;
    static String field_c;
    static String field_k;
    IntrusiveNode[] field_j;

    public static void a(byte param0) {
        field_d = null;
        if (param0 < -126) {
          field_f = null;
          field_m = null;
          field_a = null;
          field_c = null;
          field_k = null;
          field_g = null;
          return;
        }
        field_f = (ic) null;
        field_f = null;
        field_m = null;
        field_a = null;
        field_c = null;
        field_k = null;
        field_g = null;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (!param3) {
          if (eb.field_u[param1] < eb.field_u[param2]) {
            return true;
          }
          if (eb.field_u[param1] > eb.field_u[param2]) {
            return false;
          }
          if (ok.field_d[param2] > ok.field_d[param1]) {
            return true;
          }
          if (ok.field_d[param1] > ok.field_d[param2]) {
            return false;
          }
          var4 = Sentinel.field_T[param1] + ne.field_G[param1] + jm.field_r[param1];
          var5 = jm.field_r[param2] + ne.field_G[param2] + Sentinel.field_T[param2];
          var6 = -10 % ((-27 - param0) / 47);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param2 <= param1);
        }
        if (ok.field_d[param2] > ok.field_d[param1]) {
          return true;
        }
        if (ok.field_d[param1] > ok.field_d[param2]) {
          return false;
        }
        if (eb.field_u[param1] < eb.field_u[param2]) {
          return true;
        }
        if (eb.field_u[param1] > eb.field_u[param2]) {
          return false;
        }
        var4Lifetime1 = Sentinel.field_T[param1] + ne.field_G[param1] + jm.field_r[param1];
        var5Lifetime1 = jm.field_r[param2] + ne.field_G[param2] + Sentinel.field_T[param2];
        var6Lifetime1 = -10 % ((-27 - param0) / 47);
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        if (param2 <= param1) {
          return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new l(this));
    }

    final void a(IntrusiveNode param0, long param1, boolean param2) {
        IntrusiveNode var5 = null;
        try {
          if (param2) {
            field_a = (String) null;
          }
          if (param0.previous != null) {
            param0.unlink(4);
          }
          var5 = this.field_j[(int)((long)(this.field_e - 1) & param1)];
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.next.previous = param0;
          param0.key = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "q.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = SteelSentinels.obfuscationControl;
        var4 = this.field_j[(int)(param0 & (long)(-1 + this.field_e))];
        this.field_b = var4.next;
        if (param1 > -118) {
          return (IntrusiveNode) null;
        }
        while (true) {
          if (var4 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~this.field_b.key != ~param0) {
            this.field_b = this.field_b.next;
            continue;
          }
          break;
        }
        var5 = this.field_b;
        this.field_b = this.field_b.next;
        return var5;
    }

    final static void a(RgbSprite param0, byte param1) {
        try {
          ArchiveIndex.a(false);
          if (param1 >= -60) {
            field_g = (String) null;
          }
          SoftwareRaster.a(param0.field_E, param0.field_z, param0.field_B);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "q.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    q(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_e = param0;
        this.field_j = new IntrusiveNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_j[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var4Lifetime1;
        SceneWidget.field_Jb = param3;
        boolean decompiledFrameRemainder0 = true;
        if (~vb.field_g == param2) {
          if (qj.field_q[98] == null) {
            vb.field_g = param0;
            pm.field_U = 0;
            decompiledFrameRemainder0 = !(!d.a(vb.field_g, ~param2));
            if (decompiledFrameRemainder0) {
              var4 = 0;
              if (12 == vb.field_g) {
                var4 = -1;
              }
              i.field_e[vb.field_g].a(param1, var4, -63);
              if (12 == vb.field_g) {
                le.a((byte) -114, param1);
              }
              if (0 != vb.field_g) {
                return;
              }
              if (null != qj.field_q[96]) {
                ia.a(6940, qj.field_q[96]);
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            ia.a(6940, qj.field_q[98]);
          }
        }
        if (decompiledFrameRemainder0) {
          vb.field_g = param0;
          pm.field_U = 0;
          if (d.a(vb.field_g, ~param2)) {
            var4Lifetime1 = 0;
            if (12 == vb.field_g) {
              var4Lifetime1 = -1;
            }
            i.field_e[vb.field_g].a(param1, var4Lifetime1, -63);
            if (12 == vb.field_g) {
              le.a((byte) -114, param1);
            }
          }
        }
        if (0 != vb.field_g) {
          return;
        }
        if (null != qj.field_q[96]) {
          ia.a(6940, qj.field_q[96]);
        }
    }

    static {
        field_g = "Engineering";
        field_a = "<%0><br><%1> <times> <%2>";
        field_c = "Create unrated game";
        field_k = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
