/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends llb {
    static int field_Cb;
    llb field_Ib;
    boolean field_Lb;
    llb field_wb;
    String field_xb;
    long field_zb;
    int field_yb;
    int field_Db;
    String field_Hb;
    boolean field_Eb;
    llb field_Jb;
    boolean field_Fb;
    int field_Gb;
    long field_Kb;
    llb field_Nb;
    int field_Ab;
    int field_vb;
    int field_Bb;
    llb field_Mb;

    final boolean a(int param0, jk param1) {
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          if (param1.field_Fb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 != (((jk) this).field_Fb ? 1 : 0)) {
          if (param0 == 26344) {
            L1: {
              if (param1.field_Eb) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              stackOut_10_0 = stackIn_10_0;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (((jk) this).field_Eb) {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L2;
              }
            }
            if (stackIn_13_0 != stackIn_13_1) {
              return ((jk) this).field_Eb;
            } else {
              L3: {
                if (((jk) this).field_Kb >= param1.field_Kb) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              return stackIn_17_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return ((jk) this).field_Fb;
        }
    }

    final boolean i(int param0) {
        int var2 = -19 / ((-46 - param0) / 57);
        return !((jk) this).c((byte) 97) ? true : false;
    }

    final void a(String param0, String param1, int param2) {
        Object var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ((jk) this).field_xb = param0;
        ((jk) this).field_Hb = param1;
        if (param2 != -424) {
          var5 = null;
          boolean discarded$6 = ((jk) this).a(-116, (jk) null);
          var6 = (CharSequence) (Object) ((jk) this).field_Hb;
          String discarded$7 = jwa.a(false, var6);
          return;
        } else {
          var7 = (CharSequence) (Object) ((jk) this).field_Hb;
          String discarded$8 = jwa.a(false, var7);
          return;
        }
    }

    jk(String param0, String param1, long param2) {
        super(0L, (llb) null);
        ((jk) this).field_zb = param2;
        ((jk) this).field_xb = param1;
        ((jk) this).field_Hb = param0;
        CharSequence var6 = (CharSequence) (Object) ((jk) this).field_Hb;
        String discarded$0 = jwa.a(false, var6);
    }

    final static void h(int param0) {
        sp.field_p = ik.a(param0 + -21167);
        if (param0 != 118) {
            field_Cb = 85;
        }
    }

    static {
    }
}
