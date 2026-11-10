/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HazardModel extends TrapModel {
    private fla field_r;
    private fla field_v;
    private int field_s;
    private int field_p;
    private int field_o;
    private int field_m;
    private boolean field_n;
    private int field_u;
    private int field_q;
    static jea field_t;

    final void a(boolean param0, int param1) {
        try {
          if (param0) {
            this.field_r = (fla) null;
          }
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fu.H(" + param0 + ',' + param1 + ')');
        }
    }

    HazardModel(int param0, Room param1, BitPacketBuffer param2) {
        super(param0, param1, param2);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void encode(byte param0, BitPacketBuffer param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.encode((byte) 90, param1);
          var3_int = 39 % ((-8 - param0) / 40);
          param1.writeBits((byte) -128, this.field_u, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fu.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    HazardModel(int param0) {
        super(param0);
        this.field_v = null;
        this.field_n = true;
        this.field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u == 0) {
            via.a(RevolverItemComponent.field_J[17], this.field_m, this.field_q, param3 + 1572864, param2, param1, 111, 0);
          } else {
            if (this.field_u == 1) {
              gqa.a(this.field_m, -83584144, param1, param2, RevolverItemComponent.field_J[76], param3);
            }
          }
          var6_int = 67 % ((param4 + 38) / 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("fu.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        Object var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        try {
          if (null != bl.field_a) {
            var3_int = bl.field_a.a(param2, 1513);
            if (var3_int != 0) {
              if (var3_int == 2 &&
                bl.field_a.field_r != null &&
                !bl.field_a.field_r.equals("")) {
                if (bl.field_a.field_r.charAt(0) != 91) {
                  var7 = (CharSequence) ((Object) bl.field_a.field_r);
                  var4 = jd.a(1, var7);
                } else {
                  var4 = bl.field_a.field_r;
                }
                var5 = null;
                if (ResourceArchive.field_k == 0) {
                  var5 = rf.a(true, var4, param1);
                }
                if (1 == ResourceArchive.field_k) {
                  var5 = uca.a(var4, (byte) 102, param1);
                }
                if (ResourceArchive.field_k == 2) {
                  var5 = nna.a(-3, var4, param1);
                }
                if (3 == ResourceArchive.field_k) {
                  var5 = kc.a(var4, param1, false, var4);
                }
                if (var5 != null) {
                  var6 = (String) null;
                  gu.a(0, true, var4, (String) (var5), (String) null, 2);
                }
              }
              bl.field_a = null;
              ResourceArchive.field_k = -1;
            }
          }
          if (param0 > -37) {
            HazardModel.n((byte) 14);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "fu.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void decode(int param0, Room param1, BitPacketBuffer param2) {
        iq var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          super.decode(120, param1, param2);
          if (param0 <= 119) {
            var5 = (iq) null;
            this.a((iq) null, -12, 26, 100, (byte) -44);
          }
          if (param1.formatVersion >= 16) {
            this.field_u = param2.readBits((byte) 44, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fu.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void n(byte param0) {
        try {
          field_t = null;
          if (param0 != -51) {
            field_t = (jea) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fu.F(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        int var3_int = 0;
        Trap var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var7_int = 0;
        Locomotor var7 = null;
        Behaviour var8 = null;
        int var9 = 0;
        Object var10 = null;
        w var10_ref = null;
        IntrusiveDeque var11 = null;
        IntrusiveDequeCursor var12 = null;
        IntrusiveDeque var13 = null;
        IntrusiveDequeCursor var14 = null;
        int var4Lifetime1;
        var10 = null;
        var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          super.d(param0);
          if (this.field_u == 0) {
            var4 = this.getBody((byte) 16).getX(3);
            var5 = this.getBody((byte) 16).getY(param0 + 9649);
            if (this.field_n) {
              var3_int = 0;
              var2_int = 0;
              this.field_n = false;
            } else {
              var3_int = var5 - this.field_p;
              var2_int = var4 - this.field_o;
            }
            this.field_p = var5;
            this.field_o = var4;
            if (var2_int != 0 ||
              var3_int != 0) {
              this.field_m = GameScreen.a(qva.a((byte) -103, -var3_int, var2_int) >> 2, 2048, 125);
              this.field_q = GameScreen.a(this.field_q - (ua.a(var2_int >> 13, -113) + ua.a(var3_int >> 13, 67)), 2048, -100);
              if (!(65536 >= ua.a(var2_int, param0 + 93)) ||
                !(ua.a(var3_int, param0 ^ -85) <= 65536)) {
                this.a(103).a(false, this.getRenderX((byte) -119), 0, -var2_int, this.getRenderY((byte) 127), -var3_int);
              }
            }
          } else {
            if (this.field_u == 1 && (null == this.part ||
              this.part.isEnabled(-93))) {
              this.field_m = GameScreen.a(128 + this.field_m, 2048, 122);
            }
          }
          var10_ref = (w) (this.a(param0 + 64).field_G);
          if (var10_ref == null) {
            return;
          }
          var3_ref = (Trap) (this.body);
          if (!var3_ref.d(50, false)) {
            stackIn_28_0 = (this.field_u == 1) ? 1 : 0;
          } else {
            stackIn_28_0 = 1;
          }
          {
            var4Lifetime1 = stackIn_28_0;
            if (var4Lifetime1 != 0 && (null == this.field_v ||
              !this.field_v.isLinked((byte) -101))) {
              if (this.field_u == 0) {
                this.field_v = var10_ref.a(new fm(10, this.getRenderX((byte) -90), this.getRenderY((byte) 103), this.getRenderZ((byte) -103)), param0 - 57);
              } else if (this.field_u != 1) {
              } else {
                this.field_v = var10_ref.a(new fm(11, this.getRenderX((byte) 112), this.getRenderY((byte) 121), this.getRenderZ((byte) -125)), -58);
              }
            } else {
              if (this.field_v != null &&
                var4Lifetime1 == 0) {
                this.field_v.a(-90, var10_ref);
                this.field_v = null;
              }
            }
          }
          if (this.field_v != null) {
            this.field_v.a(this.getRenderX((byte) -83), var10_ref.field_c, -128, var10_ref.field_h, this.getRenderY((byte) 107));
          }
          if (this.field_u == 1) {
            var11 = var3_ref.behaviours;
            var12 = new IntrusiveDequeCursor(var11);
            var7_int = 0;
            var8 = (Behaviour) (var12.first(true));
            while (var8 != null) {
              if (var8 instanceof ConstantEffectBehaviour &&
                ((ConstantEffectBehaviour) (var8)).field_o > 0) {
                var7_int = 1;
              }
              var8 = (Behaviour) (var12.next(-1));
            }
            if (var7_int != 0 &&
              null == this.field_r) {
              this.field_r = var10_ref.a(new fm(12, this.getRenderX((byte) -105), this.getRenderY((byte) 104), this.getRenderZ((byte) -119)), -58);
            }
            if (this.field_r != null &&
              this.field_r.field_i.field_f.e()) {
              this.field_r.a(-88, var10_ref);
              this.field_r = null;
            }
          }
          if (0 == this.field_u) {
            var13 = var3_ref.locomotors;
            var14 = new IntrusiveDequeCursor(var13);
            var7 = (Locomotor) (var14.first(true));
            while (var7 != null) {
              if (var7 instanceof PathMoveLocomotor &&
                ((PathMoveLocomotor) (var7)).d(false) != this.field_s) {
                var10_ref.a(new fm(3, this.getRenderX((byte) 68), this.getRenderY((byte) 124), this.getRenderZ((byte) -111)), -58);
                this.field_s = ((PathMoveLocomotor) (var7)).d(false);
              }
              var7 = (Locomotor) (var14.next(param0 + 0));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fu.K(" + param0 + ')');
        }
    }

    static {
    }
}
