/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements e {
    private i field_a;
    private i field_j;
    private i field_f;
    private i field_d;
    private i field_b;
    private i field_g;
    private i field_l;
    Runnable field_h;
    private oa field_e;
    long field_nativeid;
    private i field_k;
    private i field_i;
    private i field_c;

    public final void w(boolean param0) {
        this.E(this.field_nativeid, param0);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          ho.a(-1, (e) (this));
        }
    }

    private final void b() {
        this.M(this.field_nativeid);
    }

    final void a() {
        this.field_h = (Runnable) ((Object) Thread.currentThread());
        this.b();
    }

    private final native void M(long param0);

    private final native void E(long param0, boolean param1);

    final void a(ka param0, gda param1, int[] param2, int param3, int param4) {
        this.f(this.field_nativeid, ((i) (param0)).field_nativeid, ((ja) (param1)).field_nativeid, param2, param3, param4);
    }

    private final native void UA(long param0, long param1, long param2, int[] param3, int param4);

    final ka a(i param0, byte param1, int param2, boolean param3) {
        i dupTemp$0 = null;
        i stackIn_3_0;
        i stackIn_3_1;
        i stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        i stackIn_8_0;
        i stackIn_8_1;
        i stackIn_8_2;
        int stackIn_8_3;
        boolean stackIn_9_4 = false;
        i stackIn_13_0;
        i stackIn_13_1;
        i stackIn_13_2;
        int stackIn_13_3;
        boolean stackIn_14_4 = false;
        i stackIn_18_0;
        i stackIn_18_1;
        i stackIn_18_2;
        int stackIn_18_3;
        boolean stackIn_19_4 = false;
        i stackIn_23_0;
        i stackIn_23_1;
        i stackIn_23_2;
        int stackIn_23_3;
        boolean stackIn_24_4 = false;
        i stackIn_27_0;
        i stackIn_27_1;
        i stackIn_27_2;
        int stackIn_27_3;
        boolean stackIn_28_4 = false;
        i var5;
        i var6;
        i var5Lifetime1;
        i var5Lifetime2;
        i var5Lifetime3;
        i var5Lifetime4;
        i var5Lifetime5;
        i var6Lifetime1;
        i var6Lifetime2;
        i var6Lifetime3;
        i var6Lifetime4;
        i var6Lifetime5;
        if (param1 == 1) {
          var6 = this.field_k;
          var5 = this.field_c;
          stackIn_3_0 = (i) (param0);
          stackIn_3_1 = var5;
          stackIn_3_2 = var6;
          stackIn_3_3 = param2;
          stackIn_4_4 = (param1 == 0) ? false : true;
          ((i) (Object) stackIn_3_0).ZA(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param3);
          var5.field_e = param0.field_e;
          var5.field_d = param0.field_d;
          return (ka) ((Object) var5);
        }
        if (param1 == 2) {
          var6Lifetime1 = this.field_f;
          var5Lifetime1 = this.field_i;
          stackIn_8_0 = (i) (param0);
          stackIn_8_1 = var5Lifetime1;
          stackIn_8_2 = var6Lifetime1;
          stackIn_8_3 = param2;
          stackIn_9_4 = (param1 == 0) ? false : true;
          ((i) (Object) stackIn_8_0).ZA(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_9_4, param3);
          var5Lifetime1.field_e = param0.field_e;
          var5Lifetime1.field_d = param0.field_d;
          return (ka) ((Object) var5Lifetime1);
        }
        if (param1 == 3) {
          var6Lifetime2 = this.field_g;
          var5Lifetime2 = this.field_a;
          stackIn_13_0 = (i) (param0);
          stackIn_13_1 = var5Lifetime2;
          stackIn_13_2 = var6Lifetime2;
          stackIn_13_3 = param2;
          stackIn_14_4 = (param1 == 0) ? false : true;
          ((i) (Object) stackIn_13_0).ZA(stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_14_4, param3);
          var5Lifetime2.field_e = param0.field_e;
          var5Lifetime2.field_d = param0.field_d;
          return (ka) ((Object) var5Lifetime2);
        }
        if (param1 == 4) {
          var6Lifetime3 = this.field_j;
          var5Lifetime3 = this.field_b;
          stackIn_18_0 = (i) (param0);
          stackIn_18_1 = var5Lifetime3;
          stackIn_18_2 = var6Lifetime3;
          stackIn_18_3 = param2;
          stackIn_19_4 = (param1 == 0) ? false : true;
          ((i) (Object) stackIn_18_0).ZA(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_19_4, param3);
          var5Lifetime3.field_e = param0.field_e;
          var5Lifetime3.field_d = param0.field_d;
          return (ka) ((Object) var5Lifetime3);
        }
        if (param1 == 5) {
          var6Lifetime4 = this.field_d;
          var5Lifetime4 = this.field_l;
          stackIn_27_0 = (i) (param0);
          stackIn_27_1 = var5Lifetime4;
          stackIn_27_2 = var6Lifetime4;
          stackIn_27_3 = param2;
          stackIn_28_4 = (param1 == 0) ? false : true;
          ((i) (Object) stackIn_27_0).ZA(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_28_4, param3);
          var5Lifetime4.field_e = param0.field_e;
          var5Lifetime4.field_d = param0.field_d;
          return (ka) ((Object) var5Lifetime4);
        }
        dupTemp$0 = new i(this.field_e);
        var6Lifetime5 = dupTemp$0;
        var5Lifetime5 = dupTemp$0;
        stackIn_23_0 = (i) (param0);
        stackIn_23_1 = var5Lifetime5;
        stackIn_23_2 = var6Lifetime5;
        stackIn_23_3 = param2;
        stackIn_24_4 = (param1 == 0) ? false : true;
        ((i) (Object) stackIn_23_0).ZA(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_24_4, param3);
        var5Lifetime5.field_e = param0.field_e;
        var5Lifetime5.field_d = param0.field_d;
        return (ka) ((Object) var5Lifetime5);
    }

    private final native void f(long param0, long param1, long param2, int[] param3, int param4, int param5);

    final void a(ka param0, gda param1, int[] param2, int param3) {
        this.UA(this.field_nativeid, ((i) (param0)).field_nativeid, ((ja) (param1)).field_nativeid, param2, param3);
    }

    private final native void HA(long param0, ha param1, int param2, int param3);

    a(oa param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = new i(this.field_e);
        this.field_i = new i(this.field_e);
        this.field_a = new i(this.field_e);
        this.field_b = new i(this.field_e);
        this.field_l = new i(this.field_e);
        this.field_k = new i(this.field_e);
        this.field_f = new i(this.field_e);
        this.field_g = new i(this.field_e);
        this.field_j = new i(this.field_e);
        this.field_d = new i(this.field_e);
        this.HA(this.field_nativeid, param0, param1, param2);
    }
}
