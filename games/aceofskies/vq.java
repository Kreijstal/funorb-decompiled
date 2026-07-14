/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vq extends mi {
    private kp field_x;
    private jo field_z;
    static int field_w;
    private String[] field_y;

    final void a(int param0, String param1, int param2) {
        String[] var5 = null;
        int var6 = 0;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        int var4 = -56 / ((param0 - 14) / 53);
        if (((vq) this).field_y != null) {
            // if_icmpge L36
        } else {
            var5 = new String[param2 + 1];
            if (!(null == ((vq) this).field_y)) {
                for (var6 = 0; ((vq) this).field_y.length > var6; var6++) {
                    var5[var6] = ((vq) this).field_y[var6];
                }
            }
            ((vq) this).field_y = (String[]) var5;
        }
        ((vq) this).field_y[param2] = param1;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        ((vq) this).a(((et) ((vq) this).field_e).a(param3 + 2147483537, (ea) this), param0, param1, param2, (byte) 124);
        if (param3 != 110) {
            ((vq) this).a((byte) -98, -99, -83, 107);
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        this.a((byte) 109, param1, param2, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        et var9 = (et) ((vq) this).field_e;
        jo var6 = ((vq) this).field_z;
        if (var6 != null) {
            var7 = ((et) var9).a(param3, (ea) this, (byte) -128);
            var8 = ((et) var9).a(param2, false, (ea) this);
            do {
                co.a(var8 + (((jo) var6).field_g + -2), ((jo) var6).field_e + 2, 2 + ((jo) var6).field_h, var7 + ((jo) var6).field_i + -2, 112);
                var6 = ((jo) var6).field_f;
            } while (var6 != null);
        }
        if (param0 < 64) {
            ((vq) this).a(-83, 88, 88, -90, (byte) 51);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        this.a(param0, param1, param2, param3, (byte) 127);
        if (param4 <= 122) {
            return;
        }
        ((vq) this).a((byte) -67);
    }

    final void a(int param0, int param1, int param2, int param3) {
        this.a(param0, param1, param2, param3);
        int var5 = param1 + -((vq) this).field_p;
        int var6 = -((vq) this).field_h + param3;
        jo var7 = this.c(var6, 0, var5);
        if (var7 != null) {
            if (((vq) this).field_o != null) {
                ((ue) ((vq) this).field_o).a((byte) -73, param2, (vq) this, ((jo) var7).field_k);
            }
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        this.a((byte) 53, param1, param2, param3);
        ((vq) this).field_z = null;
        if (!(!((vq) this).field_g)) {
            var5 = ic.field_b - (param3 + ((vq) this).field_p);
            var6 = -((vq) this).field_h + (cf.field_g - param2);
            ((vq) this).field_z = this.c(var6, 0, var5);
        }
        if (param0 < 13) {
            ea var7 = (ea) null;
            ((vq) this).a((byte) 11, (ea) null, -123, 59);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        et var3 = null;
        pp var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jo var10 = null;
        int var11 = 0;
        co var12 = null;
        int var13 = 0;
        int var14 = 0;
        jo var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = AceOfSkies.field_G ? 1 : 0;
        ((vq) this).field_x = new kp();
        var2 = 0;
        var3 = (et) ((vq) this).field_e;
        if (param0 == -67) {
          var4 = ((et) var3).a((byte) 66, (ea) this);
          L0: while (true) {
            var5 = ((vq) this).field_f.indexOf("<hotspot=", var2);
            if (0 == (var5 ^ -1)) {
              return;
            } else {
              var7 = ((vq) this).field_f.indexOf(">", var5);
              var6 = ((vq) this).field_f.substring(var5 + 9, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((vq) this).field_f.indexOf("</hotspot>", var5);
              var8 = var4.a(1, var5);
              var9 = var4.a(1, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var11 > var9) {
                  continue L0;
                } else {
                  L2: {
                    var12 = ((pp) var4).field_b[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var4.b(var5, -122);
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = ((co) var12).field_h[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var9 != var11) {
                      if (var12 != null) {
                        stackOut_13_0 = ((co) var12).field_h[-1 + ((co) var12).field_h.length];
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.b(var2, -114);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new jo(var7, var13, ((co) var12).field_f, -var13 + var14, Math.max(((et) var3).a(-4), ((co) var12).field_d - ((co) var12).field_f));
                    if (var10 == null) {
                      break L4;
                    } else {
                      var10.field_f = (jo) var15;
                      break L4;
                    }
                  }
                  var10 = var15;
                  ((vq) this).field_x.a(66, (wf) (Object) var15);
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final jo c(int param0, int param1, int param2) {
        jo var4 = null;
        jo var5 = null;
        int var6 = 0;
        String var7 = null;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            var7 = (String) null;
            ((vq) this).a(-112, (String) null, -74);
            break L0;
          }
        }
        var4 = (jo) ((vq) this).field_x.d(268435455);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (jo) ((vq) this).field_x.b((byte) 103);
                continue L1;
              } else {
                L3: {
                  if (((jo) var5).field_i > param2) {
                    break L3;
                  } else {
                    if (((jo) var5).field_g > param0) {
                      break L3;
                    } else {
                      if (((jo) var5).field_h + ((jo) var5).field_i <= param2) {
                        break L3;
                      } else {
                        if (((jo) var5).field_g + ((jo) var5).field_e < param0) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = ((jo) var5).field_f;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    String c(byte param0) {
        if (param0 >= -41) {
            return (String) null;
        }
        if (((vq) this).field_z == null) {
            return null;
        }
        if (((vq) this).field_y == null) {
            return null;
        }
        if (((vq) this).field_y.length <= ((vq) this).field_z.field_k) {
            return null;
        }
        return ((vq) this).field_y[((vq) this).field_z.field_k];
    }

    boolean a(ea param0, byte param1) {
        if (param1 != -42) {
            return true;
        }
        return false;
    }

    vq(String param0, ir param1) {
        super(param0, (no) null);
        ((vq) this).field_z = null;
        ((vq) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
    }
}
