/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bo extends ff {
    private long field_m;
    private String field_k;
    static boolean field_l;

    final static me[] b(int param0) {
        if (param0 == 140) {
          return new me[]{uc.field_k, ll.field_d, bb.field_c};
        }
        return (me[]) null;
    }

    final void a(int param0, PacketBuffer param1) {
        if (param0 != 0) {
          return;
        }
        try {
          param1.writeLong(-23054, this.field_m);
          param1.writeBase38Name(false, this.field_k);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "bo.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bo(long param0, String param1) {
        try {
          this.field_k = param1;
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "bo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
          fj.a(243, param1, 140, nn.field_g, -15531, 2);
          if (param0 <= 93) {
            bo.b(99);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "bo.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    cd a(int param0) {
        if (param0 != 13) {
          return (cd) null;
        }
        return MembershipBenefitsScreen.field_v;
    }

    static {
        field_l = false;
    }
}
