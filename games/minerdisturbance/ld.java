/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends sb {
    static int field_B;
    private mf field_v;
    static ea field_x;
    static int field_w;
    private int field_z;
    private int field_y;
    static String[] field_A;

    final void b(int[] param0, int param1) {
        try {
          this.field_v = new mf(param0);
          int var3_int = -24 % ((param1 - 64) / 40);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ld.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        int var4Lifetime1;
        var5 = MinerDisturbance.field_ab;
        if (param1 == -1) {
          var4 = param2.indexOf(param3);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 == -1))) {
            param2 = param2.substring(0, var4) + param0 + param2.substring(param3.length() + var4);
            stackIn_7_0 = (String) (param2);
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_7_0).indexOf(param3, var4 + param0.length());
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_7_0 = (String) (param2);
          }
          return stackIn_7_0;
        }
        field_B = -32;
        var4Lifetime1 = param2.indexOf(param3);
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var4Lifetime1 == -1))) {
          param2 = param2.substring(0, var4Lifetime1) + param0 + param2.substring(param3.length() + var4Lifetime1);
          stackIn_13_0 = (String) (param2);
          if (var5 == 0) {
            var4Lifetime1 = ((String) (Object) stackIn_13_0).indexOf(param3, var4Lifetime1 + param0.length());
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = (String) (param2);
        }
        return stackIn_13_0;
    }

    final void c(boolean param0) {
        this.field_u[this.field_o] = (byte) 0;
        if (param0) {
          this.field_z = 8;
          return;
        }
        this.f((byte) 79);
        this.field_z = 8;
    }

    final void n(int param0) {
        if (8 > this.field_z) {
          this.field_z = 8;
          this.field_o = this.field_o + 1;
        }
        int var2 = 55 / ((param0 + 5) / 39);
    }

    ld(byte[] param0) {
        super(param0);
    }

    final int e(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == 0) {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          return this.field_u[fieldTemp$0] - this.field_v.b(4) & 255;
        }
        return -16;
    }

    final int c(byte param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = MinerDisturbance.field_ab;
        if (param0 < -64) {
          var3 = this.field_y >> 3;
          var4 = -(7 & this.field_y) + 8;
          this.field_y = this.field_y + param1;
          var5 = 0;
          while (true) {
            if (param1 <= var4) {
              if (param1 == var4) {
                var5 = var5 + (pl.field_b[var4] & this.field_u[var3]);
              }
              if (param1 != var4 ||
                var6 != 0) {
                var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
              }
              return var5;
            }
            incrementValue$2 = var3;
            var3++;
            var5 = var5 + ((this.field_u[incrementValue$2] & pl.field_b[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
            if (var6 != 0) {
              var5 = var5 + (this.field_u[var3] >> -param1 + var4 & pl.field_b[param1]);
              return var5;
            }
          }
        }
        field_B = -20;
        var3Lifetime1 = this.field_y >> 3;
        var4Lifetime1 = -(7 & this.field_y) + 8;
        this.field_y = this.field_y + param1;
        var5Lifetime1 = 0;
        while (true) {
          if (param1 <= var4Lifetime1) {
            if (param1 == var4Lifetime1) {
              var5Lifetime1 = var5Lifetime1 + (pl.field_b[var4Lifetime1] & this.field_u[var3Lifetime1]);
            }
            if (param1 != var4Lifetime1 ||
              var6 != 0) {
              var5Lifetime1 = var5Lifetime1 + (this.field_u[var3Lifetime1] >> -param1 + var4Lifetime1 & pl.field_b[param1]);
            }
            return var5Lifetime1;
          }
          incrementValue$3 = var3Lifetime1;
          var3Lifetime1++;
          var5Lifetime1 = var5Lifetime1 + ((this.field_u[incrementValue$3] & pl.field_b[var4Lifetime1]) << -var4Lifetime1 + param1);
          param1 = param1 - var4Lifetime1;
          var4Lifetime1 = 8;
          if (var6 != 0) {
            var5Lifetime1 = var5Lifetime1 + (this.field_u[var3Lifetime1] >> -param1 + var4Lifetime1 & pl.field_b[param1]);
            return var5Lifetime1;
          }
        }
    }

    final void d(byte param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 < -42) {
          fieldTemp$0 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$0] = (byte)(param1 + this.field_v.b(4));
          return;
        }
        field_x = (ea) null;
        int fieldTemp$1 = this.field_o;
        this.field_o = this.field_o + 1;
        this.field_u[fieldTemp$1] = (byte)(param1 + this.field_v.b(4));
    }

    final void o(int param0) {
        this.field_o = (7 + this.field_y) / 8;
        int var2 = -128 % ((param0 + 39) / 54);
    }

    final void f(byte param0) {
        if (param0 == 16) {
          this.field_y = 8 * this.field_o;
          return;
        }
        field_w = -62;
        this.field_y = 8 * this.field_o;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          var5_int = 0;
          var6 = -2 / ((62 - param1) / 47);
          while (param2 > var5_int) {
            fieldTemp$0 = this.field_o;
            this.field_o = this.field_o + 1;
            param0[var5_int + param3] = (byte)(this.field_u[fieldTemp$0] - this.field_v.b(4));
            var5_int++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ld.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ld(int param0) {
        super(param0);
    }

    public static void d(boolean param0) {
        if (param0) {
          return;
        }
        field_A = null;
        field_x = null;
    }

    final void a(int param0, byte param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$6 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (param1 == 14) {
          param0 = param0 & pl.field_b[param2];
          while (true) {
            if (this.field_z >= param2) {
              if (param2 == this.field_z) {
                fieldTemp$0 = this.field_o;
                this.field_o = this.field_o + 1;
                this.field_u[fieldTemp$0] = (byte)(this.field_u[fieldTemp$0] + param0);
                this.field_u[this.field_o] = (byte) 0;
                this.field_z = 8;
                return;
              }
              this.field_z = this.field_z - param2;
              this.field_u[this.field_o] = (byte)(this.field_u[this.field_o] + (param0 << this.field_z));
              if (var5 == 0) {
                return;
              }
              fieldTemp$1 = this.field_o;
              this.field_o = this.field_o + 1;
              this.field_u[fieldTemp$1] = (byte)(this.field_u[fieldTemp$1] + param0);
              this.field_u[this.field_o] = (byte) 0;
              this.field_z = 8;
              return;
            }
            param2 = param2 - this.field_z;
            fieldTemp$2 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$2] = (byte)(this.field_u[fieldTemp$2] + (param0 >>> param2));
            this.field_u[this.field_o] = (byte) 0;
            this.field_z = 8;
            if (var5 != 0) {
              this.field_z = 8;
              return;
            }
          }
        }
        field_x = (ea) null;
        param0 = param0 & pl.field_b[param2];
        while (true) {
          if (this.field_z >= param2) {
            if (param2 == this.field_z) {
              fieldTemp$9 = this.field_o;
              this.field_o = this.field_o + 1;
              this.field_u[fieldTemp$9] = (byte)(this.field_u[fieldTemp$9] + param0);
              this.field_u[this.field_o] = (byte) 0;
              this.field_z = 8;
              return;
            }
            this.field_z = this.field_z - param2;
            this.field_u[this.field_o] = (byte)(this.field_u[this.field_o] + (param0 << this.field_z));
            if (var5 == 0) {
              return;
            }
            fieldTemp$8 = this.field_o;
            this.field_o = this.field_o + 1;
            this.field_u[fieldTemp$8] = (byte)(this.field_u[fieldTemp$8] + param0);
            this.field_u[this.field_o] = (byte) 0;
            this.field_z = 8;
            return;
          }
          param2 = param2 - this.field_z;
          fieldTemp$5 = this.field_o;
          this.field_o = this.field_o + 1;
          this.field_u[fieldTemp$5] = (byte)(this.field_u[fieldTemp$5] + (param0 >>> param2));
          this.field_u[this.field_o] = (byte) 0;
          this.field_z = 8;
          if (var5 != 0) {
            this.field_z = 8;
            return;
          }
        }
    }

    static {
        field_B = 0;
        field_w = 50;
        field_A = new String[]{"Mega Miner", "Magma Miner", "Pit Lord", "6M Crew Member", "Iron Pick", "Silver Helm", "Golden Rope", "Effluvium Canary", "Diamond Boots", "Slayer of the Myth", "Volcanic Delver", "Aqua Miner", "Demolition Miner", "Minted Miner", "Arctic Explorer", "Iceman", "Polar Prince", "King of the Snowmen", "Freezium Lamp", "Oil Sheik", "Frozen Blubber", "Save the Walrus", "Found the King", "Pick Up a Penguin", "Snow Way Out", "Taking the Mick", "Size 12 Carbon Footprint", "Seen It All", "On the Rocks", "Meteoric Rise", "Just For the Thrill", "Major Disturbance", "Tremors", "Play With Fire"};
    }
}
