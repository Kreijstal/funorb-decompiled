/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static String[] field_u;
    private int bitPosition;
    static byte[] field_A;
    private int field_y;
    static BitmapFont field_t;
    static dn field_x;
    private ga field_z;
    static Battlefield currentBattlefield;

    final void d(byte param0, int param1) {
        this.bitPosition = param1;
        if (param0 < -16) {
          return;
        }
        int[] var4 = (int[]) null;
        this.a((int[]) null, -64);
    }

    static boolean a(boolean param0, boolean param1) {
        return param0 ^ param1;
    }

    final int a(boolean param0) {
        if (param0) {
          return 59;
        }
        return this.bitPosition;
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 == 32161) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(param1 + this.field_z.a(256));
          return;
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var5 = -82 / ((-41 - param0) / 57);
        int var3 = this.bitPosition >> 3;
        int var4 = 8 - (7 & this.bitPosition);
        this.bitPosition = this.bitPosition + param1;
        int var6 = 0;
        while (var4 < param1) {
          incrementValue$0 = var3;
          var3++;
          var6 = var6 + ((this.payload[incrementValue$0] & GameEvent.field_n[var4]) << -var4 + param1);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 == var4) {
          var6 = var6 + (GameEvent.field_n[var4] & this.payload[var3]);
        } else {
          var6 = var6 + (this.payload[var3] >> var4 - param1 & GameEvent.field_n[param1]);
        }
        return var6;
    }

    final void o(int param0) {
        this.bitPosition = 8 * this.position;
        if (param0 > 10) {
          return;
        }
        this.o(52);
    }

    final void c(int param0, byte param1) {
        if (param1 != 0) {
          return;
        }
        this.field_y = 8 - (param0 & 7);
        this.position = param0 >> 3;
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4Lifetime1;
        int var5Lifetime1;
        param2 = param2 & GameEvent.field_n[param1];
        if (param0 == -16807) {
          while (this.field_y < param1) {
            param1 = param1 - this.field_y;
            this.payload[this.position] = (byte)oe.c(param2 >>> param1, rn.a((int) this.payload[this.position], 255 << this.field_y));
            this.field_y = 8;
            this.position = this.position + 1;
          }
          if (param1 == this.field_y) {
            this.payload[this.position] = (byte)oe.c(param2, rn.a((int) this.payload[this.position], 255 << this.field_y));
            this.position = this.position + 1;
            this.field_y = 8;
          } else {
            var4 = -param1 + this.field_y;
            var5 = ~(GameEvent.field_n[param1] << var4);
            this.payload[this.position] = (byte)oe.c(rn.a(var5, (int) this.payload[this.position]), param2 << var4);
            this.field_y = this.field_y - param1;
            return;
          }
          return;
        }
        this.d((byte) -128, -74);
        while (this.field_y < param1) {
          param1 = param1 - this.field_y;
          this.payload[this.position] = (byte)oe.c(param2 >>> param1, rn.a((int) this.payload[this.position], 255 << this.field_y));
          this.field_y = 8;
          this.position = this.position + 1;
        }
        if (param1 == this.field_y) {
          this.payload[this.position] = (byte)oe.c(param2, rn.a((int) this.payload[this.position], 255 << this.field_y));
          this.position = this.position + 1;
          this.field_y = 8;
        } else {
          var4Lifetime1 = -param1 + this.field_y;
          var5Lifetime1 = ~(GameEvent.field_n[param1] << var4Lifetime1);
          this.payload[this.position] = (byte)oe.c(rn.a(var5Lifetime1, (int) this.payload[this.position]), param2 << var4Lifetime1);
          this.field_y = this.field_y - param1;
          return;
        }
    }

    final int m(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 255) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.field_z.a(256) & 255;
        }
        this.bitPosition = -69;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.field_z.a(256) & 255;
    }

    final void a(int[] param0, int param1) {
        try {
          if (param1 >= -76) {
            currentBattlefield = (Battlefield) null;
          }
          this.field_z = new ga(param0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "bv.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void k(byte param0) {
        field_x = null;
        field_t = null;
        field_A = null;
        currentBattlefield = null;
        field_u = null;
        if (param0 != -97) {
          CipherPacketBuffer.a(true, -32, -99, 30);
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var5_int = 0; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[param3 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.field_z.a(256));
          }
          if (param2) {
            this.o(-70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bv.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var4Lifetime1;
        if (param1 == jt.field_a) {
          return;
        }
        hi.field_i = null;
        ho.a(73);
        ui.field_c = param3;
        if (0 != param1) {
          if (param1 == 23) {
            ui.field_c = 0;
          }
          if (param1 != -10) {
            mu.field_a = new cg();
          }
          qc.field_j = 0;
          if (nm.a(jt.field_a, true)) {
            rq.field_p[jt.field_a].d(true);
          }
        } else {
          ui.field_c = 0;
          hh.a(-16147, 50, mp.field_Ob, true);
          if (param1 != 23) {
            if (param1 != -10) {
              mu.field_a = new cg();
            }
            qc.field_j = 0;
            if (nm.a(jt.field_a, true)) {
              rq.field_p[jt.field_a].d(true);
            }
          } else {
            ui.field_c = 0;
            if (param1 != -10) {
              mu.field_a = new cg();
              qc.field_j = 0;
              if (nm.a(jt.field_a, true)) {
                rq.field_p[jt.field_a].d(true);
              }
            } else {
              qc.field_j = 0;
              if (!nm.a(jt.field_a, true)) {
                if (!nm.a(param1, true)) {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                  }
                  jt.field_a = param1;
                  if (param2 == 1) {
                    return;
                  }
                  CipherPacketBuffer.k((byte) -51);
                  return;
                }
                var4 = -2;
                if (param1 == 15) {
                  var4 = -1;
                }
                if (param1 == 0) {
                  var4 = 2;
                }
                if (param1 == 7) {
                  var4 = 1;
                }
                if (param1 == 20) {
                  var4 = 0;
                }
                if (param1 == 12) {
                  var4 = 1;
                }
                if (param1 == 18) {
                  var4 = 2;
                }
                if (var4 == -2) {
                  rq.field_p[param1].a(71, param0, 0);
                } else {
                  rq.field_p[param1].a(85, param0, var4);
                }
                if (param1 == 15) {
                  SkeletonLimitMarker.a(param0, param2 - 1);
                }
                if (jt.field_a == 16) {
                  fg.a((byte) 111);
                  ts.a((byte) -41);
                  vr.a(iw.field_l, 18);
                }
                jt.field_a = param1;
                if (param2 == 1) {
                  return;
                }
                CipherPacketBuffer.k((byte) -51);
                return;
              }
              rq.field_p[jt.field_a].d(true);
            }
          }
        }
        if (nm.a(param1, true)) {
          var4Lifetime1 = -2;
          if (param1 == 15) {
            var4Lifetime1 = -1;
          }
          if (param1 == 0) {
            var4Lifetime1 = 2;
          }
          if (param1 == 7) {
            var4Lifetime1 = 1;
          }
          if (param1 == 20) {
            var4Lifetime1 = 0;
          }
          if (param1 == 12) {
            var4Lifetime1 = 1;
          }
          if (param1 == 18) {
            var4Lifetime1 = 2;
          }
          if (var4Lifetime1 == -2) {
            rq.field_p[param1].a(71, param0, 0);
          } else {
            rq.field_p[param1].a(85, param0, var4Lifetime1);
          }
          if (param1 == 15) {
            SkeletonLimitMarker.a(param0, param2 - 1);
          }
        }
        if (jt.field_a == 16) {
          fg.a((byte) 111);
          ts.a((byte) -41);
          vr.a(iw.field_l, 18);
        }
        jt.field_a = param1;
        if (param2 == 1) {
          return;
        }
        CipherPacketBuffer.k((byte) -51);
    }

    final void n(int param0) {
        this.position = (7 + this.bitPosition) / 8;
        if (param0 == -2) {
          return;
        }
        this.c(-66, (byte) 60);
    }

    static {
        field_u = new String[]{"aviansie_axe_spin", null, null, null, null, "spin", null};
        field_A = new byte[]{(byte)7, (byte)4, (byte)4, (byte)4, (byte)2, (byte) 5};
    }
}
