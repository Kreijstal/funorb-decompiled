/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dqa extends mna {
    ne[] field_f;
    static jea field_e;

    final static jua takeRegistrationResponse(int param0) {
        if (kl.field_a == fta.field_c) {
          throw new IllegalStateException();
        }
        if (mua.field_a == kl.field_a) {
          kl.field_a = fta.field_c;
          return PlantModel.field_n;
        }
        if (param0 != 3239) {
          return (jua) null;
        }
        return null;
    }

    final static void a(String param0, int param1, String param2, int param3, int param4) {
        try {
          pq.field_g.field_sb = param2;
          pq.field_g.field_G = pq.field_g.field_G + ComponentMount.field_b.field_G;
          pq.field_g.field_ib = param3;
          pq.field_g.field_r = param0;
          ComponentMount.field_b.field_qb = ComponentMount.field_b.field_qb + ComponentMount.field_b.field_G;
          ComponentMount.field_b.field_G = param1;
          if (param4 < 118) {
            ResourceArchive var6 = (ResourceArchive) null;
            dqa.a((ResourceArchive) null, (ResourceArchive) null, (byte) 102, (ResourceArchive) null);
          }
          pq.field_g.field_G = pq.field_g.field_G - ComponentMount.field_b.field_G;
          ComponentMount.field_b.field_qb = ComponentMount.field_b.field_qb - ComponentMount.field_b.field_G;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dqa.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    dqa(ne[] param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dqa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 11) {
          return;
        }
        field_e = null;
    }

    final static int toOffsetBinary(boolean param0, int param1, int param2) {
        if (!param0) {
          return 28;
        }
        return (1 << -1 + param2) + param1;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2, ResourceArchive param3) {
        try {
          MatchPhase.field_l = (d) ((Object) new sja(param1, param0, param3));
          if (param2 != 55) {
            field_e = (jea) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dqa.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
