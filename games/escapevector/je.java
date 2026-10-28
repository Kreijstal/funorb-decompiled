/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_b;
    static IntrusiveDeque field_a;

    public static void a(int param0) {
        int var1 = 86 / ((-10 - param0) / 57);
        field_a = null;
    }

    final static Sprite b(int param0) {
        Object var3 = null;
        int var7 = EscapeVector.obfuscationControl;
        Object var3Lifetime1;
        if (param0 > 44) {
          int var1 = qh.field_k[0] * bc.field_a[0];
          byte[] var21 = qe.field_a[0];
          if (UiContainer.field_E[0]) {
            byte[] var20 = CheckboxPainter.field_b[0];
            int[] var13 = new int[var1];
            int[] var11 = var13;
            int[] var5_ref_int__ = var11;
            for (int var6 = 0; var1 > var6; var6++) {
              var5_ref_int__[var6] = lb.a(ae.a(var20[var6] << 24, -16777216), qk.field_f[ae.a((int) var21[var6], 255)]);
            }
            var3 = new uh(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var13);
          } else {
            int[] var9 = new int[var1];
            for (int var5 = 0; var1 > var5; var5++) {
              var9[var5] = qk.field_f[ae.a((int) var21[var5], 255)];
            }
            var3 = new Sprite(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var9);
          }
          of.a(false);
          return (Sprite) (var3);
        }
        je.a(24);
        int var1Lifetime1 = qh.field_k[0] * bc.field_a[0];
        byte[] var19 = qe.field_a[0];
        if (UiContainer.field_E[0]) {
          byte[] var18 = CheckboxPainter.field_b[0];
          int[] var13Lifetime1 = new int[var1Lifetime1];
          int[] var11Lifetime1 = var13Lifetime1;
          int[] var5_ref_int__Lifetime1 = var11Lifetime1;
          for (int var6Lifetime1 = 0; var1Lifetime1 > var6Lifetime1; var6Lifetime1++) {
            var5_ref_int__Lifetime1[var6Lifetime1] = lb.a(ae.a(var18[var6Lifetime1] << 24, -16777216), qk.field_f[ae.a((int) var19[var6Lifetime1], 255)]);
          }
          var3Lifetime1 = new uh(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var13Lifetime1);
        } else {
          int[] var9Lifetime1 = new int[var1Lifetime1];
          for (int var5Lifetime1 = 0; var1Lifetime1 > var5Lifetime1; var5Lifetime1++) {
            var9Lifetime1[var5Lifetime1] = qk.field_f[ae.a((int) var19[var5Lifetime1], 255)];
          }
          var3Lifetime1 = new Sprite(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var9Lifetime1);
        }
        of.a(false);
        return (Sprite) (var3Lifetime1);
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          je.b(13);
          if (qd.a(param1, -102)) {
            return pc.a(2513, param1);
          }
          return 0;
        }
        if (qd.a(param1, -102)) {
          return pc.a(2513, param1);
        }
        return 0;
    }

    final static void a(ResourceArchive param0, PcmStreamMixer param1, int param2, byte param3) {
        try {
          hb.field_h = se.a(0) * param2 / 1000;
          on.a(param0, -58);
          h.a(param0, (byte) 110);
          cj.a(0, param0);
          pa.a(-83);
          if (param3 < 80) {
            String var5 = (String) null;
            je.a(false, (String) null);
          }
          id.c(120);
          kb.field_d = 0 - hb.field_h;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "je.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, String param1) {
        System.out.println("Error: " + vg.a(param1, "%0a", (byte) 111, "\n"));
        if (param0) {
          String var3 = (String) null;
          je.a(false, (String) null);
        }
    }

    static {
        field_a = new IntrusiveDeque();
    }
}
