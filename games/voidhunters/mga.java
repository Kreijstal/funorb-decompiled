/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mga implements mkb {
    private byte field_b;
    private int field_c;
    jagdx.IDirect3DVertexBuffer field_f;
    private nla field_g;
    private boolean field_d;
    private boolean field_e;
    private int field_a;

    public final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        ((mga) this).field_c = param1;
        if (param2 <= 81) {
          L0: {
            ((mga) this).field_g = null;
            ((mga) this).field_b = (byte)param0;
            if (((mga) this).field_a >= ((mga) this).field_c) {
              break L0;
            } else {
              L1: {
                var5 = 8;
                if (((mga) this).field_e) {
                  var4 = 0;
                  var5 = var5 | 512;
                  break L1;
                } else {
                  var4 = 1;
                  break L1;
                }
              }
              L2: {
                if (((mga) this).field_f != null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              ((mga) this).field_f = ((mga) this).field_g.field_Mc.a(((mga) this).field_c, var5, 0, var4, ((mga) this).field_f);
              ((mga) this).field_a = ((mga) this).field_c;
              break L0;
            }
          }
          L3: {
            if (((mga) this).field_f == null) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L3;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L3;
            }
          }
          return stackIn_24_0 != 0;
        } else {
          L4: {
            ((mga) this).field_b = (byte)param0;
            if (((mga) this).field_a >= ((mga) this).field_c) {
              break L4;
            } else {
              L5: {
                var5 = 8;
                if (((mga) this).field_e) {
                  var4 = 0;
                  var5 = var5 | 512;
                  break L5;
                } else {
                  var4 = 1;
                  break L5;
                }
              }
              L6: {
                if (((mga) this).field_f != null) {
                  break L6;
                } else {
                  break L6;
                }
              }
              ((mga) this).field_f = ((mga) this).field_g.field_Mc.a(((mga) this).field_c, var5, 0, var4, ((mga) this).field_f);
              ((mga) this).field_a = ((mga) this).field_c;
              break L4;
            }
          }
          L7: {
            if (((mga) this).field_f == null) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L7;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L7;
            }
          }
          return stackIn_12_0 != 0;
        }
    }

    final int a(byte param0) {
        int var2 = -6 % ((27 - param0) / 60);
        return ((mga) this).field_b;
    }

    public final void a(int param0) {
        if (param0 > -84) {
          L0: {
            ((mga) this).field_d = false;
            if (((mga) this).field_f != null) {
              ((mga) this).field_f = null;
              break L0;
            } else {
              break L0;
            }
          }
          ((mga) this).field_c = 0;
          ((mga) this).field_a = 0;
          return;
        } else {
          L1: {
            if (((mga) this).field_f != null) {
              ((mga) this).field_f = null;
              break L1;
            } else {
              break L1;
            }
          }
          ((mga) this).field_c = 0;
          ((mga) this).field_a = 0;
          return;
        }
    }

    public final boolean b(int param0) {
        if (param0 == -20836) {
          if (((mga) this).field_d) {
            if (!jagdx.hea.b(((mga) this).field_f.Unlock(), (byte) 53)) {
              return false;
            } else {
              ((mga) this).field_d = false;
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((mga) this).field_c = 48;
          if (((mga) this).field_d) {
            if (!jagdx.hea.b(((mga) this).field_f.Unlock(), (byte) 53)) {
              return false;
            } else {
              ((mga) this).field_d = false;
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        if (null == ((mga) this).field_f) {
            return null;
        }
        param0 = param0 & ((mga) this).field_e;
        if (param1 <= 16) {
            ((mga) this).field_e = false;
            if (((mga) this).field_d) {
                return null;
            }
            if (!(!jagdx.hea.b(((mga) this).field_f.Lock(0, ((mga) this).field_a, !param0 ? 0 : 8192, ((mga) this).field_g.field_Kc), (byte) 93))) {
                ((mga) this).field_d = true;
                return (jaclib.memory.Buffer) (Object) ((mga) this).field_g.field_Kc;
            }
            return null;
        }
        if (((mga) this).field_d) {
            return null;
        }
        if (!(!jagdx.hea.b(((mga) this).field_f.Lock(0, ((mga) this).field_a, !param0 ? 0 : 8192, ((mga) this).field_g.field_Kc), (byte) 93))) {
            ((mga) this).field_d = true;
            return (jaclib.memory.Buffer) (Object) ((mga) this).field_g.field_Kc;
        }
        return null;
    }

    mga(nla param0, boolean param1) {
        ((mga) this).field_d = false;
        ((mga) this).field_g = param0;
        ((mga) this).field_e = param1 ? true : false;
    }
}
