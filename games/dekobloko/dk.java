/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends java.awt.Canvas {
    private java.awt.Component field_e;
    static int field_a;
    static int field_g;
    static int field_i;
    static int field_c;
    static ck field_h;
    static String[] field_j;
    static String field_f;
    static String field_b;
    static String field_d;

    public final void update(java.awt.Graphics param0) {
        try {
            ((dk) this).field_e.update(param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "dk.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    dk(java.awt.Component param0) {
        try {
            ((dk) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "dk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3_ref_int__ = null;
        f var3_ref_f = null;
        int var3 = 0;
        int[] var4 = null;
        uf var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        f var10 = null;
        f var11 = null;
        ki var12 = null;
        uf var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = de.field_V;
              var2 = var13.d((byte) -36);
              if (var2 != 0) {
                if (var2 == 1) {
                  var12 = (ki) (Object) cg.field_c.c((byte) -66);
                  if (var12 == null) {
                    si.a(127);
                    return;
                  } else {
                    var12.b((byte) 106);
                    break L1;
                  }
                } else {
                  if (var2 == 2) {
                    f dupTemp$1 = (f) (Object) rc.field_e.c((byte) -64);
                    var10 = dupTemp$1;
                    var3_ref_f = dupTemp$1;
                    if (var10 == null) {
                      si.a(115);
                      return;
                    } else {
                      var10.field_t = b.h(109);
                      var10.field_u = true;
                      var10.b((byte) 119);
                      break L1;
                    }
                  } else {
                    qb.a((Throwable) null, 16408, "A1: " + qk.d((byte) 89));
                    si.a(90);
                    break L1;
                  }
                }
              } else {
                var3_ref_int__ = b.h(56);
                var9 = var3_ref_int__;
                var4 = var9;
                var5 = var13;
                var6 = ((wl) (Object) var5).d((byte) -116);
                var7 = 0;
                L2: while (true) {
                  if (var6 <= var7) {
                    var11 = (f) (Object) rc.field_e.c((byte) 92);
                    if (var11 != null) {
                      var11.field_u = true;
                      var11.field_t = var3_ref_int__;
                      var11.b((byte) 112);
                      break L1;
                    } else {
                      si.a(95);
                      return;
                    }
                  } else {
                    var9[var7] = ((wl) (Object) var5).i(7553);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            var3 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "dk.B(" + 69 + ')');
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_j = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((dk) this).field_e.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "dk.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Some special items will sit in your bucket until you activate them. To activate one, pop a shape next to it.";
        field_b = "Invite only";
        field_j = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        le.a((byte) 125, 50);
        field_d = "Hide game chat";
    }
}
