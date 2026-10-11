/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    private int[][] field_e;
    private int[] field_i;
    static String[] field_c;
    int[] field_d;
    boolean field_b;
    int field_j;
    static int[] field_f;
    static np field_h;
    int[] field_a;
    static String field_k;
    static String field_l;
    int field_g;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 != -8) {
            field_c = (String[]) null;
          }
          while (lp.field_c.length > var1_int) {
            op.field_c[0][var1_int] = lp.field_c[var1_int];
            var1_int++;
          }
          var3 = 0;
          var1_intLifetime1 = var3;
          while (var3 < bn.field_a.length) {
            SpellAreaSelection.field_k[76][var3] = bn.field_a[var3];
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "qb.E(" + param0 + ')');
        }
    }

    private final void a(int param0, PacketBuffer param1, int param2) {
        int[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 == 1) {
            var4_int = param1.e((byte) -104);
            this.field_d = new int[var4_int];
            for (var5 = 0; var4_int > var5; var5++) {
              this.field_d[var5] = param1.e((byte) -104);
            }
            this.field_a = new int[var4_int];
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_a[var5] = param1.e((byte) -104);
            }
            for (var5 = 0; var5 < var4_int; var5++) {
              this.field_a[var5] = (param1.e((byte) -104) << 16) + this.field_a[var5];
            }
          } else {
            if (param2 == 2) {
              this.field_g = param1.e((byte) -104);
            } else {
              if (param2 == 3) {
                var4_int = param1.k(0);
                this.field_i = new int[1 + var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  this.field_i[var5] = param1.k(0);
                }
                this.field_i[var4_int] = 9999999;
              } else {
                if (param2 != 5) {
                  if (param2 == 6) {
                    param1.e((byte) -104);
                  } else {
                    if (param2 == 7) {
                      param1.e((byte) -104);
                    } else {
                      if (param2 == 8) {
                        this.field_j = param1.k(0);
                        this.field_b = false;
                      } else {
                        if (9 != param2) {
                          if (param2 == 10) {
                            param1.k(param0 ^ 0);
                          } else {
                            if (param2 != 11) {
                              if (param2 == 12) {
                                var4_int = param1.k(0);
                                for (var5 = 0; var5 < var4_int; var5++) {
                                  param1.e((byte) -104);
                                }
                                for (var5 = 0; var5 < var4_int; var5++) {
                                  param1.e((byte) -104);
                                }
                              } else {
                                if (param2 == 13) {
                                  var4_int = param1.e((byte) -104);
                                  this.field_e = new int[var4_int][];
                                  for (var5 = 0; var4_int > var5; var5++) {
                                    var6 = param1.k(param0 + 0);
                                    if (var6 > 0) {
                                      array$0 = new int[var6];
                                      this.field_e[var5] = array$0;
                                      this.field_e[var5][0] = param1.d((byte) -13);
                                      for (var7 = 1; var7 < var6; var7++) {
                                        this.field_e[var5][var7] = param1.e((byte) -104);
                                      }
                                    }
                                  }
                                } else {
                                  if (param2 != 14 &&
                                    param2 != 15 &&
                                    param2 != 16 &&
                                    param2 != 18) {
                                  }
                                }
                              }
                            } else {
                              param1.k(param0 ^ 0);
                            }
                          }
                        } else {
                          param1.k(0);
                        }
                      }
                    }
                  }
                } else {
                  param1.k(param0 + 0);
                }
              }
            }
          }
          if (param0 != 0) {
            this.field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_58_0 = var4;
          stackIn_58_1 = new StringBuilder().append("qb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param2).append(')').toString());
        }
    }

    private qb(kl param0, int param1, String param2) {
        this(param0, param1, param0.a((byte) 28, param1, param2));
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + tq.field_c) / 2;
        int var4 = -54 / ((33 - param1) / 47);
        int var3 = mj.field_c * mj.field_c;
        int var5 = -(param0 * param0) + var3;
        lk.field_a.a(-90 + (-120 + (SoftwareRaster.field_g - 4)), -20500, 199, 90, -(199 * var5 / var3) + var2);
        pd.field_c.a(SoftwareRaster.field_g - 124, -20500, 438, 0, 202 + var2 + 438 * var5 / var3);
    }

    private final void a(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          while (true) {
            var3_int = param1.k(0);
            if (var3_int != 0) {
              this.a(0, param1, var3_int);
              continue;
            }
            break;
          }
          if (param0 != 32737) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 >= -18) {
          return;
        }
        field_l = null;
        field_h = null;
        field_f = null;
        field_c = null;
    }

    qb(kl param0, String param1, String param2) {
        this(param0, param0.a(param1, 122), param2);
    }

    private qb(kl param0, int param1, int param2) {
        int var7 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var6Lifetime1;
        this.field_j = 0;
        this.field_g = -1;
        try {
          this.field_b = true;
          var11 = param0.a((byte) 113, param2, param1);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.a(32737, new PacketBuffer(var11));
          }
          var5 = 0;
          for (var6 = 0; this.field_a.length > var6; var6++) {
            if (var5 < this.field_a[var6]) {
              var5 = this.field_a[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; var7 < this.field_d.length; var7++) {
            if (this.field_d[var7] > var6Lifetime1) {
              var6Lifetime1 = this.field_d[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("qb.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_f = new int[]{4, 5, 6, 7, 8};
        field_c = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_l = "Bolts";
        field_k = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
