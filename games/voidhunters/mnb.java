/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mnb {
    private int field_b;
    static boolean field_d;
    private boolean field_a;
    static String field_g;
    private boolean field_e;
    int field_f;
    qfa field_c;

    abstract void a(int param0);

    protected final void finalize() throws Throwable {
        if (!((mnb) this).field_e) {
            ((mnb) this).field_c.b(-100, ((mnb) this).field_b, ((mnb) this).field_f);
            ((mnb) this).field_e = true;
            super.finalize();
            return;
        }
        super.finalize();
    }

    mnb(qfa param0, int param1, byte[] param2, int param3, boolean param4) {
        ((mnb) this).field_e = false;
        ((mnb) this).field_b = param3;
        ((mnb) this).field_c = param0;
        ((mnb) this).field_a = param4 ? true : false;
        jaggl.OpenGL.glGenBuffersARB(1, qra.field_p, 0);
        ((mnb) this).field_f = qra.field_p[0];
        ((mnb) this).a(34962);
        jaggl.OpenGL.glBufferDataARBub(param1, ((mnb) this).field_b, param2, 0, !((mnb) this).field_a ? 35044 : 35040);
        ((mnb) this).field_c.field_mc = ((mnb) this).field_c.field_mc + ((mnb) this).field_b;
    }

    public static void b(int param0) {
        if (param0 <= 109) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(jk param0, boolean param1) {
        jk var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param1) {
          param0.b(-3846);
          var2 = (jk) (Object) cta.field_q.d(0);
          L0: while (true) {
            if (var2 != null) {
              if (var2.a(26344, param0)) {
                var2 = (jk) (Object) cta.field_q.a((byte) 114);
                continue L0;
              } else {
                L1: {
                  if (var2 != null) {
                    al.a((ksa) (Object) param0, (ksa) (Object) var2, 2);
                    break L1;
                  } else {
                    cta.field_q.b(-10258, (ksa) (Object) param0);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (var2 != null) {
                  al.a((ksa) (Object) param0, (ksa) (Object) var2, 2);
                  break L2;
                } else {
                  cta.field_q.b(-10258, (ksa) (Object) param0);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          field_d = false;
          param0.b(-3846);
          var2 = (jk) (Object) cta.field_q.d(0);
          L3: while (true) {
            if (var2 != null) {
              if (var2.a(26344, param0)) {
                var2 = (jk) (Object) cta.field_q.a((byte) 114);
                continue L3;
              } else {
                L4: {
                  if (var2 != null) {
                    al.a((ksa) (Object) param0, (ksa) (Object) var2, 2);
                    break L4;
                  } else {
                    cta.field_q.b(-10258, (ksa) (Object) param0);
                    break L4;
                  }
                }
                return;
              }
            } else {
              L5: {
                if (var2 != null) {
                  al.a((ksa) (Object) param0, (ksa) (Object) var2, 2);
                  break L5;
                } else {
                  cta.field_q.b(-10258, (ksa) (Object) param0);
                  break L5;
                }
              }
              return;
            }
          }
        }
    }

    static {
    }
}
