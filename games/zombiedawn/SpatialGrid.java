/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpatialGrid {
    private int field_l;
    private int field_f;
    private int field_j;
    private int field_i;
    int field_d;
    private int field_m;
    private SpatialBucket field_k;
    private SpatialBucket[] field_e;
    static int[] field_g;
    private SpatialObject field_a;
    private int field_h;
    private int field_c;
    static int field_b;

    private final SpatialBucket a(int param0, int param1, int param2) {
        if (param0 != 1) {
          this.field_j = 32;
          return this.a(false, param1, param2, 0);
        }
        return this.a(false, param1, param2, 0);
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        bo var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ZombieDawn.field_J;
        try {
          if (param1 != -1) {
            SpatialGrid.a(103, -42);
          }
          var4 = (bo) (mp.field_g.b((byte) 26));
          while (var4 != null) {
            SecondaryNodeDequeIterator.a(param0, true, var4);
            var4 = (bo) (mp.field_g.a(false));
          }
          var2 = qi.field_J.b((byte) 26);
          while (var2 != null) {
            pp.a(2, param0);
            var2 = qi.field_J.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2_ref), "mj.J(" + param0 + ',' + param1 + ')');
        }
    }

    final SpatialObject a(int param0, int param1, int param2, int param3) {
        if (param2 != 29845) {
          this.field_j = -108;
          return this.a(param1 - param0, param3 - param0, param3 + param0, param0 + param1, true);
        }
        return this.a(param1 - param0, param3 - param0, param3 + param0, param0 + param1, true);
    }

    private final SpatialBucket a(boolean param0, int param1, int param2, int param3) {
        SpatialBucket dupTemp$0 = null;
        if (param1 >= this.field_m) {
          return null;
        }
        if (param2 >= this.field_d) {
          return null;
        }
        if (param1 < 0) {
          return null;
        }
        if (0 > param2) {
          return null;
        }
        SpatialBucket var5 = this.field_e[param2 + param1 * this.field_d];
        if (var5 == null &&
          param0) {
          dupTemp$0 = new SpatialBucket();
          this.field_e[param2 + param1 * this.field_d] = dupTemp$0;
          var5 = dupTemp$0;
        }
        if (param3 != 0) {
          java.awt.Component var6 = (java.awt.Component) null;
          SpatialGrid.a(31, (java.awt.Component) null);
          return var5;
        }
        return var5;
    }

    final SpatialObject b(boolean param0) {
        int var3;
        SpatialObject stackIn_5_1 = null;
        SpatialObject stackIn_14_1 = null;
        SpatialObject stackIn_28_1 = null;
        SpatialObject stackIn_38_1 = null;
        SpatialObject stackIn_49_1 = null;
        var3 = ZombieDawn.field_J;
        if (null != this.field_k) {
          if (null == this.field_a) {
            if (null != this.field_k) {
              stackIn_38_1 = this.field_k.b(29);
            } else {
              stackIn_38_1 = null;
            }
            this.field_a = stackIn_38_1;
          } else {
            this.field_a = this.field_k.a(-6116);
          }
          while (null == this.field_a) {
            this.field_l = this.field_l + 1;
            if (this.field_j < this.field_l) {
              this.field_c = this.field_c + 1;
              this.field_l = this.field_f;
              if (this.field_h < this.field_c) {
                this.field_a = null;
                if (param0) {
                  this.field_a = (SpatialObject) null;
                }
                return this.field_a;
              }
            }
            this.field_k = this.a(1, this.field_c, this.field_l);
            if (this.field_k != null) {
              stackIn_49_1 = this.field_k.b(45);
            } else {
              stackIn_49_1 = null;
            }
            this.field_a = stackIn_49_1;
          }
          if (!param0) {
            return this.field_a;
          }
          this.field_a = (SpatialObject) null;
          return this.field_a;
        }
        this.field_k = this.a(1, this.field_c, this.field_l);
        if (null != this.field_a) {
          this.field_a = this.field_k.a(-6116);
          scanLoop1: while (true) {
            if (null == this.field_a) {
              this.field_l = this.field_l + 1;
              if (this.field_j < this.field_l) {
                this.field_c = this.field_c + 1;
                this.field_l = this.field_f;
                if (this.field_h < this.field_c) {
                  this.field_a = null;
                  break scanLoop1;
                }
              }
              this.field_k = this.a(1, this.field_c, this.field_l);
              if (this.field_k != null) {
                stackIn_28_1 = this.field_k.b(45);
              } else {
                stackIn_28_1 = null;
              }
              this.field_a = stackIn_28_1;
              continue;
            }
            break;
          }
          if (param0) {
            this.field_a = (SpatialObject) null;
          }
          return this.field_a;
        }
        if (null != this.field_k) {
          stackIn_5_1 = this.field_k.b(29);
        } else {
          stackIn_5_1 = null;
        }
        this.field_a = stackIn_5_1;
        scanLoop2: while (true) {
          if (null == this.field_a) {
            this.field_l = this.field_l + 1;
            if (this.field_j < this.field_l) {
              this.field_c = this.field_c + 1;
              this.field_l = this.field_f;
              if (this.field_h < this.field_c) {
                this.field_a = null;
                break scanLoop2;
              }
            }
            this.field_k = this.a(1, this.field_c, this.field_l);
            if (this.field_k != null) {
              stackIn_14_1 = this.field_k.b(45);
            } else {
              stackIn_14_1 = null;
            }
            this.field_a = stackIn_14_1;
            continue;
          }
          break;
        }
        if (param0) {
          this.field_a = (SpatialObject) null;
        }
        return this.field_a;
    }

    final void a(int param0, int param1, SpatialObject param2, int param3) {
        SpatialBucket var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param1 != -1) {
            this.field_j = -40;
          }
          var5 = this.a(true, param0, param3, 0);
          if (var5 != null) {
            var5.a((byte) 65, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("mj.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = 6 / ((param0 + 48) / 33);
    }

    final SpatialObject a(boolean param0) {
        if (!param0) {
          this.field_a = (SpatialObject) null;
          return this.a(0, 0, -1 + this.field_d, -1 + this.field_m, true);
        }
        return this.a(0, 0, -1 + this.field_d, -1 + this.field_m, true);
    }

    final SpatialObject a(int param0, int param1, int param2, int param3, boolean param4) {
        this.field_i = param0 < 0 ? 0 : param0;
        this.field_h = param3 >= this.field_m ? -1 + this.field_m : param3;
        this.field_f = param1 < 0 ? 0 : param1;
        this.field_j = param2 < this.field_d ? param2 : this.field_d - 1;
        if (!param4) {
          this.field_i = 26;
          this.field_a = null;
          this.field_k = null;
          this.field_l = this.field_f;
          this.field_c = this.field_i;
          return this.b(!param4 ? true : false);
        }
        this.field_a = null;
        this.field_k = null;
        this.field_l = this.field_f;
        this.field_c = this.field_i;
        return this.b(!param4 ? true : false);
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(ng.field_b);
          param1.removeMouseMotionListener(ng.field_b);
          param1.removeFocusListener(ng.field_b);
          if (param0 != 3490) {
            field_b = 29;
          }
          IntrusiveNode.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "mj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    SpatialGrid(int param0, int param1) {
        this.field_d = param0;
        this.field_m = param1;
        this.field_e = new SpatialBucket[this.field_d * this.field_m];
    }

    static {
    }
}
