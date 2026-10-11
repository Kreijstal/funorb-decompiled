/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    static je field_m;
    private ModelMesh field_a;
    private int field_f;
    static RgbSprite field_b;
    private int field_j;
    int[] field_e;
    static RgbSprite[] field_d;
    private int field_c;
    static String field_h;
    static int field_i;
    private vj field_g;
    private boolean field_k;
    private boolean field_l;

    final void a(byte param0, boolean param1) {
        int var4 = 0;
        int var3 = this.field_e[0];
        int var4Lifetime1;
        if (param0 == -72) {
          var4 = this.field_e[1];
          this.a(false, param1, var3, var4);
          return;
        }
        this.a((byte) 11, true);
        var4Lifetime1 = this.field_e[1];
        this.a(false, param1, var3, var4Lifetime1);
    }

    public static void b(int param0) {
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 != -298276720) {
          hr.b((byte) -86);
          field_m = null;
          return;
        }
        field_m = null;
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_g = new vj(1);
        if (param0) {
          this.a((byte) 125, param2);
          this.field_f = -1;
          this.a(-23162, 0);
          tm.a();
          this.field_e = new int[2];
          this.field_j = param1;
          return;
        }
        field_h = (String) null;
        this.a((byte) 125, param2);
        this.field_f = -1;
        this.a(-23162, 0);
        tm.a();
        this.field_e = new int[2];
        this.field_j = param1;
    }

    final void a(byte param0, int param1) {
        this.field_c = param1;
        if (this.field_c < 0) {
          this.field_c = 0;
          if (param0 >= 42) {
            this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
            this.field_k = nh.field_D[this.field_c];
            return;
          }
          this.a(54, 25, (byte) -41);
          this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
          this.field_k = nh.field_D[this.field_c];
          return;
        }
        if (ActionRequest.field_k.length <= this.field_c) {
          this.field_c = 0;
          if (param0 >= 42) {
            this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
            this.field_k = nh.field_D[this.field_c];
            return;
          }
          this.a(54, 25, (byte) -41);
          this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
          this.field_k = nh.field_D[this.field_c];
          return;
        }
        if (ActionRequest.field_k[this.field_c] == null) {
          this.field_c = 0;
          if (param0 >= 42) {
            this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
            this.field_k = nh.field_D[this.field_c];
            return;
          }
          this.a(54, 25, (byte) -41);
          this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
          this.field_k = nh.field_D[this.field_c];
          return;
        }
        if (param0 >= 42) {
          this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
          this.field_k = nh.field_D[this.field_c];
          return;
        }
        this.a(54, 25, (byte) -41);
        this.field_a = (ModelMesh) (ActionRequest.field_k[this.field_c][0]);
        this.field_k = nh.field_D[this.field_c];
    }

    final void a(int param0, byte param1) {
        if (param1 == -50) {
          this.a(-23162, param0);
          if (this.field_g != null) {
            this.field_g.a(-115);
          }
          this.a(-298276720);
          return;
        }
        field_d = (RgbSprite[]) null;
        this.a(-23162, param0);
        if (this.field_g != null) {
          this.field_g.a(-115);
        }
        this.a(-298276720);
    }

    final static String b(byte param0) {
        if (param0 < 46) {
          hr.a(-107L, 79);
          return mg.field_e.g(1);
        }
        return mg.field_e.g(1);
    }

    final void a(boolean param0, int param1) {
        if (param1 > -1) {
          if (2048 <= param1) {
            if (param0) {
              field_d = (RgbSprite[]) null;
              return;
            }
            return;
          }
          this.field_j = param1;
        }
        if (!param0) {
          return;
        }
        field_d = (RgbSprite[]) null;
    }

    private final void b(int param0, int param1, byte param2) {
        if (param0 == -1) {
          ro.field_ob.field_b = param1;
          ro.field_ob.b((byte) 36);
          ro.field_ob.c(param2 ^ -9470376);
          param0 = ro.field_ob.field_e[1];
          param1 = ro.field_ob.field_e[0];
          param0 += 16;
        }
        param1 += 32;
        if (param2 == -39) {
          this.field_e[1] = 7 + param0;
          this.field_e[0] = 7 + param1;
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var7;
        this.a(-23162, param4);
        if (!this.field_l) {
          return true;
        }
        var7 = this.field_g.a(-95) ? 1 : 0;
        this.a(-298276720);
        if (param5) {
          this.a(85, true, -47, -102, 19, false);
        }
        this.b(param0, param2, (byte) -39);
        if (param3 != -1) {
          this.field_j = param3;
        }
        if (this.field_g.field_c) {
        }
        return var7 != 0;
    }

    private final void a(byte param0) {
        this.field_l = true;
        qb var2 = pg.a(this.field_f, 176, false, this.field_c);
        if (var2 == null) {
          this.field_l = false;
          return;
        }
        if (var2 == null) {
          this.field_l = false;
          return;
        }
        this.field_g.a(-1, var2);
        this.a(-298276720);
        if (param0 == 72) {
          return;
        }
    }

    final static of a(long param0, int param1) {
        if (param1 >= -68) {
          return (of) null;
        }
        return (of) (eu.field_e.a((byte) -27, param0));
    }

    final void a(int param0, int param1) {
        int var3;
        var3 = 0;
        if (this.field_f != param1) {
          if (param1 == -1) {
            if (this.field_f == -1) {
              var3 = 1;
              this.field_f = 0;
              if (var3 == 0) {
                if (param0 != -23162) {
                  this.field_l = true;
                }
                return;
              }
              this.a((byte) 72);
              if (param0 == -23162) {
                return;
              }
              this.field_l = true;
              return;
            }
            if (0 > this.field_f) {
              var3 = 1;
              this.field_f = 0;
              if (var3 != 0) {
                this.a((byte) 72);
              }
            } else {
              if (9 <= this.field_f) {
                var3 = 1;
                this.field_f = 0;
                if (var3 != 0) {
                  this.a((byte) 72);
                }
              } else {
                if (var3 == 0) {
                  if (param0 == -23162) {
                    return;
                  }
                  this.field_l = true;
                  return;
                }
                this.a((byte) 72);
              }
            }
            if (param0 != -23162) {
              this.field_l = true;
            }
            return;
          }
          if (param1 < 0) {
            if (this.field_f == -1) {
              var3 = 1;
              this.field_f = 0;
              if (var3 != 0) {
                this.a((byte) 72);
              }
            } else {
              if (0 > this.field_f) {
                var3 = 1;
                this.field_f = 0;
                if (var3 != 0) {
                  this.a((byte) 72);
                }
              } else {
                if (9 <= this.field_f) {
                  var3 = 1;
                  this.field_f = 0;
                  if (var3 != 0) {
                    this.a((byte) 72);
                  }
                } else {
                  if (var3 == 0) {
                    if (param0 == -23162) {
                      return;
                    }
                    this.field_l = true;
                    return;
                  }
                  this.a((byte) 72);
                }
              }
            }
            if (param0 != -23162) {
              this.field_l = true;
            }
            return;
          }
          if (param1 >= 9) {
            if (this.field_f != -1 &&
              0 <= this.field_f &&
              9 > this.field_f) {
              if (var3 != 0) {
                this.a((byte) 72);
              }
              if (param0 == -23162) {
                return;
              }
              this.field_l = true;
              return;
            }
            var3 = 1;
            this.field_f = 0;
            if (var3 == 0) {
              if (param0 == -23162) {
                return;
              }
              this.field_l = true;
              return;
            }
            this.a((byte) 72);
            if (param0 != -23162) {
              this.field_l = true;
            }
            return;
          }
          this.field_f = param1;
          var3 = 1;
        }
        if (this.field_f == -1) {
          var3 = 1;
          this.field_f = 0;
        } else {
          if (0 > this.field_f) {
            var3 = 1;
            this.field_f = 0;
          } else {
            if (9 <= this.field_f) {
              var3 = 1;
              this.field_f = 0;
            }
          }
        }
        if (var3 != 0) {
          this.a((byte) 72);
        }
        if (param0 == -23162) {
          return;
        }
        this.field_l = true;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        ModelMesh var18_ref = null;
        ModelMesh var20 = null;
        Object var17 = null;
        Object var18 = null;
        int var5 = param0 ? 1 : 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 2047 & -this.field_j + 2048;
        int var9 = 1024;
        int var10 = 2048;
        int var11 = 12;
        int var12 = var10 - var10 / var11;
        int var13 = 0;
        int var14 = this.field_k & (!param1 ? true : false) ? 900 : 800;
        int var15 = -1400;
        if (!this.field_l) {
          tm.a();
          tm.c(param2, param3);
          var18_ref = (ModelMesh) (this.field_a.a(var5 != 0, false, var6 != 0));
          var20 = var18_ref;
          var18_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
          if (param1) {
            np.a(false, var20);
          }
          var20.a(var7, var8, var9, var12, var13, var14, var15);
          return;
        }
        tm.a();
        tm.c(param2, param3);
        ModelMesh var17_ref = (ModelMesh) (this.field_g.a(var5 != 0, true, var6 != 0, this.field_a));
        ModelMesh var19 = var17_ref;
        var17_ref.b(hk.field_Jb[this.field_c], hk.field_Jb[this.field_c], hk.field_Jb[this.field_c]);
        if (param1) {
          np.a(param0, var19);
        } else {
          var19.a(var7, var8, var9, var12, var13, var14, var15);
          return;
        }
        var19.a(var7, var8, var9, var12, var13, var14, var15);
    }

    hr(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(true, param2, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("hr.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    hr(int param0) {
        this.a(true, 1792, param0);
    }

    private final void a(int param0) {
        int var2 = this.field_g.field_i >> 16;
        wp var3 = we.a(var2, true);
        if (param0 == -298276720) {
          io.a(var3, (byte) -34);
          return;
        }
        this.field_a = (ModelMesh) null;
        io.a(var3, (byte) -34);
    }

    final void a(int param0, int param1, byte param2) {
        this.field_e[0] = param0;
        int var4 = -95 % ((param2 - 34) / 34);
        this.field_e[1] = param1;
    }

    static {
        field_h = "Become a member to get this expansion and...";
        field_i = 0;
    }
}
