/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends kc {
    static int field_Lb;
    private kc field_Cb;
    static String field_Nb;
    private int field_Eb;
    static ll[] field_Jb;
    static String field_Bb;
    static boolean[] field_Fb;
    private kc field_Ob;
    static int field_Gb;
    static boolean field_Mb;
    static String[] field_Kb;
    static int[] field_Db;
    private StringBuilder field_Ib;
    static boolean[][] field_Hb;

    public static void f(byte param0) {
        field_Fb = null;
        field_Jb = null;
        field_Nb = null;
        field_Db = null;
        if (param0 != 77) {
          field_Db = (int[]) null;
        }
        field_Kb = null;
        field_Bb = null;
        field_Hb = (boolean[][]) null;
    }

    dh(int param0, int param1, int param2, int param3, String param4, kc param5, kc param6, kc param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Eb = 0;
        try {
          this.field_Cb = new kc(0L, param6, param4);
          this.a(this.field_Cb, 119);
          this.field_Ob = new kc(0L, param7);
          this.field_Ob.field_ob = 16764006;
          this.a(this.field_Ob, 107);
          this.field_Ob.field_L = "|";
          this.field_Ib = new StringBuilder(12);
          var9_int = this.field_Cb.c(-25921);
          this.field_Cb.a(var9_int, 5, 3, ga.field_r, (byte) -120);
          this.field_Ob.a(var9_int, 5, 3 + ga.field_r, ga.field_r, (byte) -120);
          var10 = 5 + (5 + var9_int);
          var11 = 3 + (3 + 2 * ga.field_r);
          var12 = ih.a(param0, var10, param2, 246);
          var13 = ql.a(10, param3, var11, param1);
          this.a(var10, var12, var13, var11, (byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("dh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        try {
          wl.field_L[param2] = param0;
          tl.field_f[param2] = new lc(param2);
          if (param1 != 9) {
            dh.f((byte) 121);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(eg param0, byte param1) {
        int var5 = 0;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3_int = 0;
        qb var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int[][] var9 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          go.field_j = new ll[72];
          ti.field_I = new ll[9];
          var2 = null;
          var3_int = 0;
          for (var4 = 0; var4 < 9; var4++) {
            if (var4 == 0) {
              var2 = pk.a("", 0, "scn0", param0);
            }
            if (var4 == 1) {
              var2 = pk.a("", 0, "scn1", param0);
            }
            if (var4 == 2) {
              var2 = pk.a("", 0, "scn2", param0);
            }
            if (3 == var4) {
              var2 = pk.a("", 0, "scn3", param0);
            }
            if (4 == var4) {
              var2 = pk.a("", 0, "scn4", param0);
            }
            if (var4 == 5) {
              var2 = pk.a("", 0, "scn5", param0);
            }
            if (var4 == 6) {
              var2 = pk.a("", 0, "scn6", param0);
            }
            if (var4 == 7) {
              var2 = pk.a("", 0, "scn7", param0);
            }
            if (var4 == 8) {
              var2 = pk.a("", 0, "scn8", param0);
            }
            ti.field_I[var4] = (ll) (((Object[]) (var2))[0]);
            for (var5 = 1; 9 > var5; var5++) {
              go.field_j[var3_int] = (ll) (((Object[]) (var2))[var5]);
              var3_int++;
            }
          }
          hk.field_p = new wj[9];
          var9 = new int[9][gg.field_c];
          var8 = var9;
          var2 = var8;
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 9; var3_intLifetime1++) {
            hk.field_p[var3_intLifetime1] = new wj(go.field_j[8 * var3_intLifetime1].field_l);
            var7 = 0;
            var4Lifetime1 = var7;
            while (var7 < go.field_j[var3_intLifetime1 * 8].field_l.length) {
              var9[var3_intLifetime1][var7] = go.field_j[8 * var3_intLifetime1].field_l[var7];
              var7++;
            }
          }
          for (var3_intLifetime2 = 0; var3_intLifetime2 < ti.field_I.length; var3_intLifetime2++) {
            ti.field_I[var3_intLifetime2].field_l = var9[var3_intLifetime2];
          }
          for (var3_intLifetime3 = 0; var3_intLifetime3 < go.field_j.length; var3_intLifetime3++) {
            go.field_j[var3_intLifetime3].field_l = (int[]) (((Object[]) (var2))[var3_intLifetime3 / 8]);
          }
          kh.field_d = ti.field_I[3];
          bg.field_e = fj.a("", -22612, param0, "slab");
          uj.field_i = new qb[7];
          uj.field_i[0] = fj.a("", param1 - 22546, param0, "spells_universal_tower_64x32");
          if (param1 != -66) {
            field_Kb = (String[]) null;
          }
          uj.field_i[1] = fj.a("", -22612, param0, "icecastle");
          uj.field_i[2] = fj.a("", -22612, param0, "fortress");
          uj.field_i[3] = fj.a("", -22612, param0, "den");
          uj.field_i[4] = fj.a("", -22612, param0, "light");
          var3 = fj.a("", param1 - 22546, param0, "nature");
          uj.field_i[5] = new qb(80, 95);
          uj.field_i[5].a();
          de.c(40, 16, 16, 1);
          var3.c(0, 16);
          uj.field_i[6] = fj.a("", hh.a((int) param1, 22546), param0, "clocktower");
          gj.field_f = pk.a("", 0, "16", param0);
          tg.field_b = pk.a("", 0, "32", param0);
          tk.field_x = qe.a(param0, "64", "", 122);
          md.field_f = qe.a(param0, "128", "", 46);
          vg.field_M = af.a("volcano", "", 19412, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("dh.A(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(boolean param0, boolean param1) {
        StringBuilder discarded$0 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.b(param1, (byte) 92);
        if (param1) {
          while (ib.b(param0)) {
            if (vn.field_d == 85 &&
              this.field_Ib.length() > 0) {
              qj.a(-1 + this.field_Ib.length(), this.field_Ib, ' ', false);
            }
            if (bj.a(ed.field_Bb, (CharSequence) ((Object) this.field_Ib), (byte) -71) ||
              (this.field_Ib.length() == 0 &&
              91 == ed.field_Bb ||
              this.field_Ib.length() == 1 &&
              ed.field_Bb == 35) ||
              ed.field_Bb == 93) {
              discarded$0 = this.field_Ib.append(ed.field_Bb);
            }
            if (vn.field_d != 84) {
              if (vn.field_d == 13) {
                return 1;
              }
              continue;
            }
            if (this.field_Ib.length() <= 0) {
              return 1;
            }
            this.field_rb = this.field_Ib.toString();
            return 2;
          }
        }
        this.field_Ob.field_rb = this.field_Ib.toString();
        if (param0) {
          dh.a(120, -69, 53, 92, -36, 113, 49, (int[]) null, 83, -103, -7, -17, -113, 48, -117, -23, 64);
        }
        if (param1) {
          stackIn_26_0 = ~re.field_r;
          stackIn_26_1 = -1;
          if (stackIn_26_0 != stackIn_26_1 &&
            0 == this.field_U) {
            this.field_Eb = 1;
          }
        }
        return this.field_Eb;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 >= 0 &&
            id.field_b > param6) {
            if (param16 < 0 &&
              param4 < 0 &&
              param10 < 0) {
              return;
            }
            if (id.field_d <= param16 &&
              param4 >= id.field_d &&
              id.field_d <= param10) {
              return;
            }
            var34 = -param6 + param3;
            if (param8 == param6) {
              if (param6 != param3) {
                var35 = param3 - param8;
                if (param4 <= param16) {
                  var27 = (-param13 + param5 << 16) / var35;
                  var30 = param15 << 16;
                  var25 = param13 << 16;
                  var23 = (-param1 + param0 << 16) / var35;
                  var22 = param11 << 16;
                  var20 = (-param16 + param10 << 16) / var34;
                  var29 = param12 << 16;
                  var32 = (param14 - param15 << 16) / var34;
                  var21 = param1 << 16;
                  var18 = param16 << 16;
                  var24 = (-param11 + param0 << 16) / var34;
                  var19 = (param10 - param4 << 16) / var35;
                  var28 = (param5 - param9 << 16) / var34;
                  var17_int = param4 << 16;
                  var31 = (param14 - param12 << 16) / var35;
                  var26 = param9 << 16;
                } else {
                  var29 = param15 << 16;
                  var25 = param9 << 16;
                  var22 = param1 << 16;
                  var24 = (-param1 + param0 << 16) / var35;
                  var30 = param12 << 16;
                  var18 = param4 << 16;
                  var26 = param13 << 16;
                  var21 = param11 << 16;
                  var20 = (-param4 + param10 << 16) / var35;
                  var19 = (param10 - param16 << 16) / var34;
                  var23 = (param0 - param11 << 16) / var34;
                  var27 = (param5 - param9 << 16) / var34;
                  var32 = (-param12 + param14 << 16) / var35;
                  var28 = (param5 - param13 << 16) / var35;
                  var31 = (param14 - param15 << 16) / var34;
                  var17_int = param16 << 16;
                }
              } else {
                var25 = param9;
                var18 = param4 << 16;
                var24 = 0;
                var20 = 0;
                var17_int = param16 << 16;
                var32 = 0;
                var26 = param13;
                var21 = param11;
                var19 = 0;
                var23 = 0;
                var22 = param1;
                var31 = 0;
                var28 = 0;
                var27 = 0;
                var29 = param15;
                var30 = param12;
              }
              var33 = 0;
              if (param6 < 0) {
                param6 = Math.min(-param6, param8 - param6);
                var29 = var29 + param6 * var31;
                var17_int = var17_int + param6 * var19;
                var25 = var25 + var27 * param6;
                var22 = var22 + var24 * param6;
                var18 = var18 + var20 * param6;
                var26 = var26 + var28 * param6;
                var30 = var30 + var32 * param6;
                var21 = var21 + var23 * param6;
                param6 = 0;
              }
            } else {
              var26 = param9 << 16;
              var25 = param9 << 16;
              var30 = param15 << 16;
              var29 = param15 << 16;
              var22 = param11 << 16;
              var21 = param11 << 16;
              var18 = param16 << 16;
              var17_int = param16 << 16;
              var35 = -param6 + param8;
              var19 = (-param16 + param4 << 16) / var35;
              var20 = (-param16 + param10 << 16) / var34;
              if (var19 >= var20) {
                var28 = (-param9 + param13 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var27 = (param5 - param9 << 16) / var34;
                var23 = (param0 - param11 << 16) / var34;
                var24 = (-param11 + param1 << 16) / var35;
                var31 = (param14 - param15 << 16) / var34;
                var32 = (param12 - param15 << 16) / var35;
              } else {
                var33 = 0;
                var23 = (-param11 + param1 << 16) / var35;
                var27 = (param13 - param9 << 16) / var35;
                var28 = (param5 - param9 << 16) / var34;
                var32 = (param14 - param15 << 16) / var34;
                var24 = (-param11 + param0 << 16) / var34;
                var31 = (-param15 + param12 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param6 < 0) {
                if (param8 < 0) {
                  param6 = -param6 + param8;
                  var18 = var18 + var20 * param6;
                  var22 = var22 + var24 * param6;
                  var21 = var21 + param6 * var23;
                  var29 = var29 + var31 * param6;
                  var30 = var30 + var32 * param6;
                  var26 = var26 + param6 * var28;
                  var17_int = var17_int + var19 * param6;
                  var25 = var25 + param6 * var27;
                  param6 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param6 = -param6;
                  var18 = var18 + var20 * param6;
                  var25 = var25 + var27 * param6;
                  var21 = var21 + param6 * var23;
                  var29 = var29 + param6 * var31;
                  var17_int = var17_int + param6 * var19;
                  var30 = var30 + param6 * var32;
                  var26 = var26 + param6 * var28;
                  var22 = var22 + var24 * param6;
                  param6 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = id.field_f[param6];
                while (param6 < param8) {
                  var37 = var17_int >> 16;
                  if (var37 < id.field_d) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        id.field_d > var37) {
                        gl.a(var29, var36Lifetime2 + var37, var38, 0, param7, var25, var21, 0, 0, (byte) 124);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var38 + var37 >= id.field_d) {
                        var38 = id.field_d + (-var37 - 1);
                      }
                      if (var37 < 0) {
                        gl.a(var29 - var41 * var37, var36Lifetime2, var38 + var37, var40, param7, var25 - var37 * var40, -(var39 * var37) + var21, var39, var41, (byte) 124);
                      } else {
                        gl.a(var29, var37 + var36Lifetime2, var38, var40, param7, var25, var21, var39, var41, (byte) 120);
                      }
                    }
                  }
                  param6++;
                  if (id.field_b <= param6) {
                    return;
                  }
                  var29 = var29 + var31;
                  var22 = var22 + var24;
                  var30 = var30 + var32;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var18 = var18 + var20;
                  var36Lifetime2 = var36Lifetime2 + de.field_e;
                  var26 = var26 + var28;
                  var17_int = var17_int + var19;
                }
              }
              var36Lifetime3 = param3 - param8;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param10 << 16;
                var38Lifetime2 = param0 << 16;
                var39Lifetime2 = param5 << 16;
                var40Lifetime2 = param14 << 16;
                if (var33 == 0) {
                  var29 = param12 << 16;
                  var17_int = param4 << 16;
                  var21 = param1 << 16;
                  var25 = param13 << 16;
                } else {
                  var26 = param13 << 16;
                  var18 = param4 << 16;
                  var30 = param12 << 16;
                  var22 = param1 << 16;
                }
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
              } else {
                var27 = 0;
                var23 = 0;
                var24 = 0;
                var32 = 0;
                var20 = 0;
                var19 = 0;
                var28 = 0;
                var31 = 0;
              }
            }
            if (param2 < 80) {
              return;
            }
            if (param6 < 0) {
              param6 = -param6;
              var17_int = var17_int + var19 * param6;
              var29 = var29 + param6 * var31;
              var26 = var26 + var28 * param6;
              var18 = var18 + param6 * var20;
              var22 = var22 + param6 * var24;
              var30 = var30 + param6 * var32;
              var21 = var21 + var23 * param6;
              var25 = var25 + var27 * param6;
              param6 = 0;
            }
            var35Lifetime1 = id.field_f[param6];
            while (param3 > param6) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < id.field_d) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < id.field_d) {
                    gl.a(var29, var36Lifetime1 + var35Lifetime1, var37Lifetime1, 0, param7, var25, var21, 0, 0, (byte) 122);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (id.field_d <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + id.field_d - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    gl.a(-(var36Lifetime1 * var40Lifetime1) + var29, var35Lifetime1, var37Lifetime1 + var36Lifetime1, var39Lifetime1, param7, var25 - var39Lifetime1 * var36Lifetime1, -(var36Lifetime1 * var38Lifetime1) + var21, var38Lifetime1, var40Lifetime1, (byte) 123);
                  } else {
                    gl.a(var29, var36Lifetime1 + var35Lifetime1, var37Lifetime1, var39Lifetime1, param7, var25, var21, var38Lifetime1, var40Lifetime1, (byte) 118);
                  }
                }
              }
              param6++;
              if (param6 >= id.field_b) {
                return;
              }
              var26 = var26 + var28;
              var30 = var30 + var32;
              var22 = var22 + var24;
              var35Lifetime1 = var35Lifetime1 + de.field_e;
              var29 = var29 + var31;
              var18 = var18 + var20;
              var17_int = var17_int + var19;
              var21 = var21 + var23;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_77_0 = var17;
          stackIn_77_1 = new StringBuilder().append("dh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final boolean e(int param0) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var2;
        int[] var3;
        if (this.field_Eb != 0) {
          return false;
        }
        if (vn.field_d == 85 &&
          0 < this.field_Ib.length()) {
          qj.a(this.field_Ib.length() - 1, this.field_Ib, ' ', false);
        }
        if (this.field_Ib.length() < 12) {
          var2 = Character.toLowerCase(ed.field_Bb);
          if (var2 == 32) {
            var2 = 95;
          }
          if (95 == var2 &&
            this.field_Ib.length() > 0) {
            discarded$2 = this.field_Ib.append((char) var2);
          }
          if (uh.a((char) var2, (byte) -127) ||
            e.a(30, (char) var2)) {
            discarded$3 = this.field_Ib.append((char) var2);
          }
        }
        if (param0 <= 61) {
          var3 = (int[]) null;
          dh.a((int[]) null, 117, 95);
        }
        if (vn.field_d == 84) {
          if (this.field_Ib.length() <= 0) {
            this.field_Eb = 1;
          } else {
            this.field_rb = this.field_Ib.toString();
            this.field_Eb = 2;
          }
        }
        if (13 != vn.field_d) {
          return true;
        }
        this.field_Eb = 1;
        return true;
    }

    final static int a(int param0, boolean param1, int param2) {
        if (!param1) {
          int[] var4 = (int[]) null;
          dh.a((int[]) null, 52, -9);
        }
        int var3 = -1 + param2 & param0 >> 31;
        return var3 + (param0 + (param0 >>> 31)) % param2;
    }

    static {
        field_Nb = "Accept";
        field_Bb = "Create your own free Jagex account";
        field_Db = new int[8192];
        field_Kb = new String[]{"Control Powerful Familiars", "Cause Volcanic Destruction", "Summon Hordes of Minions", "Devastate the World", "Control the Battlefield", "Become an Arcane Master!"};
    }
}
