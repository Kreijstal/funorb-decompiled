/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lia implements qm {
    jagdx.IDirect3DVertexBuffer field_e;
    private int field_a;
    private boolean field_g;
    private boolean field_f;
    private int field_b;
    private byte field_d;
    private cta field_c;

    final int b(int param0) {
        if (param0 != -7339) {
            return 115;
        }
        return ((lia) this).field_d;
    }

    public final void a(int param0) {
        if (null == ((lia) this).field_e) {
          ((lia) this).field_a = 0;
          if (param0 != 12574) {
            boolean discarded$4 = ((lia) this).a(51, -94, true);
            ((lia) this).field_b = 0;
            return;
          } else {
            ((lia) this).field_b = 0;
            return;
          }
        } else {
          ((lia) this).field_e = null;
          ((lia) this).field_a = 0;
          if (param0 == 12574) {
            ((lia) this).field_b = 0;
            return;
          } else {
            boolean discarded$5 = ((lia) this).a(51, -94, true);
            ((lia) this).field_b = 0;
            return;
          }
        }
    }

    public final boolean a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        ((lia) this).field_d = (byte)param1;
        if (param2) {
          ((lia) this).field_a = param0;
          if (((lia) this).field_b < ((lia) this).field_a) {
            L0: {
              var5 = 8;
              if (!((lia) this).field_f) {
                var4 = 1;
                break L0;
              } else {
                var4 = 0;
                var5 = var5 | 512;
                break L0;
              }
            }
            if (((lia) this).field_e != null) {
              L1: {
                ((lia) this).field_e = ((lia) this).field_c.field_jd.a(((lia) this).field_a, var5, 0, var4, ((lia) this).field_e);
                ((lia) this).field_b = ((lia) this).field_a;
                if (null == ((lia) this).field_e) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              return stackIn_15_0 != 0;
            } else {
              L2: {
                ((lia) this).field_e = ((lia) this).field_c.field_jd.a(((lia) this).field_a, var5, 0, var4, ((lia) this).field_e);
                ((lia) this).field_b = ((lia) this).field_a;
                if (null == ((lia) this).field_e) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0 != 0;
            }
          } else {
            L3: {
              if (null == ((lia) this).field_e) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L3;
              }
            }
            return stackIn_20_0 != 0;
          }
        } else {
          return true;
        }
    }

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (null == ((lia) this).field_e) {
            return null;
        }
        param1 = param1 & ((lia) this).field_f;
        if (param0 != -15730) {
            boolean discarded$7 = ((lia) this).a(52, 89, false);
            if (((lia) this).field_g) {
                return null;
            }
            if (!(!jagdx.ah.a(((lia) this).field_e.Lock(0, ((lia) this).field_b, param1 ? 8192 : 0, ((lia) this).field_c.field_Oc), (byte) 79))) {
                ((lia) this).field_g = true;
                return (jaclib.memory.Buffer) (Object) ((lia) this).field_c.field_Oc;
            }
            return null;
        }
        if (((lia) this).field_g) {
            return null;
        }
        if (!(!jagdx.ah.a(((lia) this).field_e.Lock(0, ((lia) this).field_b, param1 ? 8192 : 0, ((lia) this).field_c.field_Oc), (byte) 79))) {
            ((lia) this).field_g = true;
            return (jaclib.memory.Buffer) (Object) ((lia) this).field_c.field_Oc;
        }
        return null;
    }

    public final boolean a(boolean param0) {
        if (param0) {
          if (((lia) this).field_g) {
            if (!jagdx.ah.a(((lia) this).field_e.Unlock(), (byte) -109)) {
              return false;
            } else {
              ((lia) this).field_g = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$8 = ((lia) this).a(-68, -25, false);
          if (((lia) this).field_g) {
            if (!jagdx.ah.a(((lia) this).field_e.Unlock(), (byte) -109)) {
              return false;
            } else {
              ((lia) this).field_g = false;
              return true;
            }
          } else {
            return false;
          }
        }
    }

    lia(cta param0, boolean param1) {
        ((lia) this).field_g = false;
        ((lia) this).field_f = param1 ? true : false;
        ((lia) this).field_c = param0;
    }
}
