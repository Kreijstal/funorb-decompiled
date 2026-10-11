/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iua {
    boolean field_j;
    private int[] field_w;
    int field_h;
    private int field_c;
    private boolean field_s;
    int field_e;
    int[] field_p;
    boolean field_m;
    private int field_i;
    private int field_l;
    int field_v;
    private tw field_o;
    private float[] field_u;
    private int field_r;
    boolean field_g;
    private int field_t;
    int field_n;
    boolean field_q;
    private sfa field_k;
    int field_b;
    private int field_f;
    private int[] field_a;
    private boolean field_d;

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11) {
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        if (this.field_s) {
          this.field_k.b((int)param0, bt.field_h[(int)param9], (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, bt.field_h[(int)param9], (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, bt.field_h[(int)param9], (int)param5, (int)param0, 1, (int)param3);
          return;
        }
        float var13 = param4 - param3;
        float var14 = param1 - param0;
        float var15 = param5 - param3;
        float var16 = param2 - param0;
        float var17 = param10 - param9;
        float var18 = param11 - param9;
        float var19 = param7 - param6;
        float var20 = param8 - param6;
        if (param2 != param1) {
          var21 = (param5 - param4) / (param2 - param1);
        } else {
          var21 = 0.0f;
        }
        if (param1 != param0) {
          var22 = var13 / var14;
        } else {
          var22 = 0.0f;
        }
        if (param2 != param0) {
          var23 = var15 / var16;
        } else {
          var23 = 0.0f;
        }
        float var24 = var13 * var16 - var15 * var14;
        if (var24 == 0.0f) {
          return;
        }
        float var25 = (var17 * var16 - var18 * var14) / var24;
        float var26 = (var18 * var13 - var17 * var15) / var24;
        float var27 = (var19 * var16 - var20 * var14) / var24;
        float var28 = (var20 * var13 - var19 * var15) / var24;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          param9 = param9 - var25 * param3 + var25;
          param6 = param6 - var27 * param3 + var27;
          if (param1 < param2) {
            param5 = param3;
            if (param0 < 0.0f) {
              param5 = param5 - var23 * param0;
              param3 = param3 - var22 * param0;
              param9 = param9 - var26 * param0;
              param6 = param6 - var28 * param0;
              param0 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var21 * param1;
              param1 = 0.0f;
            }
            if (param0 != param1 &&
              var23 < var22) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                param5 = param5 + var23;
                param3 = param3 + var22;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
                param5 = param5 + var23;
                param4 = param4 + var21;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param3 = param3 + var22;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param4 = param4 + var21;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (!(var23 > var21)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param3 = param3 + var22;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param4 = param4 + var21;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
              param5 = param5 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
              param5 = param5 + var23;
              param4 = param4 + var21;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param4 = param3;
          if (param0 < 0.0f) {
            param4 = param4 - var23 * param0;
            param3 = param3 - var22 * param0;
            param9 = param9 - var26 * param0;
            param6 = param6 - var28 * param0;
            param0 = 0.0f;
          }
          if (param2 < 0.0f) {
            param5 = param5 - var21 * param2;
            param2 = 0.0f;
          }
          if (param0 != param2 &&
            var23 < var22) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
              param4 = param4 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
              param5 = param5 + var21;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
              param4 = param4 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
              param5 = param5 + var21;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (!(var21 > var22)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
              param4 = param4 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
              param5 = param5 + var21;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
            param4 = param4 + var23;
            param3 = param3 + var22;
            param9 = param9 + var26;
            param6 = param6 + var28;
            param0 = param0 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
            param5 = param5 + var21;
            param3 = param3 + var22;
            param9 = param9 + var26;
            param6 = param6 + var28;
            param0 = param0 + (float)this.field_t;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_v) {
            return;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          param10 = param10 - var25 * param4 + var25;
          param7 = param7 - var27 * param4 + var27;
          if (param2 < param0) {
            param3 = param4;
            if (param1 < 0.0f) {
              param3 = param3 - var22 * param1;
              param4 = param4 - var21 * param1;
              param10 = param10 - var26 * param1;
              param7 = param7 - var28 * param1;
              param1 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var23 * param2;
              param2 = 0.0f;
            }
            if (param1 != param2 &&
              var22 < var21) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                param3 = param3 + var22;
                param4 = param4 + var21;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
                param3 = param3 + var22;
                param5 = param5 + var23;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param4 = param4 + var21;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param5 = param5 + var23;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (!(var22 > var23)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param4 = param4 + var21;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param5 = param5 + var23;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
              param3 = param3 + var22;
              param4 = param4 + var21;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
              param3 = param3 + var22;
              param5 = param5 + var23;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param5 = param4;
          if (param1 < 0.0f) {
            param5 = param5 - var22 * param1;
            param4 = param4 - var21 * param1;
            param10 = param10 - var26 * param1;
            param7 = param7 - var28 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var23 * param0;
            param0 = 0.0f;
          }
          if (!(var22 < var21)) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param10, var25, param7, var27);
              param5 = param5 + var22;
              param4 = param4 + var21;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
              param3 = param3 + var23;
              param4 = param4 + var21;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param10, var25, param7, var27);
            param5 = param5 + var22;
            param4 = param4 + var21;
            param10 = param10 + var26;
            param7 = param7 + var28;
            param1 = param1 + (float)this.field_t;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
            param3 = param3 + var23;
            param4 = param4 + var21;
            param10 = param10 + var26;
            param7 = param7 + var28;
            param1 = param1 + (float)this.field_t;
          }
          return;
        }
        if (param2 >= (float)this.field_v) {
          return;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (param1 > (float)this.field_v) {
          param1 = (float)this.field_v;
        }
        param11 = param11 - var25 * param5 + var25;
        param8 = param8 - var27 * param5 + var27;
        if (param0 < param1) {
          param4 = param5;
          if (param2 < 0.0f) {
            param4 = param4 - var21 * param2;
            param5 = param5 - var23 * param2;
            param11 = param11 - var26 * param2;
            param8 = param8 - var28 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var22 * param0;
            param0 = 0.0f;
          }
          if (!(var21 < var23)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
              param4 = param4 + var21;
              param5 = param5 + var23;
              param11 = param11 + var26;
              param8 = param8 + var28;
              param2 = param2 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param11, var25, param8, var27);
              param4 = param4 + var21;
              param3 = param3 + var22;
              param11 = param11 + var26;
              param8 = param8 + var28;
              param2 = param2 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
            param4 = param4 + var21;
            param5 = param5 + var23;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param11, var25, param8, var27);
            param4 = param4 + var21;
            param3 = param3 + var22;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param3 = param5;
        if (param2 < 0.0f) {
          param3 = param3 - var21 * param2;
          param5 = param5 - var23 * param2;
          param11 = param11 - var26 * param2;
          param8 = param8 - var28 * param2;
          param2 = 0.0f;
        }
        if (param1 < 0.0f) {
          param4 = param4 - var22 * param1;
          param1 = 0.0f;
        }
        if (!(var21 < var23)) {
          param0 = param0 - param1;
          param1 = param1 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param11, var25, param8, var27);
            param3 = param3 + var21;
            param5 = param5 + var23;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
            param4 = param4 + var22;
            param5 = param5 + var23;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_p[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param11, var25, param8, var27);
          param3 = param3 + var21;
          param5 = param5 + var23;
          param11 = param11 + var26;
          param8 = param8 + var28;
          param2 = param2 + (float)this.field_t;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
          param4 = param4 + var22;
          param5 = param5 + var23;
          param11 = param11 + var26;
          param8 = param8 + var28;
          param2 = param2 + (float)this.field_t;
        }
    }

    private final void a(int[] param0, int[] param1, int param2, int param3, int param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, float param15, float param16, float param17, float param18, float param19, float param20) {
        int incrementValue$0 = 0;
        int stackIn_28_0 = 0;
        int var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var22Lifetime1;
        int var36Lifetime1;
        var22 = param4 - param3;
        var23 = 1.0f / (float)var22;
        var24 = (param6 - param5) * var23;
        var25 = (param8 - param7) * var23;
        var26 = (param10 - param9) * var23;
        var27 = (param12 - param11) * var23;
        var28 = (param14 - param13) * var23;
        var29 = (param16 - param15) * var23;
        var30 = (param18 - param17) * var23;
        var31 = (param20 - param19) * var23;
        if (this.field_q) {
          if (param4 > this.field_h) {
            param4 = this.field_h;
          }
          if (param3 < 0) {
            param5 = param5 - var24 * (float)param3;
            param7 = param7 - var25 * (float)param3;
            param9 = param9 - var26 * (float)param3;
            param11 = param11 - var27 * (float)param3;
            param13 = param13 - var28 * (float)param3;
            param15 = param15 - var29 * (float)param3;
            param17 = param17 - var30 * (float)param3;
            param19 = param19 - var31 * (float)param3;
            param3 = 0;
          }
        }
        if (param3 >= param4) {
          return;
        }
        var22Lifetime1 = param4 - param3;
        param2 = param2 + param3;
        while (true) {
          incrementValue$0 = var22Lifetime1;
          var22Lifetime1--;
          if (incrementValue$0 <= 0) {
            return;
          }
          var32 = 1.0f / param5;
          if (var32 < this.field_u[param2]) {
            var33 = (int)(param7 * var32 * (float)this.field_i);
            if (!this.field_d) {
              if (var33 >= 0) {
                if (var33 > this.field_r) {
                  var33 = this.field_r;
                }
              } else {
                var33 = 0;
              }
            } else {
              var33 = var33 & this.field_r;
            }
            var34 = (int)(param9 * var32 * (float)this.field_i);
            if (!this.field_d) {
              if (var34 >= 0) {
                if (var34 > this.field_r) {
                  var34 = this.field_r;
                }
              } else {
                var34 = 0;
              }
            } else {
              var34 = var34 & this.field_r;
            }
            var35 = this.field_w[var34 * this.field_i + var33];
            var36 = 255;
            if (this.field_f != 2) {
              if (this.field_f != 1) {
                var36Lifetime1 = (int)param13;
              } else {
                stackIn_28_0 = (var35 != 0) ? 255 : 0;
                var36Lifetime1 = stackIn_28_0;
              }
            } else {
              var36Lifetime1 = var35 >> 24 & 255;
            }
            if (var36Lifetime1 != 0) {
              if (var36Lifetime1 == 255) {
                var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                if (param11 != 0.0f) {
                  var38 = (int)(255.0f - param11);
                  var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                  var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                }
                param0[param2] = var37;
                this.field_u[param2] = var32;
              } else {
                var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                if (param11 != 0.0f) {
                  var38 = (int)(255.0f - param11);
                  var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                  var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                }
                var38 = param0[param2];
                var39 = 255 - var36Lifetime1;
                var37 = ((var38 & 16711935) * var39 + (var37 & 16711935) * var36Lifetime1 & -16711936) + ((var38 & 65280) * var39 + (var37 & 65280) * var36Lifetime1 & 16711680) >> 8;
                param0[param2] = var37;
                this.field_u[param2] = var32;
              }
            }
          }
          param2++;
          param5 = param5 + var24;
          param7 = param7 + var25;
          param9 = param9 + var26;
          param11 = param11 + var27;
          param13 = param13 + var28;
          param15 = param15 + var29;
          param17 = param17 + var30;
          param19 = param19 + var31;
        }
    }

    private final void b(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var12Lifetime1Lifetime3;
        int var12Lifetime1Lifetime4;
        if (this.field_q) {
          if (param6 > this.field_h) {
            param6 = this.field_h;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        param2 = param2 + (param5 - 1);
        param4 = param6 - param5 >> 2;
        param7 = param7 + param8 * (float)param5;
        if (!this.field_o.field_n) {
          if (this.field_b == 0) {
            while (true) {
              param4--;
              if (param4 < 0) {
                param4 = param6 - param5 & 3;
                while (true) {
                  param4--;
                  if (param4 < 0) {
                    return;
                  }
                  param2++;
                  if (param7 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param7 = param7 + param8;
                }
              }
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
            }
          }
          if (this.field_b == 254) {
            if (param5 == 0) {
              return;
            }
            if (param6 > this.field_h - 1) {
              return;
            }
            param4--;
            while (param4 >= 0) {
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param4--;
            }
            param4 = param6 - param5 & 3;
            while (true) {
              param4--;
              if (param4 < 0) {
                return;
              }
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
            }
          }
          var10 = this.field_b;
          var11 = 256 - this.field_b;
          param3 = ((param3 & 16711935) * var11 >> 8 & 16711935) + ((param3 & 65280) * var11 >> 8 & 65280);
          while (true) {
            param4--;
            if (param4 < 0) {
              param4 = param6 - param5 & 3;
              while (true) {
                param4--;
                if (param4 < 0) {
                  return;
                }
                param2++;
                if (param7 < param1[param2]) {
                  var12 = param0[param2];
                  param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                }
                param7 = param7 + param8;
              }
            }
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime2 = param0[param2];
              param0[param2] = (var11 | var12Lifetime2 >> 24) << 24 | param3 + ((var12Lifetime2 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime2 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime3 = param0[param2];
              param0[param2] = (var11 | var12Lifetime3 >> 24) << 24 | param3 + ((var12Lifetime3 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime3 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime4 = param0[param2];
              param0[param2] = (var11 | var12Lifetime4 >> 24) << 24 | param3 + ((var12Lifetime4 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime4 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime5 = param0[param2];
              param0[param2] = (var11 | var12Lifetime5 >> 24) << 24 | param3 + ((var12Lifetime5 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime5 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
          }
        }
        if (this.field_b == 0) {
          while (true) {
            param4--;
            if (param4 < 0) {
              param4 = param6 - param5 & 3;
              while (true) {
                param4--;
                if (param4 < 0) {
                  return;
                }
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
              }
            }
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
          }
        }
        if (this.field_b == 254) {
          if (param5 == 0) {
            return;
          }
          if (param6 > this.field_h - 1) {
            return;
          }
          param4--;
          while (param4 >= 0) {
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param4--;
          }
          param4 = param6 - param5 & 3;
          while (true) {
            param4--;
            if (param4 < 0) {
              return;
            }
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
          }
        }
        var10Lifetime1 = this.field_b;
        var11Lifetime1 = 256 - this.field_b;
        param3 = ((param3 & 16711935) * var11Lifetime1 >> 8 & 16711935) + ((param3 & 65280) * var11Lifetime1 >> 8 & 65280);
        while (true) {
          param4--;
          if (param4 < 0) {
            param4 = param6 - param5 & 3;
            while (true) {
              param4--;
              if (param4 < 0) {
                return;
              }
              param2++;
              if (param7 < param1[param2]) {
                var12Lifetime1 = param0[param2];
                param0[param2] = (var11Lifetime1 | var12Lifetime1 >> 24) << 24 | param3 + ((var12Lifetime1 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var10Lifetime1 >> 8 & 65280);
                param1[param2] = param7;
              }
              param7 = param7 + param8;
            }
          }
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime1 = param0[param2];
            param0[param2] = (var11Lifetime1 | var12Lifetime1Lifetime1 >> 24) << 24 | param3 + ((var12Lifetime1Lifetime1 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime1 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime2 = param0[param2];
            param0[param2] = (var11Lifetime1 | var12Lifetime1Lifetime2 >> 24) << 24 | param3 + ((var12Lifetime1Lifetime2 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime2 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime3 = param0[param2];
            param0[param2] = (var11Lifetime1 | var12Lifetime1Lifetime3 >> 24) << 24 | param3 + ((var12Lifetime1Lifetime3 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime3 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime4 = param0[param2];
            param0[param2] = (var11Lifetime1 | var12Lifetime1Lifetime4 >> 24) << 24 | param3 + ((var12Lifetime1Lifetime4 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime4 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9, int param10, int param11) {
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var37Lifetime1;
        float var37Lifetime2;
        float var38Lifetime1;
        float var38Lifetime2;
        float var39Lifetime1;
        float var39Lifetime2;
        if (this.field_s) {
          this.field_k.b((int)param0, -16777216 | param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, -16777216 | param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, -16777216 | param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
        float var13 = param4 - param3;
        float var14 = param1 - param0;
        float var15 = param5 - param3;
        float var16 = param2 - param0;
        float var17 = param7 - param6;
        float var18 = param8 - param6;
        float var19 = (float)((param10 & 16711680) - (param9 & 16711680));
        float var20 = (float)((param11 & 16711680) - (param9 & 16711680));
        float var21 = (float)((param10 & 65280) - (param9 & 65280));
        float var22 = (float)((param11 & 65280) - (param9 & 65280));
        float var23 = (float)((param10 & 255) - (param9 & 255));
        float var24 = (float)((param11 & 255) - (param9 & 255));
        if (param2 != param1) {
          var25 = (param5 - param4) / (param2 - param1);
        } else {
          var25 = 0.0f;
        }
        if (param1 != param0) {
          var26 = var13 / var14;
        } else {
          var26 = 0.0f;
        }
        if (param2 != param0) {
          var27 = var15 / var16;
        } else {
          var27 = 0.0f;
        }
        float var28 = var13 * var16 - var15 * var14;
        if (var28 == 0.0f) {
          return;
        }
        float var29 = (var17 * var16 - var18 * var14) / var28;
        float var30 = (var18 * var13 - var17 * var15) / var28;
        float var31 = (var19 * var16 - var20 * var14) / var28;
        float var32 = (var20 * var13 - var19 * var15) / var28;
        float var33 = (var21 * var16 - var22 * var14) / var28;
        float var34 = (var22 * var13 - var21 * var15) / var28;
        float var35 = (var23 * var16 - var24 * var14) / var28;
        float var36 = (var24 * var13 - var23 * var15) / var28;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          param6 = param6 - var29 * param3 + var29;
          var37 = (float)(param9 & 16711680) - var31 * param3 + var31;
          var38 = (float)(param9 & 65280) - var33 * param3 + var33;
          var39 = (float)(param9 & 255) - var35 * param3 + var35;
          if (param1 < param2) {
            param5 = param3;
            if (param0 < 0.0f) {
              param5 = param5 - var27 * param0;
              param3 = param3 - var26 * param0;
              param6 = param6 - var30 * param0;
              var37 = var37 - var32 * param0;
              var38 = var38 - var34 * param0;
              var39 = var39 - var36 * param0;
              param0 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var25 * param1;
              param1 = 0.0f;
            }
            if (param0 != param1 &&
              var27 < var26) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (!(var27 > var25)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var27;
              param4 = param4 + var25;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param4 = param3;
          if (param0 < 0.0f) {
            param4 = param4 - var27 * param0;
            param3 = param3 - var26 * param0;
            param6 = param6 - var30 * param0;
            var37 = var37 - var32 * param0;
            var38 = var38 - var34 * param0;
            var39 = var39 - var36 * param0;
            param0 = 0.0f;
          }
          if (param2 < 0.0f) {
            param5 = param5 - var25 * param2;
            param2 = 0.0f;
          }
          if (param0 != param2 &&
            var27 < var26) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (!(var25 > var26)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
            param4 = param4 + var27;
            param3 = param3 + var26;
            param6 = param6 + var30;
            var37 = var37 + var32;
            var38 = var38 + var34;
            var39 = var39 + var36;
            param0 = param0 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
            param5 = param5 + var25;
            param3 = param3 + var26;
            param6 = param6 + var30;
            var37 = var37 + var32;
            var38 = var38 + var34;
            var39 = var39 + var36;
            param0 = param0 + (float)this.field_t;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_v) {
            return;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          param7 = param7 - var29 * param4 + var29;
          var37Lifetime1 = (float)(param10 & 16711680) - var31 * param4 + var31;
          var38Lifetime1 = (float)(param10 & 65280) - var33 * param4 + var33;
          var39Lifetime1 = (float)(param10 & 255) - var35 * param4 + var35;
          if (param2 < param0) {
            param3 = param4;
            if (param1 < 0.0f) {
              param3 = param3 - var26 * param1;
              param4 = param4 - var25 * param1;
              param7 = param7 - var30 * param1;
              var37Lifetime1 = var37Lifetime1 - var32 * param1;
              var38Lifetime1 = var38Lifetime1 - var34 * param1;
              var39Lifetime1 = var39Lifetime1 - var36 * param1;
              param1 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var27 * param2;
              param2 = 0.0f;
            }
            if (param1 != param2 &&
              var26 < var25) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (!(var26 > var27)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var26;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var26;
              param5 = param5 + var27;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param5 = param4;
          if (param1 < 0.0f) {
            param5 = param5 - var26 * param1;
            param4 = param4 - var25 * param1;
            param7 = param7 - var30 * param1;
            var37Lifetime1 = var37Lifetime1 - var32 * param1;
            var38Lifetime1 = var38Lifetime1 - var34 * param1;
            var39Lifetime1 = var39Lifetime1 - var36 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var27 * param0;
            param0 = 0.0f;
          }
          if (!(var26 < var25)) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param5 = param5 + var26;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var27;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
            param5 = param5 + var26;
            param4 = param4 + var25;
            param7 = param7 + var30;
            var37Lifetime1 = var37Lifetime1 + var32;
            var38Lifetime1 = var38Lifetime1 + var34;
            var39Lifetime1 = var39Lifetime1 + var36;
            param1 = param1 + (float)this.field_t;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
            param3 = param3 + var27;
            param4 = param4 + var25;
            param7 = param7 + var30;
            var37Lifetime1 = var37Lifetime1 + var32;
            var38Lifetime1 = var38Lifetime1 + var34;
            var39Lifetime1 = var39Lifetime1 + var36;
            param1 = param1 + (float)this.field_t;
          }
          return;
        }
        if (param2 >= (float)this.field_v) {
          return;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (param1 > (float)this.field_v) {
          param1 = (float)this.field_v;
        }
        param8 = param8 - var29 * param5 + var29;
        var37Lifetime2 = (float)(param11 & 16711680) - var31 * param5 + var31;
        var38Lifetime2 = (float)(param11 & 65280) - var33 * param5 + var33;
        var39Lifetime2 = (float)(param11 & 255) - var35 * param5 + var35;
        if (param0 < param1) {
          param4 = param5;
          if (param2 < 0.0f) {
            param4 = param4 - var25 * param2;
            param5 = param5 - var27 * param2;
            param8 = param8 - var30 * param2;
            var37Lifetime2 = var37Lifetime2 - var32 * param2;
            var38Lifetime2 = var38Lifetime2 - var34 * param2;
            var39Lifetime2 = var39Lifetime2 - var36 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var26 * param0;
            param0 = 0.0f;
          }
          if (!(var25 < var27)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
              param4 = param4 + var25;
              param5 = param5 + var27;
              param8 = param8 + var30;
              var37Lifetime2 = var37Lifetime2 + var32;
              var38Lifetime2 = var38Lifetime2 + var34;
              var39Lifetime2 = var39Lifetime2 + var36;
              param2 = param2 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
              param4 = param4 + var25;
              param3 = param3 + var26;
              param8 = param8 + var30;
              var37Lifetime2 = var37Lifetime2 + var32;
              var38Lifetime2 = var38Lifetime2 + var34;
              var39Lifetime2 = var39Lifetime2 + var36;
              param2 = param2 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var25;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var25;
            param3 = param3 + var26;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param3 = param5;
        if (param2 < 0.0f) {
          param3 = param3 - var25 * param2;
          param5 = param5 - var27 * param2;
          param8 = param8 - var30 * param2;
          var37Lifetime2 = var37Lifetime2 - var32 * param2;
          var38Lifetime2 = var38Lifetime2 - var34 * param2;
          var39Lifetime2 = var39Lifetime2 - var36 * param2;
          param2 = 0.0f;
        }
        if (param1 < 0.0f) {
          param4 = param4 - var26 * param1;
          param1 = 0.0f;
        }
        if (!(var25 < var27)) {
          param0 = param0 - param1;
          param1 = param1 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param3 = param3 + var25;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var26;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_p[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
          param3 = param3 + var25;
          param5 = param5 + var27;
          param8 = param8 + var30;
          var37Lifetime2 = var37Lifetime2 + var32;
          var38Lifetime2 = var38Lifetime2 + var34;
          var39Lifetime2 = var39Lifetime2 + var36;
          param2 = param2 + (float)this.field_t;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
          param4 = param4 + var26;
          param5 = param5 + var27;
          param8 = param8 + var30;
          var37Lifetime2 = var37Lifetime2 + var32;
          var38Lifetime2 = var38Lifetime2 + var34;
          var39Lifetime2 = var39Lifetime2 + var36;
          param2 = param2 + (float)this.field_t;
        }
    }

    final void a(boolean param0) {
        this.field_s = param0 ? true : false;
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10) {
        int var12;
        int var13;
        int var14;
        if (this.field_q) {
          if (param6 > this.field_h) {
            param6 = this.field_h;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        param2 = param2 + (param5 - 1);
        param7 = param7 + param8 * (float)param5;
        param9 = param9 + param10 * (float)param5;
        if (!this.field_o.field_n) {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param0[param2] = bt.field_h[(int)param7];
                }
                param9 = param9 + param10;
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            } else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param3 = bt.field_h[(int)param7];
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  var14 = param0[param2];
                  param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param4--;
              } while (param4 > 0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            param4 = param6 - param5 >> 2;
            param8 = param8 * 4.0f;
            if (this.field_b == 0) {
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (!(param4 <= 0)) {
                param3 = bt.field_h[(int)param7];
                do {
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (param4 > 0) {
                param3 = bt.field_h[(int)param7];
                param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                do {
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
            }
          }
        } else {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param0[param2] = bt.field_h[(int)param7];
                  param1[param2] = param9;
                }
                param9 = param9 + param10;
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            } else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param3 = bt.field_h[(int)param7];
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  var14 = param0[param2];
                  param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  param1[param2] = param9;
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param4--;
              } while (param4 > 0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            param4 = param6 - param5 >> 2;
            param8 = param8 * 4.0f;
            if (this.field_b == 0) {
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (param4 <= 0) {
                return;
              }
              param3 = bt.field_h[(int)param7];
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param0[param2] = param3;
                  param1[param2] = param9;
                }
                param9 = param9 + param10;
                param4--;
              } while (param4 > 0);
              decompiledFrameRemainder0 = false;
            }
            else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (param4 > 0) {
                param3 = bt.field_h[(int)param7];
                param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                do {
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
            }
          }
        }

    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        if (this.field_s) {
          this.field_k.b((int)param0, param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
        float var11 = param4 - param3;
        float var12 = param1 - param0;
        float var13 = param5 - param3;
        float var14 = param2 - param0;
        float var15 = param7 - param6;
        float var16 = param8 - param6;
        float var17 = 0.0f;
        if (param1 != param0) {
          var17 = (param4 - param3) / (param1 - param0);
        }
        float var18 = 0.0f;
        if (param2 != param1) {
          var18 = (param5 - param4) / (param2 - param1);
        }
        float var19 = 0.0f;
        if (param2 != param0) {
          var19 = (param3 - param5) / (param0 - param2);
        }
        float var20 = var11 * var14 - var13 * var12;
        if (var20 == 0.0f) {
          return;
        }
        float var21 = (var15 * var14 - var16 * var12) / var20;
        float var22 = (var16 * var11 - var15 * var13) / var20;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          param6 = param6 - var21 * param3 + var21;
          if (param1 < param2) {
            param5 = param3;
            if (param0 < 0.0f) {
              param5 = param5 - var19 * param0;
              param3 = param3 - var17 * param0;
              param6 = param6 - var22 * param0;
              param0 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var18 * param1;
              param1 = 0.0f;
            }
            if (param0 != param1 &&
              var19 < var17) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (!(var19 > var18)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
              param5 = param5 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
              param5 = param5 + var19;
              param4 = param4 + var18;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param4 = param3;
          if (param0 < 0.0f) {
            param4 = param4 - var19 * param0;
            param3 = param3 - var17 * param0;
            param6 = param6 - var22 * param0;
            param0 = 0.0f;
          }
          if (param2 < 0.0f) {
            param5 = param5 - var18 * param2;
            param2 = 0.0f;
          }
          if (param0 != param2 &&
            var19 < var17) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (!(var18 > var17)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
            param4 = param4 + var19;
            param3 = param3 + var17;
            param6 = param6 + var22;
            param0 = param0 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
            param5 = param5 + var18;
            param3 = param3 + var17;
            param6 = param6 + var22;
            param0 = param0 + (float)this.field_t;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_v) {
            return;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          param7 = param7 - var21 * param4 + var21;
          if (param2 < param0) {
            param3 = param4;
            if (param1 < 0.0f) {
              param3 = param3 - var17 * param1;
              param4 = param4 - var18 * param1;
              param7 = param7 - var22 * param1;
              param1 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var19 * param2;
              param2 = 0.0f;
            }
            if (param1 != param2 &&
              var17 < var18) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (!(var17 > var19)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
              param3 = param3 + var17;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
              param3 = param3 + var17;
              param5 = param5 + var19;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param5 = param4;
          if (param1 < 0.0f) {
            param5 = param5 - var17 * param1;
            param4 = param4 - var18 * param1;
            param7 = param7 - var22 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var19 * param0;
            param0 = 0.0f;
          }
          if (!(var17 < var18)) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
              param5 = param5 + var17;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
              param3 = param3 + var19;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
            param5 = param5 + var17;
            param4 = param4 + var18;
            param7 = param7 + var22;
            param1 = param1 + (float)this.field_t;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
            param3 = param3 + var19;
            param4 = param4 + var18;
            param7 = param7 + var22;
            param1 = param1 + (float)this.field_t;
          }
          return;
        }
        if (param2 >= (float)this.field_v) {
          return;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (param1 > (float)this.field_v) {
          param1 = (float)this.field_v;
        }
        param8 = param8 - var21 * param5 + var21;
        if (param0 < param1) {
          param4 = param5;
          if (param2 < 0.0f) {
            param4 = param4 - var18 * param2;
            param5 = param5 - var19 * param2;
            param8 = param8 - var22 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var17 * param0;
            param0 = 0.0f;
          }
          if (!(var18 < var19)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
              param4 = param4 + var18;
              param5 = param5 + var19;
              param8 = param8 + var22;
              param2 = param2 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
              param4 = param4 + var18;
              param3 = param3 + var17;
              param8 = param8 + var22;
              param2 = param2 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
            param4 = param4 + var18;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
            param4 = param4 + var18;
            param3 = param3 + var17;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param3 = param5;
        if (param2 < 0.0f) {
          param3 = param3 - var18 * param2;
          param5 = param5 - var19 * param2;
          param8 = param8 - var22 * param2;
          param2 = 0.0f;
        }
        if (param1 < 0.0f) {
          param4 = param4 - var17 * param1;
          param1 = 0.0f;
        }
        if (!(var18 < var19)) {
          param0 = param0 - param1;
          param1 = param1 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
            param3 = param3 + var18;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
            param4 = param4 + var17;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_p[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
          param3 = param3 + var18;
          param5 = param5 + var19;
          param8 = param8 + var22;
          param2 = param2 + (float)this.field_t;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
          param4 = param4 + var17;
          param5 = param5 + var19;
          param8 = param8 + var22;
          param2 = param2 + (float)this.field_t;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, int param15, int param16, int param17, int param18, int param19, int param20, int param21, int param22) {
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        float var33;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float var40;
        float var41;
        float var42;
        float var43;
        float var44;
        float var45;
        float var46;
        float var47;
        float var48;
        float var49;
        float var50;
        float var51;
        float var52;
        float var53;
        float var54;
        float var55;
        float var56;
        float var57;
        float var58;
        float var59;
        float var60;
        float var61;
        float var62;
        float var63;
        int stackIn_6_1 = 0;
        float var24Lifetime1;
        float var27Lifetime1;
        float var30Lifetime1;
        float var33Lifetime1;
        float var45Lifetime1;
        float var54Lifetime1;
        if (param22 != this.field_c) {
          this.field_w = this.field_k.h(param22);
          if (this.field_w == null) {
            this.b((float)(int)param0, (float)(int)param1, (float)(int)param2, (float)(int)param3, (float)(int)param4, (float)(int)param5, (float)(int)param6, (float)(int)param7, (float)(int)param8, l.a(param18 | param19 << 24, param15, 20048), l.a(param18 | param20 << 24, param16, 20048), l.a(param18 | param21 << 24, param17, 20048));
            return;
          }
          if (!this.field_k.j(param22)) {
            stackIn_6_1 = this.field_k.field_I;
          } else {
            stackIn_6_1 = 64;
          }
          this.field_i = stackIn_6_1;
          this.field_r = this.field_i - 1;
          this.field_f = this.field_k.f(param22);
          this.field_d = this.field_k.d(param22);
        }
        this.field_l = param18;
        var24 = (float)(param15 >> 24 & 255);
        var25 = (float)(param16 >> 24 & 255);
        var26 = (float)(param17 >> 24 & 255);
        var27 = (float)(param15 >> 16 & 255);
        var28 = (float)(param16 >> 16 & 255);
        var29 = (float)(param17 >> 16 & 255);
        var30 = (float)(param15 >> 8 & 255);
        var31 = (float)(param16 >> 8 & 255);
        var32 = (float)(param17 >> 8 & 255);
        var33 = (float)(param15 & 255);
        var34 = (float)(param16 & 255);
        var35 = (float)(param17 & 255);
        param9 = param9 / param6;
        param10 = param10 / param7;
        param11 = param11 / param8;
        param12 = param12 / param6;
        param13 = param13 / param7;
        param14 = param14 / param8;
        param6 = 1.0f / param6;
        param7 = 1.0f / param7;
        param8 = 1.0f / param8;
        var36 = 0.0f;
        var37 = 0.0f;
        var38 = 0.0f;
        var39 = 0.0f;
        var40 = 0.0f;
        var41 = 0.0f;
        var42 = 0.0f;
        var43 = 0.0f;
        var44 = 0.0f;
        if (param1 != param0) {
          var45 = param1 - param0;
          var36 = (param4 - param3) / var45;
          var37 = (param7 - param6) / var45;
          var38 = (param10 - param9) / var45;
          var39 = (param13 - param12) / var45;
          var40 = (float)(param20 - param19) / var45;
          var41 = (var25 - var24) / var45;
          var42 = (var28 - var27) / var45;
          var43 = (var31 - var30) / var45;
          var44 = (var34 - var33) / var45;
        }
        var45Lifetime1 = 0.0f;
        var46 = 0.0f;
        var47 = 0.0f;
        var48 = 0.0f;
        var49 = 0.0f;
        var50 = 0.0f;
        var51 = 0.0f;
        var52 = 0.0f;
        var53 = 0.0f;
        if (param2 != param1) {
          var54 = param2 - param1;
          var45Lifetime1 = (param5 - param4) / var54;
          var46 = (param8 - param7) / var54;
          var47 = (param11 - param10) / var54;
          var48 = (param14 - param13) / var54;
          var49 = (float)(param21 - param20) / var54;
          var50 = (var26 - var25) / var54;
          var51 = (var29 - var28) / var54;
          var52 = (var32 - var31) / var54;
          var53 = (var35 - var34) / var54;
        }
        var54Lifetime1 = 0.0f;
        var55 = 0.0f;
        var56 = 0.0f;
        var57 = 0.0f;
        var58 = 0.0f;
        var59 = 0.0f;
        var60 = 0.0f;
        var61 = 0.0f;
        var62 = 0.0f;
        if (param0 != param2) {
          var63 = param0 - param2;
          var54Lifetime1 = (param3 - param5) / var63;
          var55 = (param6 - param8) / var63;
          var56 = (param9 - param11) / var63;
          var57 = (param12 - param14) / var63;
          var58 = (float)(param19 - param21) / var63;
          var59 = (var24 - var26) / var63;
          var60 = (var27 - var29) / var63;
          var61 = (var30 - var32) / var63;
          var62 = (var33 - var35) / var63;
        }
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (!(param1 < param2)) {
            param4 = param3;
            param7 = param6;
            param10 = param9;
            param13 = param12;
            param20 = param19;
            var25 = var24;
            var28 = var27;
            var31 = var30;
            var34 = var33;
            if (param0 < 0.0f) {
              param3 = param3 - var36 * param0;
              param4 = param4 - var54Lifetime1 * param0;
              param6 = param6 - var37 * param0;
              param7 = param7 - var55 * param0;
              param9 = param9 - var38 * param0;
              param10 = param10 - var56 * param0;
              param12 = param12 - var39 * param0;
              param13 = param13 - var57 * param0;
              param19 = (int)((float)param19 - var40 * param0);
              param20 = (int)((float)param20 - var58 * param0);
              var24 = var24 - var41 * param0;
              var25 = var25 - var59 * param0;
              var27 = var27 - var41 * param0;
              var28 = var28 - var59 * param0;
              var30 = var30 - var41 * param0;
              var31 = var31 - var59 * param0;
              var33 = var33 - var41 * param0;
              var34 = var34 - var59 * param0;
              param0 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var45Lifetime1 * param2;
              param8 = param8 - var46 * param2;
              param11 = param11 - var47 * param2;
              param14 = param14 - var48 * param2;
              param21 = (int)((float)param21 - var49 * param2);
              var26 = var26 - var50 * param2;
              var29 = var29 - var51 * param2;
              var32 = var32 - var52 * param2;
              var35 = var35 - var53 * param2;
              param2 = 0.0f;
            }
            if ((param0 == param2 ||
              !(var54Lifetime1 < var36)) &&
              (param0 != param2 ||
              !(var45Lifetime1 > var36))) {
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param2 = param2 - 1.0f;
                if (param2 >= 0.0f) {
                  this.a(this.field_a, this.field_w, (int)param0, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                  param4 = param4 + var54Lifetime1;
                  param3 = param3 + var36;
                  param7 = param7 + var55;
                  param6 = param6 + var37;
                  param10 = param10 + var56;
                  param9 = param9 + var38;
                  param13 = param13 + var57;
                  param12 = param12 + var39;
                  param20 = (int)((float)param20 + var58);
                  param19 = (int)((float)param19 + var40);
                  var25 = var25 + var59;
                  var24 = var24 + var41;
                  var28 = var28 + var60;
                  var27 = var27 + var42;
                  var31 = var31 + var61;
                  var30 = var30 + var43;
                  var34 = var34 + var62;
                  var33 = var33 + var44;
                  param0 = param0 + (float)this.field_t;
                  continue;
                }
                break;
              }
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  return;
                }
                this.a(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                param3 = param3 + var36;
                param5 = param5 + var45Lifetime1;
                param6 = param6 + var37;
                param8 = param8 + var46;
                param9 = param9 + var38;
                param11 = param11 + var47;
                param12 = param12 + var39;
                param14 = param14 + var48;
                param19 = (int)((float)param19 + var40);
                param21 = (int)((float)param21 + var49);
                var24 = var24 + var41;
                var26 = var26 + var50;
                var27 = var27 + var42;
                var29 = var29 + var51;
                var30 = var30 + var43;
                var32 = var32 + var52;
                var33 = var33 + var44;
                var35 = var35 + var53;
                param0 = param0 + (float)this.field_t;
              }
            }
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (param2 >= 0.0f) {
                this.a(this.field_a, this.field_w, (int)param0, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                param3 = param3 + var36;
                param4 = param4 + var54Lifetime1;
                param6 = param6 + var37;
                param7 = param7 + var55;
                param9 = param9 + var38;
                param10 = param10 + var56;
                param12 = param12 + var39;
                param13 = param13 + var57;
                param19 = (int)((float)param19 + var40);
                param20 = (int)((float)param20 + var58);
                var24 = var24 + var41;
                var25 = var25 + var59;
                var27 = var27 + var42;
                var28 = var28 + var60;
                var30 = var30 + var43;
                var31 = var31 + var61;
                var33 = var33 + var44;
                var34 = var34 + var62;
                param0 = param0 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                return;
              }
              this.a(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
              param5 = param5 + var45Lifetime1;
              param3 = param3 + var36;
              param8 = param8 + var46;
              param6 = param6 + var37;
              param11 = param11 + var47;
              param9 = param9 + var38;
              param14 = param14 + var48;
              param12 = param12 + var39;
              param21 = (int)((float)param21 + var49);
              param19 = (int)((float)param19 + var40);
              var26 = var26 + var50;
              var24 = var24 + var41;
              var29 = var29 + var51;
              var27 = var27 + var42;
              var32 = var32 + var52;
              var30 = var30 + var43;
              var35 = var35 + var53;
              var33 = var33 + var44;
              param0 = param0 + (float)this.field_t;
            }
          }
          param5 = param3;
          param8 = param6;
          param11 = param9;
          param14 = param12;
          param21 = param19;
          var26 = var24;
          var29 = var27;
          var32 = var30;
          var35 = var33;
          if (param0 < 0.0f) {
            param3 = param3 - var36 * param0;
            param5 = param5 - var54Lifetime1 * param0;
            param6 = param6 - var37 * param0;
            param8 = param8 - var55 * param0;
            param9 = param9 - var38 * param0;
            param11 = param11 - var56 * param0;
            param12 = param12 - var39 * param0;
            param14 = param14 - var57 * param0;
            param19 = (int)((float)param19 - var40 * param0);
            param21 = (int)((float)param21 - var58 * param0);
            var24 = var24 - var41 * param0;
            var26 = var26 - var59 * param0;
            var27 = var27 - var41 * param0;
            var29 = var29 - var59 * param0;
            var30 = var30 - var41 * param0;
            var32 = var32 - var59 * param0;
            var33 = var33 - var41 * param0;
            var35 = var35 - var59 * param0;
            param0 = 0.0f;
          }
          if (param1 < 0.0f) {
            param4 = param4 - var45Lifetime1 * param1;
            param7 = param7 - var46 * param1;
            param10 = param10 - var47 * param1;
            param13 = param13 - var48 * param1;
            param20 = (int)((float)param20 - var49 * param1);
            var25 = var25 - var50 * param1;
            var28 = var28 - var51 * param1;
            var31 = var31 - var52 * param1;
            var34 = var34 - var53 * param1;
            param1 = 0.0f;
          }
          if ((param0 == param1 ||
            !(var54Lifetime1 < var36)) &&
            (param0 != param1 ||
            !(var54Lifetime1 > var45Lifetime1))) {
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (param1 >= 0.0f) {
                this.a(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                param3 = param3 + var36;
                param5 = param5 + var54Lifetime1;
                param6 = param6 + var37;
                param8 = param8 + var55;
                param9 = param9 + var38;
                param11 = param11 + var56;
                param12 = param12 + var39;
                param14 = param14 + var57;
                param19 = (int)((float)param19 + var40);
                param21 = (int)((float)param21 + var58);
                var24 = var24 + var41;
                var26 = var26 + var59;
                var27 = var27 + var42;
                var29 = var29 + var60;
                var30 = var30 + var43;
                var32 = var32 + var61;
                var33 = var33 + var44;
                var35 = var35 + var62;
                param0 = param0 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                return;
              }
              this.a(this.field_a, this.field_w, (int)param0, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
              param4 = param4 + var45Lifetime1;
              param5 = param5 + var54Lifetime1;
              param7 = param7 + var46;
              param8 = param8 + var55;
              param10 = param10 + var47;
              param11 = param11 + var56;
              param13 = param13 + var48;
              param14 = param14 + var57;
              param20 = (int)((float)param20 + var49);
              param21 = (int)((float)param21 + var58);
              var25 = var25 + var50;
              var26 = var26 + var59;
              var28 = var28 + var51;
              var29 = var29 + var60;
              var31 = var31 + var52;
              var32 = var32 + var61;
              var34 = var34 + var53;
              var35 = var35 + var62;
              param0 = param0 + (float)this.field_t;
            }
          }
          param2 = param2 - param1;
          param1 = param1 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param1 = param1 - 1.0f;
            if (param1 >= 0.0f) {
              this.a(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
              param3 = param3 + var36;
              param5 = param5 + var54Lifetime1;
              param6 = param6 + var37;
              param8 = param8 + var55;
              param9 = param9 + var38;
              param11 = param11 + var56;
              param12 = param12 + var39;
              param14 = param14 + var57;
              param19 = (int)((float)param19 + var40);
              param21 = (int)((float)param21 + var58);
              var24 = var24 + var41;
              var26 = var26 + var59;
              var27 = var27 + var42;
              var29 = var29 + var60;
              var30 = var30 + var43;
              var32 = var32 + var61;
              var33 = var33 + var44;
              var35 = var35 + var62;
              param0 = param0 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              return;
            }
            this.a(this.field_a, this.field_w, (int)param0, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
            param4 = param4 + var45Lifetime1;
            param5 = param5 + var54Lifetime1;
            param7 = param7 + var46;
            param8 = param8 + var55;
            param10 = param10 + var47;
            param11 = param11 + var56;
            param13 = param13 + var48;
            param14 = param14 + var57;
            param20 = (int)((float)param20 + var49);
            param21 = (int)((float)param21 + var58);
            var25 = var25 + var50;
            var26 = var26 + var59;
            var28 = var28 + var51;
            var29 = var29 + var60;
            var31 = var31 + var52;
            var32 = var32 + var61;
            var34 = var34 + var53;
            var35 = var35 + var62;
            param0 = param0 + (float)this.field_t;
          }
        }
        if (!(param1 <= param2)) {
          if (param2 >= (float)this.field_v) {
            return;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (!(param0 < param1)) {
            param3 = param5;
            param6 = param8;
            param9 = param11;
            param12 = param14;
            param19 = param21;
            var24 = var26;
            var27 = var29;
            var30 = var32;
            var33 = var35;
            if (param2 < 0.0f) {
              param5 = param5 - var54Lifetime1 * param2;
              param3 = param3 - var45Lifetime1 * param2;
              param8 = param8 - var55 * param2;
              param6 = param6 - var46 * param2;
              param11 = param11 - var56 * param2;
              param9 = param9 - var47 * param2;
              param14 = param14 - var57 * param2;
              param12 = param12 - var48 * param2;
              param21 = (int)((float)param21 - var58 * 3.0f);
              param19 = (int)((float)param19 - var49 * param2);
              var26 = var26 - var59 * param2;
              var24 = var24 - var50 * param2;
              var29 = var29 - var60 * param2;
              var27 = var27 - var51 * param2;
              var32 = var32 - var61 * param2;
              var30 = var30 - var52 * param2;
              var35 = var35 - var62 * param2;
              var33 = var33 - var53 * param2;
              param2 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var36 * param1;
              param7 = param7 - var37 * param1;
              param10 = param10 - var38 * param1;
              param13 = param13 - var39 * param1;
              param20 = (int)((float)param20 - var40 * param1);
              var25 = var25 - var41 * param1;
              var28 = var28 - var42 * param1;
              var31 = var31 - var43 * param1;
              var34 = var34 - var44 * param1;
              param1 = 0.0f;
            }
            if (!(var45Lifetime1 < var54Lifetime1)) {
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = (float)this.field_p[(int)param2];
              while (true) {
                param1 = param1 - 1.0f;
                if (param1 >= 0.0f) {
                  this.a(this.field_a, this.field_w, (int)param2, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                  param5 = param5 + var54Lifetime1;
                  param3 = param3 + var45Lifetime1;
                  param8 = param8 + var55;
                  param6 = param6 + var46;
                  param11 = param11 + var56;
                  param9 = param9 + var47;
                  param14 = param14 + var57;
                  param12 = param12 + var48;
                  param21 = (int)((float)param21 + var58);
                  param19 = (int)((float)param19 + var49);
                  var26 = var26 + var59;
                  var24 = var24 + var50;
                  var29 = var29 + var60;
                  var27 = var27 + var51;
                  var32 = var32 + var61;
                  var30 = var30 + var52;
                  var35 = var35 + var62;
                  var33 = var33 + var53;
                  param2 = param2 + (float)this.field_t;
                  continue;
                }
                break;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  return;
                }
                this.a(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                param5 = param5 + var54Lifetime1;
                param4 = param4 + var36;
                param8 = param8 + var55;
                param7 = param7 + var37;
                param11 = param11 + var56;
                param10 = param10 + var38;
                param14 = param14 + var57;
                param13 = param13 + var39;
                param21 = (int)((float)param21 + var58);
                param20 = (int)((float)param20 + var40);
                var26 = var26 + var59;
                var25 = var25 + var41;
                var29 = var29 + var60;
                var28 = var28 + var42;
                var32 = var32 + var61;
                var31 = var31 + var43;
                var35 = var35 + var62;
                var34 = var34 + var44;
                param2 = param2 + (float)this.field_t;
              }
            }
            param0 = param0 - param1;
            param1 = param1 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param1 = param1 - 1.0f;
              if (param1 >= 0.0f) {
                this.a(this.field_a, this.field_w, (int)param2, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                param3 = param3 + var45Lifetime1;
                param5 = param5 + var54Lifetime1;
                param6 = param6 + var46;
                param8 = param8 + var55;
                param9 = param9 + var47;
                param11 = param11 + var56;
                param12 = param12 + var48;
                param14 = param14 + var57;
                param19 = (int)((float)param19 + var49);
                param21 = (int)((float)param21 + var58);
                var24 = var24 + var50;
                var26 = var26 + var59;
                var27 = var27 + var51;
                var29 = var29 + var60;
                var30 = var30 + var52;
                var32 = var32 + var61;
                var33 = var33 + var53;
                var35 = var35 + var62;
                param2 = param2 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                return;
              }
              this.a(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
              param4 = param4 + var36;
              param5 = param5 + var54Lifetime1;
              param7 = param7 + var37;
              param8 = param8 + var55;
              param10 = param10 + var38;
              param11 = param11 + var56;
              param13 = param13 + var39;
              param14 = param14 + var57;
              param20 = (int)((float)param20 + var40);
              param21 = (int)((float)param21 + var58);
              var25 = var25 + var41;
              var26 = var26 + var59;
              var28 = var28 + var42;
              var29 = var29 + var60;
              var31 = var31 + var43;
              var32 = var32 + var61;
              var34 = var34 + var44;
              var35 = var35 + var62;
              param2 = param2 + (float)this.field_t;
            }
          }
          param4 = param5;
          param7 = param8;
          param10 = param11;
          param13 = param14;
          param20 = param21;
          var25 = var26;
          var28 = var29;
          var31 = var32;
          var34 = var35;
          if (param2 < 0.0f) {
            param5 = param5 - var54Lifetime1 * param2;
            param4 = param4 - var45Lifetime1 * param2;
            param8 = param8 - var55 * param2;
            param7 = param7 - var46 * param2;
            param11 = param11 - var56 * param2;
            param10 = param10 - var47 * param2;
            param14 = param14 - var57 * param2;
            param13 = param13 - var48 * param2;
            param21 = (int)((float)param21 - var58 * 3.0f);
            param20 = (int)((float)param20 - var49 * param2);
            var26 = var26 - var59 * param2;
            var25 = var25 - var50 * param2;
            var29 = var29 - var60 * param2;
            var28 = var28 - var51 * param2;
            var32 = var32 - var61 * param2;
            var31 = var31 - var52 * param2;
            var35 = var35 - var62 * param2;
            var34 = var34 - var53 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var36 * param0;
            param6 = param6 - var37 * param0;
            param9 = param9 - var38 * param0;
            param12 = param12 - var39 * param0;
            param19 = (int)((float)param19 - var40 * param0);
            var24 = var24 - var41 * param0;
            var27 = var27 - var42 * param0;
            var30 = var30 - var43 * param0;
            var33 = var33 - var44 * param0;
            param0 = 0.0f;
          }
          if (!(var45Lifetime1 < var54Lifetime1)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (param0 >= 0.0f) {
                this.a(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                param5 = param5 + var54Lifetime1;
                param4 = param4 + var45Lifetime1;
                param8 = param8 + var55;
                param7 = param7 + var46;
                param11 = param11 + var56;
                param10 = param10 + var47;
                param14 = param14 + var57;
                param13 = param13 + var48;
                param21 = (int)((float)param21 + var58);
                param20 = (int)((float)param20 + var49);
                var26 = var26 + var59;
                var25 = var25 + var50;
                var29 = var29 + var60;
                var28 = var28 + var51;
                var32 = var32 + var61;
                var31 = var31 + var52;
                var35 = var35 + var62;
                var34 = var34 + var53;
                param2 = param2 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                return;
              }
              this.a(this.field_a, this.field_w, (int)param2, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
              param3 = param3 + var36;
              param4 = param4 + var45Lifetime1;
              param6 = param6 + var37;
              param7 = param7 + var46;
              param9 = param9 + var38;
              param10 = param10 + var47;
              param12 = param12 + var39;
              param13 = param13 + var48;
              param19 = (int)((float)param19 + var40);
              param20 = (int)((float)param20 + var49);
              var24 = var24 + var41;
              var25 = var25 + var50;
              var27 = var27 + var42;
              var28 = var28 + var51;
              var30 = var30 + var43;
              var31 = var31 + var52;
              var33 = var33 + var44;
              var34 = var34 + var53;
              param2 = param2 + (float)this.field_t;
            }
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (param0 >= 0.0f) {
              this.a(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
              param4 = param4 + var45Lifetime1;
              param5 = param5 + var54Lifetime1;
              param7 = param7 + var46;
              param8 = param8 + var55;
              param10 = param10 + var47;
              param11 = param11 + var56;
              param13 = param13 + var48;
              param14 = param14 + var57;
              param20 = (int)((float)param20 + var49);
              param21 = (int)((float)param21 + var58);
              var25 = var25 + var50;
              var26 = var26 + var59;
              var28 = var28 + var51;
              var29 = var29 + var60;
              var31 = var31 + var52;
              var32 = var32 + var61;
              var34 = var34 + var53;
              var35 = var35 + var62;
              param2 = param2 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              return;
            }
            this.a(this.field_a, this.field_w, (int)param2, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
            param4 = param4 + var45Lifetime1;
            param3 = param3 + var36;
            param7 = param7 + var46;
            param6 = param6 + var37;
            param10 = param10 + var47;
            param9 = param9 + var38;
            param13 = param13 + var48;
            param12 = param12 + var39;
            param20 = (int)((float)param20 + var49);
            param19 = (int)((float)param19 + var40);
            var25 = var25 + var50;
            var24 = var24 + var41;
            var28 = var28 + var51;
            var27 = var27 + var42;
            var31 = var31 + var52;
            var30 = var30 + var43;
            var34 = var34 + var53;
            var33 = var33 + var44;
            param2 = param2 + (float)this.field_t;
          }
        }
        if (param1 >= (float)this.field_v) {
          return;
        }
        if (param2 > (float)this.field_v) {
          param2 = (float)this.field_v;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (!(param2 < param0)) {
          param5 = param4;
          param8 = param7;
          param11 = param10;
          param14 = param13;
          param21 = param20;
          var26 = var25;
          var29 = var28;
          var32 = var31;
          var35 = var34;
          if (param1 < 0.0f) {
            param5 = param5 - var36 * param1;
            param4 = param4 - var45Lifetime1 * param1;
            param8 = param8 - var37 * param1;
            param7 = param7 - var46 * param1;
            param11 = param11 - var38 * param1;
            param10 = param10 - var47 * param1;
            param14 = param14 - var39 * param1;
            param13 = param13 - var48 * param1;
            param21 = (int)((float)param21 - var40 * param1);
            param20 = (int)((float)param20 - var49 * param1);
            var26 = var26 - var41 * param1;
            var25 = var25 - var50 * param1;
            var29 = var29 - var42 * param1;
            var28 = var28 - var51 * param1;
            var32 = var32 - var43 * param1;
            var31 = var31 - var52 * param1;
            var35 = var35 - var44 * param1;
            var34 = var34 - var53 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var54Lifetime1 * param0;
            param6 = param6 - var55 * param0;
            param9 = param9 - var56 * param0;
            param12 = param12 - var57 * param0;
            param19 = (int)((float)param19 - var58 * param0);
            var24 = var24 - var59 * param0;
            var27 = var27 - var60 * param0;
            var30 = var30 - var61 * param0;
            var33 = var33 - var62 * param0;
            param0 = 0.0f;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          if (!(var36 < var45Lifetime1)) {
            while (true) {
              param0 = param0 - 1.0f;
              if (param0 >= 0.0f) {
                this.a(this.field_a, this.field_w, (int)param1, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                param4 = param4 + var45Lifetime1;
                param5 = param5 + var36;
                param7 = param7 + var46;
                param8 = param8 + var37;
                param10 = param10 + var47;
                param11 = param11 + var38;
                param13 = param13 + var48;
                param14 = param14 + var39;
                param20 = (int)((float)param20 + var49);
                param21 = (int)((float)param21 + var40);
                var25 = var25 + var50;
                var26 = var26 + var41;
                var28 = var28 + var51;
                var29 = var29 + var42;
                var31 = var31 + var52;
                var32 = var32 + var43;
                var34 = var34 + var53;
                var35 = var35 + var44;
                param1 = param1 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                return;
              }
              this.a(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
              param4 = param4 + var45Lifetime1;
              param3 = param3 + var54Lifetime1;
              param7 = param7 + var46;
              param6 = param6 + var55;
              param10 = param10 + var47;
              param9 = param9 + var56;
              param13 = param13 + var48;
              param12 = param12 + var57;
              param20 = (int)((float)param20 + var49);
              param19 = (int)((float)param19 + var58);
              var25 = var25 + var50;
              var24 = var24 + var59;
              var28 = var28 + var51;
              var27 = var27 + var60;
              var31 = var31 + var52;
              var30 = var30 + var61;
              var34 = var34 + var53;
              var33 = var33 + var62;
              param1 = param1 + (float)this.field_t;
            }
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (param0 >= 0.0f) {
              this.a(this.field_a, this.field_w, (int)param1, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
              param5 = param5 + var36;
              param4 = param4 + var45Lifetime1;
              param8 = param8 + var37;
              param7 = param7 + var46;
              param11 = param11 + var38;
              param10 = param10 + var47;
              param14 = param14 + var39;
              param13 = param13 + var48;
              param21 = (int)((float)param21 + var40);
              param20 = (int)((float)param20 + var49);
              var26 = var26 + var41;
              var25 = var25 + var50;
              var29 = var29 + var42;
              var28 = var28 + var51;
              var32 = var32 + var43;
              var31 = var31 + var52;
              var35 = var35 + var44;
              var34 = var34 + var53;
              param1 = param1 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              return;
            }
            this.a(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
            param3 = param3 + var54Lifetime1;
            param4 = param4 + var45Lifetime1;
            param6 = param6 + var55;
            param7 = param7 + var46;
            param9 = param9 + var56;
            param10 = param10 + var47;
            param12 = param12 + var57;
            param13 = param13 + var48;
            param19 = (int)((float)param19 + var58);
            param20 = (int)((float)param20 + var49);
            var24 = var24 + var59;
            var25 = var25 + var50;
            var27 = var27 + var60;
            var28 = var28 + var51;
            var30 = var30 + var61;
            var31 = var31 + var52;
            var33 = var33 + var62;
            var34 = var34 + var53;
            param1 = param1 + (float)this.field_t;
          }
        }
        param3 = param4;
        param6 = param7;
        param9 = param10;
        param12 = param13;
        param19 = param20;
        var24Lifetime1 = var25;
        var27Lifetime1 = var28;
        var30Lifetime1 = var31;
        var33Lifetime1 = var34;
        if (param1 < 0.0f) {
          param3 = param3 - var36 * param1;
          param4 = param4 - var45Lifetime1 * param1;
          param6 = param6 - var37 * param1;
          param7 = param7 - var46 * param1;
          param9 = param9 - var38 * param1;
          param10 = param10 - var47 * param1;
          param12 = param12 - var39 * param1;
          param13 = param13 - var48 * param1;
          param19 = (int)((float)param19 - var40 * param1);
          param20 = (int)((float)param20 - var49 * param1);
          var24Lifetime1 = var24Lifetime1 - var41 * param1;
          var25 = var25 - var50 * param1;
          var27Lifetime1 = var27Lifetime1 - var42 * param1;
          var28 = var28 - var51 * param1;
          var30Lifetime1 = var30Lifetime1 - var43 * param1;
          var31 = var31 - var52 * param1;
          var33Lifetime1 = var33Lifetime1 - var44 * param1;
          var34 = var34 - var53 * param1;
          param1 = 0.0f;
        }
        if (param2 < 0.0f) {
          param5 = param5 - var54Lifetime1 * param2;
          param8 = param8 - var55 * param2;
          param11 = param11 - var56 * param2;
          param14 = param14 - var57 * param2;
          param21 = (int)((float)param21 - var58 * param2);
          var26 = var26 - var59 * param2;
          var29 = var29 - var60 * param2;
          var32 = var32 - var61 * param2;
          var35 = var35 - var62 * param2;
          param2 = 0.0f;
        }
        if ((param1 == param2 ||
          !(var36 < var45Lifetime1)) &&
          (param1 != param2 ||
          !(var36 > var54Lifetime1))) {
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param2 = param2 - 1.0f;
            if (param2 >= 0.0f) {
              this.a(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24Lifetime1, var28, var27Lifetime1, var31, var30Lifetime1, var34, var33Lifetime1);
              param4 = param4 + var45Lifetime1;
              param3 = param3 + var36;
              param7 = param7 + var46;
              param6 = param6 + var37;
              param10 = param10 + var47;
              param9 = param9 + var38;
              param13 = param13 + var48;
              param12 = param12 + var39;
              param20 = (int)((float)param20 + var49);
              param19 = (int)((float)param19 + var40);
              var25 = var25 + var50;
              var24Lifetime1 = var24Lifetime1 + var41;
              var28 = var28 + var51;
              var27Lifetime1 = var27Lifetime1 + var42;
              var31 = var31 + var52;
              var30Lifetime1 = var30Lifetime1 + var43;
              var34 = var34 + var53;
              var33Lifetime1 = var33Lifetime1 + var44;
              param1 = param1 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              return;
            }
            this.a(this.field_a, this.field_w, (int)param1, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24Lifetime1, var29, var27Lifetime1, var32, var30Lifetime1, var35, var33Lifetime1);
            param5 = param5 + var54Lifetime1;
            param3 = param3 + var36;
            param8 = param8 + var55;
            param6 = param6 + var37;
            param11 = param11 + var56;
            param9 = param9 + var38;
            param14 = param14 + var57;
            param12 = param12 + var39;
            param21 = (int)((float)param21 + var58);
            param19 = (int)((float)param19 + var40);
            var26 = var26 + var59;
            var24Lifetime1 = var24Lifetime1 + var41;
            var29 = var29 + var60;
            var27Lifetime1 = var27Lifetime1 + var42;
            var32 = var32 + var61;
            var30Lifetime1 = var30Lifetime1 + var43;
            var35 = var35 + var62;
            var33Lifetime1 = var33Lifetime1 + var44;
            param1 = param1 + (float)this.field_t;
          }
        }
        param0 = param0 - param2;
        param2 = param2 - param1;
        param1 = (float)this.field_p[(int)param1];
        while (true) {
          param2 = param2 - 1.0f;
          if (param2 >= 0.0f) {
            this.a(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24Lifetime1, var25, var27Lifetime1, var28, var30Lifetime1, var31, var33Lifetime1, var34);
            param3 = param3 + var36;
            param4 = param4 + var45Lifetime1;
            param6 = param6 + var37;
            param7 = param7 + var46;
            param9 = param9 + var38;
            param10 = param10 + var47;
            param12 = param12 + var39;
            param13 = param13 + var48;
            param19 = (int)((float)param19 + var40);
            param20 = (int)((float)param20 + var49);
            var24Lifetime1 = var24Lifetime1 + var41;
            var25 = var25 + var50;
            var27Lifetime1 = var27Lifetime1 + var42;
            var28 = var28 + var51;
            var30Lifetime1 = var30Lifetime1 + var43;
            var31 = var31 + var52;
            var33Lifetime1 = var33Lifetime1 + var44;
            var34 = var34 + var53;
            param1 = param1 + (float)this.field_t;
            continue;
          }
          break;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            return;
          }
          this.a(this.field_a, this.field_w, (int)param1, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24Lifetime1, var26, var27Lifetime1, var29, var30Lifetime1, var32, var33Lifetime1, var35);
          param3 = param3 + var36;
          param5 = param5 + var54Lifetime1;
          param6 = param6 + var37;
          param8 = param8 + var55;
          param9 = param9 + var38;
          param11 = param11 + var56;
          param12 = param12 + var39;
          param14 = param14 + var57;
          param19 = (int)((float)param19 + var40);
          param21 = (int)((float)param21 + var58);
          var24Lifetime1 = var24Lifetime1 + var41;
          var26 = var26 + var59;
          var27Lifetime1 = var27Lifetime1 + var42;
          var29 = var29 + var60;
          var30Lifetime1 = var30Lifetime1 + var43;
          var32 = var32 + var61;
          var33Lifetime1 = var33Lifetime1 + var44;
          var35 = var35 + var62;
          param1 = param1 + (float)this.field_t;
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14) {
        int incrementValue$36 = 0;
        int incrementValue$35 = 0;
        int incrementValue$34 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int var16_int = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        if (this.field_q) {
          if (param6 > this.field_h) {
            param6 = this.field_h;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        if (this.field_m) {
          param2 = param2 + param5;
          param9 = param9 + param10 * (float)param5;
          param11 = param11 + param12 * (float)param5;
          param13 = param13 + param14 * (float)param5;
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                incrementValue$36 = param2;
                param2++;
                param0[incrementValue$36] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param4--;
              } while (param4 > 0);
              return;
            }
            if (!this.field_g) {
              var16_int = this.field_b;
              var17 = 256 - this.field_b;
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$35 = param2;
                param2++;
                param0[incrementValue$35] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param4--;
              } while (param4 > 0);
              return;
            }
            do {
              var27 = param0;
              var16 = var27;
              incrementValue$34 = param2;
              param2++;
              var17 = incrementValue$34;
              var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              var19 = var27[var17];
              var20 = var18 + var19;
              var21 = (var18 & 16711935) + (var19 & 16711935);
              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
              var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          param4 = param6 - param5 >> 2;
          param10 = param10 * 4.0f;
          param12 = param12 * 4.0f;
          param14 = param14 * 4.0f;
          if (this.field_b == 0) {
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param0[param2++] = param3;
                param0[param2++] = param3;
                param0[param2++] = param3;
                param0[param2++] = param3;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 <= 0) {
              return;
            }
            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
            do {
              param0[param2++] = param3;
              param4--;
            } while (param4 > 0);
            return;
          }
          if (this.field_g) {
            if (param4 > 0) {
              do {
                param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                var22 = param0;
                var16 = var22;
                incrementValue$19 = param2;
                param2++;
                var17 = incrementValue$19;
                var18 = param3;
                var19 = var22[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                var23 = param0;
                var16 = var23;
                incrementValue$20 = param2;
                param2++;
                var17 = incrementValue$20;
                var18 = param3;
                var19 = var23[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                var24 = param0;
                var16 = var24;
                incrementValue$21 = param2;
                param2++;
                var17 = incrementValue$21;
                var18 = param3;
                var19 = var24[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                var25 = param0;
                var16 = var25;
                incrementValue$22 = param2;
                param2++;
                var17 = incrementValue$22;
                var18 = param3;
                var19 = var25[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              do {
                var26 = param0;
                var16 = var26;
                incrementValue$23 = param2;
                param2++;
                var17 = incrementValue$23;
                var18 = param3;
                var19 = var26[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                param4--;
              } while (param4 > 0);
              return;
            }
          } else {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$24 = param2;
                param2++;
                param0[incrementValue$24] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$25 = param2;
                param2++;
                param0[incrementValue$25] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$26 = param2;
                param2++;
                param0[incrementValue$26] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$27 = param2;
                param2++;
                param0[incrementValue$27] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
              do {
                var18 = param0[param2];
                incrementValue$28 = param2;
                param2++;
                param0[incrementValue$28] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param4--;
              } while (param4 > 0);
              return;
            }
          }
          return;
        }
        param2 = param2 + (param5 - 1);
        param7 = param7 + param8 * (float)param5;
        param9 = param9 + param10 * (float)param5;
        param11 = param11 + param12 * (float)param5;
        param13 = param13 + param14 * (float)param5;
        if (!this.field_o.field_n) {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param4--;
              } while (param4 > 0);
              return;
            }
            if (!this.field_g) {
              var16_int = this.field_b;
              var17 = 256 - this.field_b;
              do {
                param2++;
                if (param7 < param1[param2]) {
                  param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                  param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param4--;
              } while (param4 > 0);
              return;
            }
            do {
              param2++;
              if (param7 < param1[param2]) {
                var39 = param0;
                var16 = var39;
                var17 = param2;
                var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                var19 = var39[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
              }
              param7 = param7 + param8;
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          param4 = param6 - param5 >> 2;
          param10 = param10 * 4.0f;
          param12 = param12 * 4.0f;
          param14 = param14 * 4.0f;
          if (this.field_b == 0) {
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 <= 0) {
              return;
            }
            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
            do {
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param4--;
            } while (param4 > 0);
            return;
          }
          if (this.field_g) {
            if (param4 > 0) {
              do {
                param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param2++;
                if (param7 < param1[param2]) {
                  var34 = param0;
                  var16 = var34;
                  var17 = param2;
                  var18 = param3;
                  var19 = var34[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var35 = param0;
                  var16 = var35;
                  var17 = param2;
                  var18 = param3;
                  var19 = var35[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var36 = param0;
                  var16 = var36;
                  var17 = param2;
                  var18 = param3;
                  var19 = var36[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var37 = param0;
                  var16 = var37;
                  var17 = param2;
                  var18 = param3;
                  var19 = var37[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var38 = param0;
                  var16 = var38;
                  var17 = param2;
                  var18 = param3;
                  var19 = var38[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
              return;
            }
          } else {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
              return;
            }
          }
          return;
        }
        if (!this.field_j) {
          param4 = param6 - param5;
          if (this.field_b == 0) {
            do {
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          if (!this.field_g) {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            do {
              param2++;
              if (param7 < param1[param2]) {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                var18 = param0[param2];
                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          do {
            param2++;
            if (param7 < param1[param2]) {
              var33 = param0;
              var16 = var33;
              var17 = param2;
              var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              var19 = var33[var17];
              var20 = var18 + var19;
              var21 = (var18 & 16711935) + (var19 & 16711935);
              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
              var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param9 = param9 + param10;
            param11 = param11 + param12;
            param13 = param13 + param14;
            param4--;
          } while (param4 > 0);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        param4 = param6 - param5 >> 2;
        param10 = param10 * 4.0f;
        param12 = param12 * 4.0f;
        param14 = param14 * 4.0f;
        if (this.field_b == 0) {
          if (param4 > 0) {
            do {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param4--;
            } while (param4 > 0);
          }
          param4 = param6 - param5 & 3;
          if (param4 <= 0) {
            return;
          }
          param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
          do {
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param4--;
          } while (param4 > 0);
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_g) {
            if (param4 > 0) {
              do {
                param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param2++;
                if (param7 < param1[param2]) {
                  var28 = param0;
                  var16 = var28;
                  var17 = param2;
                  var18 = param3;
                  var19 = var28[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var29 = param0;
                  var16 = var29;
                  var17 = param2;
                  var18 = param3;
                  var19 = var29[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var30 = param0;
                  var16 = var30;
                  var17 = param2;
                  var18 = param3;
                  var19 = var30[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var31 = param0;
                  var16 = var31;
                  var17 = param2;
                  var18 = param3;
                  var19 = var31[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var32 = param0;
                  var16 = var32;
                  var17 = param2;
                  var18 = param3;
                  var19 = var32[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
          } else {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
          }
        }

    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, int param15, int param16, int param17, int param18, int param19, int param20, int param21, int param22) {
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        float var33;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float var40;
        float var41;
        float var42;
        float var43;
        float var44;
        float var45;
        float var46;
        float var47;
        float var48;
        float var49;
        float var50;
        float var51;
        float var52;
        float var53;
        float var54;
        float var55;
        float var56;
        float var57;
        float var58;
        float var59;
        float var60;
        float var61;
        float var62;
        float var63;
        int stackIn_6_1 = 0;
        float var24Lifetime1;
        float var27Lifetime1;
        float var30Lifetime1;
        float var33Lifetime1;
        float var45Lifetime1;
        float var54Lifetime1;
        if (param22 != this.field_c) {
          this.field_w = this.field_k.h(param22);
          if (this.field_w == null) {
            this.a((float)(int)param0, (float)(int)param1, (float)(int)param2, (float)(int)param3, (float)(int)param4, (float)(int)param5, (float)(int)param6, (float)(int)param7, (float)(int)param8, l.a(param18 | param19 << 24, param15, 20048), l.a(param18 | param20 << 24, param16, 20048), l.a(param18 | param21 << 24, param17, 20048));
            return;
          }
          if (!this.field_k.j(param22)) {
            stackIn_6_1 = this.field_k.field_I;
          } else {
            stackIn_6_1 = 64;
          }
          this.field_i = stackIn_6_1;
          this.field_r = this.field_i - 1;
          this.field_f = this.field_k.f(param22);
          this.field_d = this.field_k.d(param22);
        }
        this.field_l = param18;
        var24 = (float)(param15 >> 24 & 255);
        var25 = (float)(param16 >> 24 & 255);
        var26 = (float)(param17 >> 24 & 255);
        var27 = (float)(param15 >> 16 & 255);
        var28 = (float)(param16 >> 16 & 255);
        var29 = (float)(param17 >> 16 & 255);
        var30 = (float)(param15 >> 8 & 255);
        var31 = (float)(param16 >> 8 & 255);
        var32 = (float)(param17 >> 8 & 255);
        var33 = (float)(param15 & 255);
        var34 = (float)(param16 & 255);
        var35 = (float)(param17 & 255);
        param9 = param9 / param6;
        param10 = param10 / param7;
        param11 = param11 / param8;
        param12 = param12 / param6;
        param13 = param13 / param7;
        param14 = param14 / param8;
        param6 = 1.0f / param6;
        param7 = 1.0f / param7;
        param8 = 1.0f / param8;
        var36 = 0.0f;
        var37 = 0.0f;
        var38 = 0.0f;
        var39 = 0.0f;
        var40 = 0.0f;
        var41 = 0.0f;
        var42 = 0.0f;
        var43 = 0.0f;
        var44 = 0.0f;
        if (param1 != param0) {
          var45 = param1 - param0;
          var36 = (param4 - param3) / var45;
          var37 = (param7 - param6) / var45;
          var38 = (param10 - param9) / var45;
          var39 = (param13 - param12) / var45;
          var40 = (float)(param20 - param19) / var45;
          var41 = (var25 - var24) / var45;
          var42 = (var28 - var27) / var45;
          var43 = (var31 - var30) / var45;
          var44 = (var34 - var33) / var45;
        }
        var45Lifetime1 = 0.0f;
        var46 = 0.0f;
        var47 = 0.0f;
        var48 = 0.0f;
        var49 = 0.0f;
        var50 = 0.0f;
        var51 = 0.0f;
        var52 = 0.0f;
        var53 = 0.0f;
        if (param2 != param1) {
          var54 = param2 - param1;
          var45Lifetime1 = (param5 - param4) / var54;
          var46 = (param8 - param7) / var54;
          var47 = (param11 - param10) / var54;
          var48 = (param14 - param13) / var54;
          var49 = (float)(param21 - param20) / var54;
          var50 = (var26 - var25) / var54;
          var51 = (var29 - var28) / var54;
          var52 = (var32 - var31) / var54;
          var53 = (var35 - var34) / var54;
        }
        var54Lifetime1 = 0.0f;
        var55 = 0.0f;
        var56 = 0.0f;
        var57 = 0.0f;
        var58 = 0.0f;
        var59 = 0.0f;
        var60 = 0.0f;
        var61 = 0.0f;
        var62 = 0.0f;
        if (param0 != param2) {
          var63 = param0 - param2;
          var54Lifetime1 = (param3 - param5) / var63;
          var55 = (param6 - param8) / var63;
          var56 = (param9 - param11) / var63;
          var57 = (param12 - param14) / var63;
          var58 = (float)(param19 - param21) / var63;
          var59 = (var24 - var26) / var63;
          var60 = (var27 - var29) / var63;
          var61 = (var30 - var32) / var63;
          var62 = (var33 - var35) / var63;
        }
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (!(param1 < param2)) {
            param4 = param3;
            param7 = param6;
            param10 = param9;
            param13 = param12;
            param20 = param19;
            var25 = var24;
            var28 = var27;
            var31 = var30;
            var34 = var33;
            if (param0 < 0.0f) {
              param3 = param3 - var36 * param0;
              param4 = param4 - var54Lifetime1 * param0;
              param6 = param6 - var37 * param0;
              param7 = param7 - var55 * param0;
              param9 = param9 - var38 * param0;
              param10 = param10 - var56 * param0;
              param12 = param12 - var39 * param0;
              param13 = param13 - var57 * param0;
              param19 = (int)((float)param19 - var40 * param0);
              param20 = (int)((float)param20 - var58 * param0);
              var24 = var24 - var41 * param0;
              var25 = var25 - var59 * param0;
              var27 = var27 - var41 * param0;
              var28 = var28 - var59 * param0;
              var30 = var30 - var41 * param0;
              var31 = var31 - var59 * param0;
              var33 = var33 - var41 * param0;
              var34 = var34 - var59 * param0;
              param0 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var45Lifetime1 * param2;
              param8 = param8 - var46 * param2;
              param11 = param11 - var47 * param2;
              param14 = param14 - var48 * param2;
              param21 = (int)((float)param21 - var49 * param2);
              var26 = var26 - var50 * param2;
              var29 = var29 - var51 * param2;
              var32 = var32 - var52 * param2;
              var35 = var35 - var53 * param2;
              param2 = 0.0f;
            }
            if ((param0 == param2 ||
              !(var54Lifetime1 < var36)) &&
              (param0 != param2 ||
              !(var45Lifetime1 > var36))) {
              param1 = param1 - param2;
              param2 = param2 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param2 = param2 - 1.0f;
                if (param2 >= 0.0f) {
                  this.b(this.field_a, this.field_w, (int)param0, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                  param4 = param4 + var54Lifetime1;
                  param3 = param3 + var36;
                  param7 = param7 + var55;
                  param6 = param6 + var37;
                  param10 = param10 + var56;
                  param9 = param9 + var38;
                  param13 = param13 + var57;
                  param12 = param12 + var39;
                  param20 = (int)((float)param20 + var58);
                  param19 = (int)((float)param19 + var40);
                  var25 = var25 + var59;
                  var24 = var24 + var41;
                  var28 = var28 + var60;
                  var27 = var27 + var42;
                  var31 = var31 + var61;
                  var30 = var30 + var43;
                  var34 = var34 + var62;
                  var33 = var33 + var44;
                  param0 = param0 + (float)this.field_t;
                  continue;
                }
                break;
              }
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  return;
                }
                this.b(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                param3 = param3 + var36;
                param5 = param5 + var45Lifetime1;
                param6 = param6 + var37;
                param8 = param8 + var46;
                param9 = param9 + var38;
                param11 = param11 + var47;
                param12 = param12 + var39;
                param14 = param14 + var48;
                param19 = (int)((float)param19 + var40);
                param21 = (int)((float)param21 + var49);
                var24 = var24 + var41;
                var26 = var26 + var50;
                var27 = var27 + var42;
                var29 = var29 + var51;
                var30 = var30 + var43;
                var32 = var32 + var52;
                var33 = var33 + var44;
                var35 = var35 + var53;
                param0 = param0 + (float)this.field_t;
              }
            }
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (param2 >= 0.0f) {
                this.b(this.field_a, this.field_w, (int)param0, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                param3 = param3 + var36;
                param4 = param4 + var54Lifetime1;
                param6 = param6 + var37;
                param7 = param7 + var55;
                param9 = param9 + var38;
                param10 = param10 + var56;
                param12 = param12 + var39;
                param13 = param13 + var57;
                param19 = (int)((float)param19 + var40);
                param20 = (int)((float)param20 + var58);
                var24 = var24 + var41;
                var25 = var25 + var59;
                var27 = var27 + var42;
                var28 = var28 + var60;
                var30 = var30 + var43;
                var31 = var31 + var61;
                var33 = var33 + var44;
                var34 = var34 + var62;
                param0 = param0 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                return;
              }
              this.b(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
              param5 = param5 + var45Lifetime1;
              param3 = param3 + var36;
              param8 = param8 + var46;
              param6 = param6 + var37;
              param11 = param11 + var47;
              param9 = param9 + var38;
              param14 = param14 + var48;
              param12 = param12 + var39;
              param21 = (int)((float)param21 + var49);
              param19 = (int)((float)param19 + var40);
              var26 = var26 + var50;
              var24 = var24 + var41;
              var29 = var29 + var51;
              var27 = var27 + var42;
              var32 = var32 + var52;
              var30 = var30 + var43;
              var35 = var35 + var53;
              var33 = var33 + var44;
              param0 = param0 + (float)this.field_t;
            }
          }
          param5 = param3;
          param8 = param6;
          param11 = param9;
          param14 = param12;
          param21 = param19;
          var26 = var24;
          var29 = var27;
          var32 = var30;
          var35 = var33;
          if (param0 < 0.0f) {
            param3 = param3 - var36 * param0;
            param5 = param5 - var54Lifetime1 * param0;
            param6 = param6 - var37 * param0;
            param8 = param8 - var55 * param0;
            param9 = param9 - var38 * param0;
            param11 = param11 - var56 * param0;
            param12 = param12 - var39 * param0;
            param14 = param14 - var57 * param0;
            param19 = (int)((float)param19 - var40 * param0);
            param21 = (int)((float)param21 - var58 * param0);
            var24 = var24 - var41 * param0;
            var26 = var26 - var59 * param0;
            var27 = var27 - var41 * param0;
            var29 = var29 - var59 * param0;
            var30 = var30 - var41 * param0;
            var32 = var32 - var59 * param0;
            var33 = var33 - var41 * param0;
            var35 = var35 - var59 * param0;
            param0 = 0.0f;
          }
          if (param1 < 0.0f) {
            param4 = param4 - var45Lifetime1 * param1;
            param7 = param7 - var46 * param1;
            param10 = param10 - var47 * param1;
            param13 = param13 - var48 * param1;
            param20 = (int)((float)param20 - var49 * param1);
            var25 = var25 - var50 * param1;
            var28 = var28 - var51 * param1;
            var31 = var31 - var52 * param1;
            var34 = var34 - var53 * param1;
            param1 = 0.0f;
          }
          if ((param0 == param1 ||
            !(var54Lifetime1 < var36)) &&
            (param0 != param1 ||
            !(var54Lifetime1 > var45Lifetime1))) {
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (param1 >= 0.0f) {
                this.b(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                param3 = param3 + var36;
                param5 = param5 + var54Lifetime1;
                param6 = param6 + var37;
                param8 = param8 + var55;
                param9 = param9 + var38;
                param11 = param11 + var56;
                param12 = param12 + var39;
                param14 = param14 + var57;
                param19 = (int)((float)param19 + var40);
                param21 = (int)((float)param21 + var58);
                var24 = var24 + var41;
                var26 = var26 + var59;
                var27 = var27 + var42;
                var29 = var29 + var60;
                var30 = var30 + var43;
                var32 = var32 + var61;
                var33 = var33 + var44;
                var35 = var35 + var62;
                param0 = param0 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                return;
              }
              this.b(this.field_a, this.field_w, (int)param0, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
              param4 = param4 + var45Lifetime1;
              param5 = param5 + var54Lifetime1;
              param7 = param7 + var46;
              param8 = param8 + var55;
              param10 = param10 + var47;
              param11 = param11 + var56;
              param13 = param13 + var48;
              param14 = param14 + var57;
              param20 = (int)((float)param20 + var49);
              param21 = (int)((float)param21 + var58);
              var25 = var25 + var50;
              var26 = var26 + var59;
              var28 = var28 + var51;
              var29 = var29 + var60;
              var31 = var31 + var52;
              var32 = var32 + var61;
              var34 = var34 + var53;
              var35 = var35 + var62;
              param0 = param0 + (float)this.field_t;
            }
          }
          param2 = param2 - param1;
          param1 = param1 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param1 = param1 - 1.0f;
            if (param1 >= 0.0f) {
              this.b(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
              param3 = param3 + var36;
              param5 = param5 + var54Lifetime1;
              param6 = param6 + var37;
              param8 = param8 + var55;
              param9 = param9 + var38;
              param11 = param11 + var56;
              param12 = param12 + var39;
              param14 = param14 + var57;
              param19 = (int)((float)param19 + var40);
              param21 = (int)((float)param21 + var58);
              var24 = var24 + var41;
              var26 = var26 + var59;
              var27 = var27 + var42;
              var29 = var29 + var60;
              var30 = var30 + var43;
              var32 = var32 + var61;
              var33 = var33 + var44;
              var35 = var35 + var62;
              param0 = param0 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              return;
            }
            this.b(this.field_a, this.field_w, (int)param0, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
            param4 = param4 + var45Lifetime1;
            param5 = param5 + var54Lifetime1;
            param7 = param7 + var46;
            param8 = param8 + var55;
            param10 = param10 + var47;
            param11 = param11 + var56;
            param13 = param13 + var48;
            param14 = param14 + var57;
            param20 = (int)((float)param20 + var49);
            param21 = (int)((float)param21 + var58);
            var25 = var25 + var50;
            var26 = var26 + var59;
            var28 = var28 + var51;
            var29 = var29 + var60;
            var31 = var31 + var52;
            var32 = var32 + var61;
            var34 = var34 + var53;
            var35 = var35 + var62;
            param0 = param0 + (float)this.field_t;
          }
        }
        if (!(param1 <= param2)) {
          if (param2 >= (float)this.field_v) {
            return;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (!(param0 < param1)) {
            param3 = param5;
            param6 = param8;
            param9 = param11;
            param12 = param14;
            param19 = param21;
            var24 = var26;
            var27 = var29;
            var30 = var32;
            var33 = var35;
            if (param2 < 0.0f) {
              param5 = param5 - var54Lifetime1 * param2;
              param3 = param3 - var45Lifetime1 * param2;
              param8 = param8 - var55 * param2;
              param6 = param6 - var46 * param2;
              param11 = param11 - var56 * param2;
              param9 = param9 - var47 * param2;
              param14 = param14 - var57 * param2;
              param12 = param12 - var48 * param2;
              param21 = (int)((float)param21 - var58 * 3.0f);
              param19 = (int)((float)param19 - var49 * param2);
              var26 = var26 - var59 * param2;
              var24 = var24 - var50 * param2;
              var29 = var29 - var60 * param2;
              var27 = var27 - var51 * param2;
              var32 = var32 - var61 * param2;
              var30 = var30 - var52 * param2;
              var35 = var35 - var62 * param2;
              var33 = var33 - var53 * param2;
              param2 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var36 * param1;
              param7 = param7 - var37 * param1;
              param10 = param10 - var38 * param1;
              param13 = param13 - var39 * param1;
              param20 = (int)((float)param20 - var40 * param1);
              var25 = var25 - var41 * param1;
              var28 = var28 - var42 * param1;
              var31 = var31 - var43 * param1;
              var34 = var34 - var44 * param1;
              param1 = 0.0f;
            }
            if (!(var45Lifetime1 < var54Lifetime1)) {
              param0 = param0 - param1;
              param1 = param1 - param2;
              param2 = (float)this.field_p[(int)param2];
              while (true) {
                param1 = param1 - 1.0f;
                if (param1 >= 0.0f) {
                  this.b(this.field_a, this.field_w, (int)param2, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                  param5 = param5 + var54Lifetime1;
                  param3 = param3 + var45Lifetime1;
                  param8 = param8 + var55;
                  param6 = param6 + var46;
                  param11 = param11 + var56;
                  param9 = param9 + var47;
                  param14 = param14 + var57;
                  param12 = param12 + var48;
                  param21 = (int)((float)param21 + var58);
                  param19 = (int)((float)param19 + var49);
                  var26 = var26 + var59;
                  var24 = var24 + var50;
                  var29 = var29 + var60;
                  var27 = var27 + var51;
                  var32 = var32 + var61;
                  var30 = var30 + var52;
                  var35 = var35 + var62;
                  var33 = var33 + var53;
                  param2 = param2 + (float)this.field_t;
                  continue;
                }
                break;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  return;
                }
                this.b(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                param5 = param5 + var54Lifetime1;
                param4 = param4 + var36;
                param8 = param8 + var55;
                param7 = param7 + var37;
                param11 = param11 + var56;
                param10 = param10 + var38;
                param14 = param14 + var57;
                param13 = param13 + var39;
                param21 = (int)((float)param21 + var58);
                param20 = (int)((float)param20 + var40);
                var26 = var26 + var59;
                var25 = var25 + var41;
                var29 = var29 + var60;
                var28 = var28 + var42;
                var32 = var32 + var61;
                var31 = var31 + var43;
                var35 = var35 + var62;
                var34 = var34 + var44;
                param2 = param2 + (float)this.field_t;
              }
            }
            param0 = param0 - param1;
            param1 = param1 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param1 = param1 - 1.0f;
              if (param1 >= 0.0f) {
                this.b(this.field_a, this.field_w, (int)param2, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                param3 = param3 + var45Lifetime1;
                param5 = param5 + var54Lifetime1;
                param6 = param6 + var46;
                param8 = param8 + var55;
                param9 = param9 + var47;
                param11 = param11 + var56;
                param12 = param12 + var48;
                param14 = param14 + var57;
                param19 = (int)((float)param19 + var49);
                param21 = (int)((float)param21 + var58);
                var24 = var24 + var50;
                var26 = var26 + var59;
                var27 = var27 + var51;
                var29 = var29 + var60;
                var30 = var30 + var52;
                var32 = var32 + var61;
                var33 = var33 + var53;
                var35 = var35 + var62;
                param2 = param2 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                return;
              }
              this.b(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
              param4 = param4 + var36;
              param5 = param5 + var54Lifetime1;
              param7 = param7 + var37;
              param8 = param8 + var55;
              param10 = param10 + var38;
              param11 = param11 + var56;
              param13 = param13 + var39;
              param14 = param14 + var57;
              param20 = (int)((float)param20 + var40);
              param21 = (int)((float)param21 + var58);
              var25 = var25 + var41;
              var26 = var26 + var59;
              var28 = var28 + var42;
              var29 = var29 + var60;
              var31 = var31 + var43;
              var32 = var32 + var61;
              var34 = var34 + var44;
              var35 = var35 + var62;
              param2 = param2 + (float)this.field_t;
            }
          }
          param4 = param5;
          param7 = param8;
          param10 = param11;
          param13 = param14;
          param20 = param21;
          var25 = var26;
          var28 = var29;
          var31 = var32;
          var34 = var35;
          if (param2 < 0.0f) {
            param5 = param5 - var54Lifetime1 * param2;
            param4 = param4 - var45Lifetime1 * param2;
            param8 = param8 - var55 * param2;
            param7 = param7 - var46 * param2;
            param11 = param11 - var56 * param2;
            param10 = param10 - var47 * param2;
            param14 = param14 - var57 * param2;
            param13 = param13 - var48 * param2;
            param21 = (int)((float)param21 - var58 * 3.0f);
            param20 = (int)((float)param20 - var49 * param2);
            var26 = var26 - var59 * param2;
            var25 = var25 - var50 * param2;
            var29 = var29 - var60 * param2;
            var28 = var28 - var51 * param2;
            var32 = var32 - var61 * param2;
            var31 = var31 - var52 * param2;
            var35 = var35 - var62 * param2;
            var34 = var34 - var53 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var36 * param0;
            param6 = param6 - var37 * param0;
            param9 = param9 - var38 * param0;
            param12 = param12 - var39 * param0;
            param19 = (int)((float)param19 - var40 * param0);
            var24 = var24 - var41 * param0;
            var27 = var27 - var42 * param0;
            var30 = var30 - var43 * param0;
            var33 = var33 - var44 * param0;
            param0 = 0.0f;
          }
          if (!(var45Lifetime1 < var54Lifetime1)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (param0 >= 0.0f) {
                this.b(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                param5 = param5 + var54Lifetime1;
                param4 = param4 + var45Lifetime1;
                param8 = param8 + var55;
                param7 = param7 + var46;
                param11 = param11 + var56;
                param10 = param10 + var47;
                param14 = param14 + var57;
                param13 = param13 + var48;
                param21 = (int)((float)param21 + var58);
                param20 = (int)((float)param20 + var49);
                var26 = var26 + var59;
                var25 = var25 + var50;
                var29 = var29 + var60;
                var28 = var28 + var51;
                var32 = var32 + var61;
                var31 = var31 + var52;
                var35 = var35 + var62;
                var34 = var34 + var53;
                param2 = param2 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                return;
              }
              this.b(this.field_a, this.field_w, (int)param2, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
              param3 = param3 + var36;
              param4 = param4 + var45Lifetime1;
              param6 = param6 + var37;
              param7 = param7 + var46;
              param9 = param9 + var38;
              param10 = param10 + var47;
              param12 = param12 + var39;
              param13 = param13 + var48;
              param19 = (int)((float)param19 + var40);
              param20 = (int)((float)param20 + var49);
              var24 = var24 + var41;
              var25 = var25 + var50;
              var27 = var27 + var42;
              var28 = var28 + var51;
              var30 = var30 + var43;
              var31 = var31 + var52;
              var33 = var33 + var44;
              var34 = var34 + var53;
              param2 = param2 + (float)this.field_t;
            }
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (param0 >= 0.0f) {
              this.b(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
              param4 = param4 + var45Lifetime1;
              param5 = param5 + var54Lifetime1;
              param7 = param7 + var46;
              param8 = param8 + var55;
              param10 = param10 + var47;
              param11 = param11 + var56;
              param13 = param13 + var48;
              param14 = param14 + var57;
              param20 = (int)((float)param20 + var49);
              param21 = (int)((float)param21 + var58);
              var25 = var25 + var50;
              var26 = var26 + var59;
              var28 = var28 + var51;
              var29 = var29 + var60;
              var31 = var31 + var52;
              var32 = var32 + var61;
              var34 = var34 + var53;
              var35 = var35 + var62;
              param2 = param2 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              return;
            }
            this.b(this.field_a, this.field_w, (int)param2, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
            param4 = param4 + var45Lifetime1;
            param3 = param3 + var36;
            param7 = param7 + var46;
            param6 = param6 + var37;
            param10 = param10 + var47;
            param9 = param9 + var38;
            param13 = param13 + var48;
            param12 = param12 + var39;
            param20 = (int)((float)param20 + var49);
            param19 = (int)((float)param19 + var40);
            var25 = var25 + var50;
            var24 = var24 + var41;
            var28 = var28 + var51;
            var27 = var27 + var42;
            var31 = var31 + var52;
            var30 = var30 + var43;
            var34 = var34 + var53;
            var33 = var33 + var44;
            param2 = param2 + (float)this.field_t;
          }
        }
        if (param1 >= (float)this.field_v) {
          return;
        }
        if (param2 > (float)this.field_v) {
          param2 = (float)this.field_v;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (!(param2 < param0)) {
          param5 = param4;
          param8 = param7;
          param11 = param10;
          param14 = param13;
          param21 = param20;
          var26 = var25;
          var29 = var28;
          var32 = var31;
          var35 = var34;
          if (param1 < 0.0f) {
            param5 = param5 - var36 * param1;
            param4 = param4 - var45Lifetime1 * param1;
            param8 = param8 - var37 * param1;
            param7 = param7 - var46 * param1;
            param11 = param11 - var38 * param1;
            param10 = param10 - var47 * param1;
            param14 = param14 - var39 * param1;
            param13 = param13 - var48 * param1;
            param21 = (int)((float)param21 - var40 * param1);
            param20 = (int)((float)param20 - var49 * param1);
            var26 = var26 - var41 * param1;
            var25 = var25 - var50 * param1;
            var29 = var29 - var42 * param1;
            var28 = var28 - var51 * param1;
            var32 = var32 - var43 * param1;
            var31 = var31 - var52 * param1;
            var35 = var35 - var44 * param1;
            var34 = var34 - var53 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var54Lifetime1 * param0;
            param6 = param6 - var55 * param0;
            param9 = param9 - var56 * param0;
            param12 = param12 - var57 * param0;
            param19 = (int)((float)param19 - var58 * param0);
            var24 = var24 - var59 * param0;
            var27 = var27 - var60 * param0;
            var30 = var30 - var61 * param0;
            var33 = var33 - var62 * param0;
            param0 = 0.0f;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          if (!(var36 < var45Lifetime1)) {
            while (true) {
              param0 = param0 - 1.0f;
              if (param0 >= 0.0f) {
                this.b(this.field_a, this.field_w, (int)param1, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                param4 = param4 + var45Lifetime1;
                param5 = param5 + var36;
                param7 = param7 + var46;
                param8 = param8 + var37;
                param10 = param10 + var47;
                param11 = param11 + var38;
                param13 = param13 + var48;
                param14 = param14 + var39;
                param20 = (int)((float)param20 + var49);
                param21 = (int)((float)param21 + var40);
                var25 = var25 + var50;
                var26 = var26 + var41;
                var28 = var28 + var51;
                var29 = var29 + var42;
                var31 = var31 + var52;
                var32 = var32 + var43;
                var34 = var34 + var53;
                var35 = var35 + var44;
                param1 = param1 + (float)this.field_t;
                continue;
              }
              break;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                return;
              }
              this.b(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
              param4 = param4 + var45Lifetime1;
              param3 = param3 + var54Lifetime1;
              param7 = param7 + var46;
              param6 = param6 + var55;
              param10 = param10 + var47;
              param9 = param9 + var56;
              param13 = param13 + var48;
              param12 = param12 + var57;
              param20 = (int)((float)param20 + var49);
              param19 = (int)((float)param19 + var58);
              var25 = var25 + var50;
              var24 = var24 + var59;
              var28 = var28 + var51;
              var27 = var27 + var60;
              var31 = var31 + var52;
              var30 = var30 + var61;
              var34 = var34 + var53;
              var33 = var33 + var62;
              param1 = param1 + (float)this.field_t;
            }
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (param0 >= 0.0f) {
              this.b(this.field_a, this.field_w, (int)param1, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
              param5 = param5 + var36;
              param4 = param4 + var45Lifetime1;
              param8 = param8 + var37;
              param7 = param7 + var46;
              param11 = param11 + var38;
              param10 = param10 + var47;
              param14 = param14 + var39;
              param13 = param13 + var48;
              param21 = (int)((float)param21 + var40);
              param20 = (int)((float)param20 + var49);
              var26 = var26 + var41;
              var25 = var25 + var50;
              var29 = var29 + var42;
              var28 = var28 + var51;
              var32 = var32 + var43;
              var31 = var31 + var52;
              var35 = var35 + var44;
              var34 = var34 + var53;
              param1 = param1 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              return;
            }
            this.b(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
            param3 = param3 + var54Lifetime1;
            param4 = param4 + var45Lifetime1;
            param6 = param6 + var55;
            param7 = param7 + var46;
            param9 = param9 + var56;
            param10 = param10 + var47;
            param12 = param12 + var57;
            param13 = param13 + var48;
            param19 = (int)((float)param19 + var58);
            param20 = (int)((float)param20 + var49);
            var24 = var24 + var59;
            var25 = var25 + var50;
            var27 = var27 + var60;
            var28 = var28 + var51;
            var30 = var30 + var61;
            var31 = var31 + var52;
            var33 = var33 + var62;
            var34 = var34 + var53;
            param1 = param1 + (float)this.field_t;
          }
        }
        param3 = param4;
        param6 = param7;
        param9 = param10;
        param12 = param13;
        param19 = param20;
        var24Lifetime1 = var25;
        var27Lifetime1 = var28;
        var30Lifetime1 = var31;
        var33Lifetime1 = var34;
        if (param1 < 0.0f) {
          param3 = param3 - var36 * param1;
          param4 = param4 - var45Lifetime1 * param1;
          param6 = param6 - var37 * param1;
          param7 = param7 - var46 * param1;
          param9 = param9 - var38 * param1;
          param10 = param10 - var47 * param1;
          param12 = param12 - var39 * param1;
          param13 = param13 - var48 * param1;
          param19 = (int)((float)param19 - var40 * param1);
          param20 = (int)((float)param20 - var49 * param1);
          var24Lifetime1 = var24Lifetime1 - var41 * param1;
          var25 = var25 - var50 * param1;
          var27Lifetime1 = var27Lifetime1 - var42 * param1;
          var28 = var28 - var51 * param1;
          var30Lifetime1 = var30Lifetime1 - var43 * param1;
          var31 = var31 - var52 * param1;
          var33Lifetime1 = var33Lifetime1 - var44 * param1;
          var34 = var34 - var53 * param1;
          param1 = 0.0f;
        }
        if (param2 < 0.0f) {
          param5 = param5 - var54Lifetime1 * param2;
          param8 = param8 - var55 * param2;
          param11 = param11 - var56 * param2;
          param14 = param14 - var57 * param2;
          param21 = (int)((float)param21 - var58 * param2);
          var26 = var26 - var59 * param2;
          var29 = var29 - var60 * param2;
          var32 = var32 - var61 * param2;
          var35 = var35 - var62 * param2;
          param2 = 0.0f;
        }
        if ((param1 == param2 ||
          !(var36 < var45Lifetime1)) &&
          (param1 != param2 ||
          !(var36 > var54Lifetime1))) {
          param0 = param0 - param2;
          param2 = param2 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param2 = param2 - 1.0f;
            if (param2 >= 0.0f) {
              this.b(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24Lifetime1, var28, var27Lifetime1, var31, var30Lifetime1, var34, var33Lifetime1);
              param4 = param4 + var45Lifetime1;
              param3 = param3 + var36;
              param7 = param7 + var46;
              param6 = param6 + var37;
              param10 = param10 + var47;
              param9 = param9 + var38;
              param13 = param13 + var48;
              param12 = param12 + var39;
              param20 = (int)((float)param20 + var49);
              param19 = (int)((float)param19 + var40);
              var25 = var25 + var50;
              var24Lifetime1 = var24Lifetime1 + var41;
              var28 = var28 + var51;
              var27Lifetime1 = var27Lifetime1 + var42;
              var31 = var31 + var52;
              var30Lifetime1 = var30Lifetime1 + var43;
              var34 = var34 + var53;
              var33Lifetime1 = var33Lifetime1 + var44;
              param1 = param1 + (float)this.field_t;
              continue;
            }
            break;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              return;
            }
            this.b(this.field_a, this.field_w, (int)param1, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24Lifetime1, var29, var27Lifetime1, var32, var30Lifetime1, var35, var33Lifetime1);
            param5 = param5 + var54Lifetime1;
            param3 = param3 + var36;
            param8 = param8 + var55;
            param6 = param6 + var37;
            param11 = param11 + var56;
            param9 = param9 + var38;
            param14 = param14 + var57;
            param12 = param12 + var39;
            param21 = (int)((float)param21 + var58);
            param19 = (int)((float)param19 + var40);
            var26 = var26 + var59;
            var24Lifetime1 = var24Lifetime1 + var41;
            var29 = var29 + var60;
            var27Lifetime1 = var27Lifetime1 + var42;
            var32 = var32 + var61;
            var30Lifetime1 = var30Lifetime1 + var43;
            var35 = var35 + var62;
            var33Lifetime1 = var33Lifetime1 + var44;
            param1 = param1 + (float)this.field_t;
          }
        }
        param0 = param0 - param2;
        param2 = param2 - param1;
        param1 = (float)this.field_p[(int)param1];
        while (true) {
          param2 = param2 - 1.0f;
          if (param2 >= 0.0f) {
            this.b(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24Lifetime1, var25, var27Lifetime1, var28, var30Lifetime1, var31, var33Lifetime1, var34);
            param3 = param3 + var36;
            param4 = param4 + var45Lifetime1;
            param6 = param6 + var37;
            param7 = param7 + var46;
            param9 = param9 + var38;
            param10 = param10 + var47;
            param12 = param12 + var39;
            param13 = param13 + var48;
            param19 = (int)((float)param19 + var40);
            param20 = (int)((float)param20 + var49);
            var24Lifetime1 = var24Lifetime1 + var41;
            var25 = var25 + var50;
            var27Lifetime1 = var27Lifetime1 + var42;
            var28 = var28 + var51;
            var30Lifetime1 = var30Lifetime1 + var43;
            var31 = var31 + var52;
            var33Lifetime1 = var33Lifetime1 + var44;
            var34 = var34 + var53;
            param1 = param1 + (float)this.field_t;
            continue;
          }
          break;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            return;
          }
          this.b(this.field_a, this.field_w, (int)param1, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24Lifetime1, var26, var27Lifetime1, var29, var30Lifetime1, var32, var33Lifetime1, var35);
          param3 = param3 + var36;
          param5 = param5 + var54Lifetime1;
          param6 = param6 + var37;
          param8 = param8 + var55;
          param9 = param9 + var38;
          param11 = param11 + var56;
          param12 = param12 + var39;
          param14 = param14 + var57;
          param19 = (int)((float)param19 + var40);
          param21 = (int)((float)param21 + var58);
          var24Lifetime1 = var24Lifetime1 + var41;
          var26 = var26 + var59;
          var27Lifetime1 = var27Lifetime1 + var42;
          var29 = var29 + var60;
          var30Lifetime1 = var30Lifetime1 + var43;
          var32 = var32 + var61;
          var33Lifetime1 = var33Lifetime1 + var44;
          var35 = var35 + var62;
          param1 = param1 + (float)this.field_t;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        if (this.field_s) {
          this.field_k.b((int)param0, param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
        float var11 = param4 - param3;
        float var12 = param1 - param0;
        float var13 = param5 - param3;
        float var14 = param2 - param0;
        float var15 = param7 - param6;
        float var16 = param8 - param6;
        float var17 = 0.0f;
        if (param1 != param0) {
          var17 = (param4 - param3) / (param1 - param0);
        }
        float var18 = 0.0f;
        if (param2 != param1) {
          var18 = (param5 - param4) / (param2 - param1);
        }
        float var19 = 0.0f;
        if (param2 != param0) {
          var19 = (param3 - param5) / (param0 - param2);
        }
        float var20 = var11 * var14 - var13 * var12;
        if (var20 == 0.0f) {
          return;
        }
        float var21 = (var15 * var14 - var16 * var12) / var20;
        float var22 = (var16 * var11 - var15 * var13) / var20;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          param6 = param6 - var21 * param3 + var21;
          if (param1 < param2) {
            param5 = param3;
            if (param0 < 0.0f) {
              param5 = param5 - var19 * param0;
              param3 = param3 - var17 * param0;
              param6 = param6 - var22 * param0;
              param0 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var18 * param1;
              param1 = 0.0f;
            }
            if (param0 != param1 &&
              var19 < var17) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (!(var19 > var18)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
              param5 = param5 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
              param5 = param5 + var19;
              param4 = param4 + var18;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param4 = param3;
          if (param0 < 0.0f) {
            param4 = param4 - var19 * param0;
            param3 = param3 - var17 * param0;
            param6 = param6 - var22 * param0;
            param0 = 0.0f;
          }
          if (param2 < 0.0f) {
            param5 = param5 - var18 * param2;
            param2 = 0.0f;
          }
          if (param0 != param2 &&
            var19 < var17) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (!(var18 > var17)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
            param4 = param4 + var19;
            param3 = param3 + var17;
            param6 = param6 + var22;
            param0 = param0 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
            param5 = param5 + var18;
            param3 = param3 + var17;
            param6 = param6 + var22;
            param0 = param0 + (float)this.field_t;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_v) {
            return;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          param7 = param7 - var21 * param4 + var21;
          if (param2 < param0) {
            param3 = param4;
            if (param1 < 0.0f) {
              param3 = param3 - var17 * param1;
              param4 = param4 - var18 * param1;
              param7 = param7 - var22 * param1;
              param1 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var19 * param2;
              param2 = 0.0f;
            }
            if (param1 != param2 &&
              var17 < var18) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (!(var17 > var19)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
              param3 = param3 + var17;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
              param3 = param3 + var17;
              param5 = param5 + var19;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param5 = param4;
          if (param1 < 0.0f) {
            param5 = param5 - var17 * param1;
            param4 = param4 - var18 * param1;
            param7 = param7 - var22 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var19 * param0;
            param0 = 0.0f;
          }
          if (!(var17 < var18)) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
              param5 = param5 + var17;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
              param3 = param3 + var19;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
            param5 = param5 + var17;
            param4 = param4 + var18;
            param7 = param7 + var22;
            param1 = param1 + (float)this.field_t;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
            param3 = param3 + var19;
            param4 = param4 + var18;
            param7 = param7 + var22;
            param1 = param1 + (float)this.field_t;
          }
          return;
        }
        if (param2 >= (float)this.field_v) {
          return;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (param1 > (float)this.field_v) {
          param1 = (float)this.field_v;
        }
        param8 = param8 - var21 * param5 + var21;
        if (param0 < param1) {
          param4 = param5;
          if (param2 < 0.0f) {
            param4 = param4 - var18 * param2;
            param5 = param5 - var19 * param2;
            param8 = param8 - var22 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var17 * param0;
            param0 = 0.0f;
          }
          if (!(var18 < var19)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
              param4 = param4 + var18;
              param5 = param5 + var19;
              param8 = param8 + var22;
              param2 = param2 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
              param4 = param4 + var18;
              param3 = param3 + var17;
              param8 = param8 + var22;
              param2 = param2 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
            param4 = param4 + var18;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
            param4 = param4 + var18;
            param3 = param3 + var17;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param3 = param5;
        if (param2 < 0.0f) {
          param3 = param3 - var18 * param2;
          param5 = param5 - var19 * param2;
          param8 = param8 - var22 * param2;
          param2 = 0.0f;
        }
        if (param1 < 0.0f) {
          param4 = param4 - var17 * param1;
          param1 = 0.0f;
        }
        if (!(var18 < var19)) {
          param0 = param0 - param1;
          param1 = param1 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
            param3 = param3 + var18;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
            param4 = param4 + var17;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_p[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
          param3 = param3 + var18;
          param5 = param5 + var19;
          param8 = param8 + var22;
          param2 = param2 + (float)this.field_t;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
          param4 = param4 + var17;
          param5 = param5 + var19;
          param8 = param8 + var22;
          param2 = param2 + (float)this.field_t;
        }
    }

    private final void b(int[] param0, int[] param1, int param2, int param3, int param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, float param15, float param16, float param17, float param18, float param19, float param20) {
        int incrementValue$0 = 0;
        int stackIn_28_0 = 0;
        int var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var22Lifetime1;
        int var36Lifetime1;
        var22 = param4 - param3;
        var23 = 1.0f / (float)var22;
        var24 = (param6 - param5) * var23;
        var25 = (param8 - param7) * var23;
        var26 = (param10 - param9) * var23;
        var27 = (param12 - param11) * var23;
        var28 = (param14 - param13) * var23;
        var29 = (param16 - param15) * var23;
        var30 = (param18 - param17) * var23;
        var31 = (param20 - param19) * var23;
        if (this.field_q) {
          if (param4 > this.field_h) {
            param4 = this.field_h;
          }
          if (param3 < 0) {
            param5 = param5 - var24 * (float)param3;
            param7 = param7 - var25 * (float)param3;
            param9 = param9 - var26 * (float)param3;
            param11 = param11 - var27 * (float)param3;
            param13 = param13 - var28 * (float)param3;
            param15 = param15 - var29 * (float)param3;
            param17 = param17 - var30 * (float)param3;
            param19 = param19 - var31 * (float)param3;
            param3 = 0;
          }
        }
        if (param3 >= param4) {
          return;
        }
        var22Lifetime1 = param4 - param3;
        param2 = param2 + param3;
        while (true) {
          incrementValue$0 = var22Lifetime1;
          var22Lifetime1--;
          if (incrementValue$0 <= 0) {
            return;
          }
          var32 = 1.0f / param5;
          if (var32 < this.field_u[param2]) {
            var33 = (int)(param7 * var32 * (float)this.field_i);
            if (!this.field_d) {
              if (var33 >= 0) {
                if (var33 > this.field_r) {
                  var33 = this.field_r;
                }
              } else {
                var33 = 0;
              }
            } else {
              var33 = var33 & this.field_r;
            }
            var34 = (int)(param9 * var32 * (float)this.field_i);
            if (!this.field_d) {
              if (var34 >= 0) {
                if (var34 > this.field_r) {
                  var34 = this.field_r;
                }
              } else {
                var34 = 0;
              }
            } else {
              var34 = var34 & this.field_r;
            }
            var35 = this.field_w[var34 * this.field_i + var33];
            var36 = 255;
            if (this.field_f != 2) {
              if (this.field_f != 1) {
                var36Lifetime1 = (int)param13;
              } else {
                stackIn_28_0 = (var35 != 0) ? 255 : 0;
                var36Lifetime1 = stackIn_28_0;
              }
            } else {
              var36Lifetime1 = var35 >> 24 & 255;
            }
            if (var36Lifetime1 != 0) {
              if (var36Lifetime1 == 255) {
                var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                if (param11 != 0.0f) {
                  var38 = (int)(255.0f - param11);
                  var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                  var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                }
                param0[param2] = var36Lifetime1 << 24 | var37;
                this.field_u[param2] = var32;
              } else {
                var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                if (param11 != 0.0f) {
                  var38 = (int)(255.0f - param11);
                  var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                  var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                }
                var38 = param0[param2];
                var39 = 255 - var36Lifetime1;
                var37 = ((var38 & 16711935) * var39 + (var37 & 16711935) * var36Lifetime1 & -16711936) + ((var38 & 65280) * var39 + (var37 & 65280) * var36Lifetime1 & 16711680) >> 8;
                param0[param2] = (var36Lifetime1 | param0[param2] >> 24) << 24 | var37;
                this.field_u[param2] = var32;
              }
            }
          }
          param2++;
          param5 = param5 + var24;
          param7 = param7 + var25;
          param9 = param9 + var26;
          param11 = param11 + var27;
          param13 = param13 + var28;
          param15 = param15 + var29;
          param17 = param17 + var30;
          param19 = param19 + var31;
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9, int param10, int param11) {
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var37Lifetime1;
        float var37Lifetime2;
        float var38Lifetime1;
        float var38Lifetime2;
        float var39Lifetime1;
        float var39Lifetime2;
        if (this.field_s) {
          this.field_k.b((int)param0, -16777216 | param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, -16777216 | param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, -16777216 | param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
        float var13 = param4 - param3;
        float var14 = param1 - param0;
        float var15 = param5 - param3;
        float var16 = param2 - param0;
        float var17 = param7 - param6;
        float var18 = param8 - param6;
        float var19 = (float)((param10 & 16711680) - (param9 & 16711680));
        float var20 = (float)((param11 & 16711680) - (param9 & 16711680));
        float var21 = (float)((param10 & 65280) - (param9 & 65280));
        float var22 = (float)((param11 & 65280) - (param9 & 65280));
        float var23 = (float)((param10 & 255) - (param9 & 255));
        float var24 = (float)((param11 & 255) - (param9 & 255));
        if (param2 != param1) {
          var25 = (param5 - param4) / (param2 - param1);
        } else {
          var25 = 0.0f;
        }
        if (param1 != param0) {
          var26 = var13 / var14;
        } else {
          var26 = 0.0f;
        }
        if (param2 != param0) {
          var27 = var15 / var16;
        } else {
          var27 = 0.0f;
        }
        float var28 = var13 * var16 - var15 * var14;
        if (var28 == 0.0f) {
          return;
        }
        float var29 = (var17 * var16 - var18 * var14) / var28;
        float var30 = (var18 * var13 - var17 * var15) / var28;
        float var31 = (var19 * var16 - var20 * var14) / var28;
        float var32 = (var20 * var13 - var19 * var15) / var28;
        float var33 = (var21 * var16 - var22 * var14) / var28;
        float var34 = (var22 * var13 - var21 * var15) / var28;
        float var35 = (var23 * var16 - var24 * var14) / var28;
        float var36 = (var24 * var13 - var23 * var15) / var28;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          param6 = param6 - var29 * param3 + var29;
          var37 = (float)(param9 & 16711680) - var31 * param3 + var31;
          var38 = (float)(param9 & 65280) - var33 * param3 + var33;
          var39 = (float)(param9 & 255) - var35 * param3 + var35;
          if (param1 < param2) {
            param5 = param3;
            if (param0 < 0.0f) {
              param5 = param5 - var27 * param0;
              param3 = param3 - var26 * param0;
              param6 = param6 - var30 * param0;
              var37 = var37 - var32 * param0;
              var38 = var38 - var34 * param0;
              var39 = var39 - var36 * param0;
              param0 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var25 * param1;
              param1 = 0.0f;
            }
            if (param0 != param1 &&
              var27 < var26) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (!(var27 > var25)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var27;
              param4 = param4 + var25;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param4 = param3;
          if (param0 < 0.0f) {
            param4 = param4 - var27 * param0;
            param3 = param3 - var26 * param0;
            param6 = param6 - var30 * param0;
            var37 = var37 - var32 * param0;
            var38 = var38 - var34 * param0;
            var39 = var39 - var36 * param0;
            param0 = 0.0f;
          }
          if (param2 < 0.0f) {
            param5 = param5 - var25 * param2;
            param2 = 0.0f;
          }
          if (param0 != param2 &&
            var27 < var26) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (!(var25 > var26)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
            param4 = param4 + var27;
            param3 = param3 + var26;
            param6 = param6 + var30;
            var37 = var37 + var32;
            var38 = var38 + var34;
            var39 = var39 + var36;
            param0 = param0 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
            param5 = param5 + var25;
            param3 = param3 + var26;
            param6 = param6 + var30;
            var37 = var37 + var32;
            var38 = var38 + var34;
            var39 = var39 + var36;
            param0 = param0 + (float)this.field_t;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_v) {
            return;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          param7 = param7 - var29 * param4 + var29;
          var37Lifetime1 = (float)(param10 & 16711680) - var31 * param4 + var31;
          var38Lifetime1 = (float)(param10 & 65280) - var33 * param4 + var33;
          var39Lifetime1 = (float)(param10 & 255) - var35 * param4 + var35;
          if (param2 < param0) {
            param3 = param4;
            if (param1 < 0.0f) {
              param3 = param3 - var26 * param1;
              param4 = param4 - var25 * param1;
              param7 = param7 - var30 * param1;
              var37Lifetime1 = var37Lifetime1 - var32 * param1;
              var38Lifetime1 = var38Lifetime1 - var34 * param1;
              var39Lifetime1 = var39Lifetime1 - var36 * param1;
              param1 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var27 * param2;
              param2 = 0.0f;
            }
            if (param1 != param2 &&
              var26 < var25) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (!(var26 > var27)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var26;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var26;
              param5 = param5 + var27;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param5 = param4;
          if (param1 < 0.0f) {
            param5 = param5 - var26 * param1;
            param4 = param4 - var25 * param1;
            param7 = param7 - var30 * param1;
            var37Lifetime1 = var37Lifetime1 - var32 * param1;
            var38Lifetime1 = var38Lifetime1 - var34 * param1;
            var39Lifetime1 = var39Lifetime1 - var36 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var27 * param0;
            param0 = 0.0f;
          }
          if (!(var26 < var25)) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param5 = param5 + var26;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var27;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
            param5 = param5 + var26;
            param4 = param4 + var25;
            param7 = param7 + var30;
            var37Lifetime1 = var37Lifetime1 + var32;
            var38Lifetime1 = var38Lifetime1 + var34;
            var39Lifetime1 = var39Lifetime1 + var36;
            param1 = param1 + (float)this.field_t;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
            param3 = param3 + var27;
            param4 = param4 + var25;
            param7 = param7 + var30;
            var37Lifetime1 = var37Lifetime1 + var32;
            var38Lifetime1 = var38Lifetime1 + var34;
            var39Lifetime1 = var39Lifetime1 + var36;
            param1 = param1 + (float)this.field_t;
          }
          return;
        }
        if (param2 >= (float)this.field_v) {
          return;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (param1 > (float)this.field_v) {
          param1 = (float)this.field_v;
        }
        param8 = param8 - var29 * param5 + var29;
        var37Lifetime2 = (float)(param11 & 16711680) - var31 * param5 + var31;
        var38Lifetime2 = (float)(param11 & 65280) - var33 * param5 + var33;
        var39Lifetime2 = (float)(param11 & 255) - var35 * param5 + var35;
        if (param0 < param1) {
          param4 = param5;
          if (param2 < 0.0f) {
            param4 = param4 - var25 * param2;
            param5 = param5 - var27 * param2;
            param8 = param8 - var30 * param2;
            var37Lifetime2 = var37Lifetime2 - var32 * param2;
            var38Lifetime2 = var38Lifetime2 - var34 * param2;
            var39Lifetime2 = var39Lifetime2 - var36 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var26 * param0;
            param0 = 0.0f;
          }
          if (!(var25 < var27)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
              param4 = param4 + var25;
              param5 = param5 + var27;
              param8 = param8 + var30;
              var37Lifetime2 = var37Lifetime2 + var32;
              var38Lifetime2 = var38Lifetime2 + var34;
              var39Lifetime2 = var39Lifetime2 + var36;
              param2 = param2 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
              param4 = param4 + var25;
              param3 = param3 + var26;
              param8 = param8 + var30;
              var37Lifetime2 = var37Lifetime2 + var32;
              var38Lifetime2 = var38Lifetime2 + var34;
              var39Lifetime2 = var39Lifetime2 + var36;
              param2 = param2 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var25;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var25;
            param3 = param3 + var26;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param3 = param5;
        if (param2 < 0.0f) {
          param3 = param3 - var25 * param2;
          param5 = param5 - var27 * param2;
          param8 = param8 - var30 * param2;
          var37Lifetime2 = var37Lifetime2 - var32 * param2;
          var38Lifetime2 = var38Lifetime2 - var34 * param2;
          var39Lifetime2 = var39Lifetime2 - var36 * param2;
          param2 = 0.0f;
        }
        if (param1 < 0.0f) {
          param4 = param4 - var26 * param1;
          param1 = 0.0f;
        }
        if (!(var25 < var27)) {
          param0 = param0 - param1;
          param1 = param1 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param3 = param3 + var25;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var26;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_p[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
          param3 = param3 + var25;
          param5 = param5 + var27;
          param8 = param8 + var30;
          var37Lifetime2 = var37Lifetime2 + var32;
          var38Lifetime2 = var38Lifetime2 + var34;
          var39Lifetime2 = var39Lifetime2 + var36;
          param2 = param2 + (float)this.field_t;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
          param4 = param4 + var26;
          param5 = param5 + var27;
          param8 = param8 + var30;
          var37Lifetime2 = var37Lifetime2 + var32;
          var38Lifetime2 = var38Lifetime2 + var34;
          var39Lifetime2 = var39Lifetime2 + var36;
          param2 = param2 + (float)this.field_t;
        }
    }

    private final void b(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10) {
        int var12;
        int var13;
        int var14;
        if (this.field_q) {
          if (param6 > this.field_h) {
            param6 = this.field_h;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        param2 = param2 + (param5 - 1);
        param7 = param7 + param8 * (float)param5;
        param9 = param9 + param10 * (float)param5;
        if (!this.field_o.field_n) {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param0[param2] = bt.field_h[(int)param7];
                }
                param9 = param9 + param10;
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            } else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param3 = bt.field_h[(int)param7];
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  var14 = param0[param2];
                  param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param4--;
              } while (param4 > 0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            param4 = param6 - param5 >> 2;
            param8 = param8 * 4.0f;
            if (this.field_b == 0) {
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (!(param4 <= 0)) {
                param3 = bt.field_h[(int)param7];
                do {
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (param4 > 0) {
                param3 = bt.field_h[(int)param7];
                param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                do {
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
            }
          }
        } else {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param0[param2] = bt.field_h[(int)param7];
                  param1[param2] = param9;
                }
                param9 = param9 + param10;
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            } else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param3 = bt.field_h[(int)param7];
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  var14 = param0[param2];
                  param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                  param1[param2] = param9;
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param4--;
              } while (param4 > 0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            param4 = param6 - param5 >> 2;
            param8 = param8 * 4.0f;
            if (this.field_b == 0) {
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    param0[param2] = param3;
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (param4 <= 0) {
                return;
              }
              param3 = bt.field_h[(int)param7];
              do {
                param2++;
                if (param9 < param1[param2]) {
                  param0[param2] = param3;
                  param1[param2] = param9;
                }
                param9 = param9 + param10;
                param4--;
              } while (param4 > 0);
              decompiledFrameRemainder0 = false;
            }
            else {
              var12 = this.field_b;
              var13 = 256 - this.field_b;
              if (param4 > 0) {
                do {
                  param3 = bt.field_h[(int)param7];
                  param7 = param7 + param8;
                  param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
              param4 = param6 - param5 & 3;
              if (param4 > 0) {
                param3 = bt.field_h[(int)param7];
                param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                do {
                  param2++;
                  if (param9 < param1[param2]) {
                    var14 = param0[param2];
                    param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                    param1[param2] = param9;
                  }
                  param9 = param9 + param10;
                  param4--;
                } while (param4 > 0);
              }
            }
          }
        }

    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11) {
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        if (this.field_s) {
          this.field_k.b((int)param0, bt.field_h[(int)param9], (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, bt.field_h[(int)param9], (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, bt.field_h[(int)param9], (int)param5, (int)param0, 1, (int)param3);
          return;
        }
        float var13 = param4 - param3;
        float var14 = param1 - param0;
        float var15 = param5 - param3;
        float var16 = param2 - param0;
        float var17 = param10 - param9;
        float var18 = param11 - param9;
        float var19 = param7 - param6;
        float var20 = param8 - param6;
        if (param2 != param1) {
          var21 = (param5 - param4) / (param2 - param1);
        } else {
          var21 = 0.0f;
        }
        if (param1 != param0) {
          var22 = var13 / var14;
        } else {
          var22 = 0.0f;
        }
        if (param2 != param0) {
          var23 = var15 / var16;
        } else {
          var23 = 0.0f;
        }
        float var24 = var13 * var16 - var15 * var14;
        if (var24 == 0.0f) {
          return;
        }
        float var25 = (var17 * var16 - var18 * var14) / var24;
        float var26 = (var18 * var13 - var17 * var15) / var24;
        float var27 = (var19 * var16 - var20 * var14) / var24;
        float var28 = (var20 * var13 - var19 * var15) / var24;
        if (param0 <= param1 &&
          param0 <= param2) {
          if (param0 >= (float)this.field_v) {
            return;
          }
          if (param1 > (float)this.field_v) {
            param1 = (float)this.field_v;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          param9 = param9 - var25 * param3 + var25;
          param6 = param6 - var27 * param3 + var27;
          if (param1 < param2) {
            param5 = param3;
            if (param0 < 0.0f) {
              param5 = param5 - var23 * param0;
              param3 = param3 - var22 * param0;
              param9 = param9 - var26 * param0;
              param6 = param6 - var28 * param0;
              param0 = 0.0f;
            }
            if (param1 < 0.0f) {
              param4 = param4 - var21 * param1;
              param1 = 0.0f;
            }
            if (param0 != param1 &&
              var23 < var22) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                param5 = param5 + var23;
                param3 = param3 + var22;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
                param5 = param5 + var23;
                param4 = param4 + var21;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param3 = param3 + var22;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param4 = param4 + var21;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            if (!(var23 > var21)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_p[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param3 = param3 + var22;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                param5 = param5 + var23;
                param4 = param4 + var21;
                param9 = param9 + var26;
                param6 = param6 + var28;
                param0 = param0 + (float)this.field_t;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
              param5 = param5 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
              param5 = param5 + var23;
              param4 = param4 + var21;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param4 = param3;
          if (param0 < 0.0f) {
            param4 = param4 - var23 * param0;
            param3 = param3 - var22 * param0;
            param9 = param9 - var26 * param0;
            param6 = param6 - var28 * param0;
            param0 = 0.0f;
          }
          if (param2 < 0.0f) {
            param5 = param5 - var21 * param2;
            param2 = 0.0f;
          }
          if (param0 != param2 &&
            var23 < var22) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
              param4 = param4 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
              param5 = param5 + var21;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
              param4 = param4 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
              param5 = param5 + var21;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          if (!(var21 > var22)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_p[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
              param4 = param4 + var23;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
              param5 = param5 + var21;
              param3 = param3 + var22;
              param9 = param9 + var26;
              param6 = param6 + var28;
              param0 = param0 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_p[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
            param4 = param4 + var23;
            param3 = param3 + var22;
            param9 = param9 + var26;
            param6 = param6 + var28;
            param0 = param0 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
            param5 = param5 + var21;
            param3 = param3 + var22;
            param9 = param9 + var26;
            param6 = param6 + var28;
            param0 = param0 + (float)this.field_t;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_v) {
            return;
          }
          if (param2 > (float)this.field_v) {
            param2 = (float)this.field_v;
          }
          if (param0 > (float)this.field_v) {
            param0 = (float)this.field_v;
          }
          param10 = param10 - var25 * param4 + var25;
          param7 = param7 - var27 * param4 + var27;
          if (param2 < param0) {
            param3 = param4;
            if (param1 < 0.0f) {
              param3 = param3 - var22 * param1;
              param4 = param4 - var21 * param1;
              param10 = param10 - var26 * param1;
              param7 = param7 - var28 * param1;
              param1 = 0.0f;
            }
            if (param2 < 0.0f) {
              param5 = param5 - var23 * param2;
              param2 = 0.0f;
            }
            if (param1 != param2 &&
              var22 < var21) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                param3 = param3 + var22;
                param4 = param4 + var21;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
                param3 = param3 + var22;
                param5 = param5 + var23;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param4 = param4 + var21;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param5 = param5 + var23;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            if (!(var22 > var23)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param4 = param4 + var21;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                param3 = param3 + var22;
                param5 = param5 + var23;
                param10 = param10 + var26;
                param7 = param7 + var28;
                param1 = param1 + (float)this.field_t;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
              param3 = param3 + var22;
              param4 = param4 + var21;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
              param3 = param3 + var22;
              param5 = param5 + var23;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param5 = param4;
          if (param1 < 0.0f) {
            param5 = param5 - var22 * param1;
            param4 = param4 - var21 * param1;
            param10 = param10 - var26 * param1;
            param7 = param7 - var28 * param1;
            param1 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var23 * param0;
            param0 = 0.0f;
          }
          if (!(var22 < var21)) {
            param2 = param2 - param0;
            param0 = param0 - param1;
            param1 = (float)this.field_p[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param10, var25, param7, var27);
              param5 = param5 + var22;
              param4 = param4 + var21;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
              param3 = param3 + var23;
              param4 = param4 + var21;
              param10 = param10 + var26;
              param7 = param7 + var28;
              param1 = param1 + (float)this.field_t;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_p[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param10, var25, param7, var27);
            param5 = param5 + var22;
            param4 = param4 + var21;
            param10 = param10 + var26;
            param7 = param7 + var28;
            param1 = param1 + (float)this.field_t;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
            param3 = param3 + var23;
            param4 = param4 + var21;
            param10 = param10 + var26;
            param7 = param7 + var28;
            param1 = param1 + (float)this.field_t;
          }
          return;
        }
        if (param2 >= (float)this.field_v) {
          return;
        }
        if (param0 > (float)this.field_v) {
          param0 = (float)this.field_v;
        }
        if (param1 > (float)this.field_v) {
          param1 = (float)this.field_v;
        }
        param11 = param11 - var25 * param5 + var25;
        param8 = param8 - var27 * param5 + var27;
        if (param0 < param1) {
          param4 = param5;
          if (param2 < 0.0f) {
            param4 = param4 - var21 * param2;
            param5 = param5 - var23 * param2;
            param11 = param11 - var26 * param2;
            param8 = param8 - var28 * param2;
            param2 = 0.0f;
          }
          if (param0 < 0.0f) {
            param3 = param3 - var22 * param0;
            param0 = 0.0f;
          }
          if (!(var21 < var23)) {
            param1 = param1 - param0;
            param0 = param0 - param2;
            param2 = (float)this.field_p[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
              param4 = param4 + var21;
              param5 = param5 + var23;
              param11 = param11 + var26;
              param8 = param8 + var28;
              param2 = param2 + (float)this.field_t;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param11, var25, param8, var27);
              param4 = param4 + var21;
              param3 = param3 + var22;
              param11 = param11 + var26;
              param8 = param8 + var28;
              param2 = param2 + (float)this.field_t;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
            param4 = param4 + var21;
            param5 = param5 + var23;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param11, var25, param8, var27);
            param4 = param4 + var21;
            param3 = param3 + var22;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param3 = param5;
        if (param2 < 0.0f) {
          param3 = param3 - var21 * param2;
          param5 = param5 - var23 * param2;
          param11 = param11 - var26 * param2;
          param8 = param8 - var28 * param2;
          param2 = 0.0f;
        }
        if (param1 < 0.0f) {
          param4 = param4 - var22 * param1;
          param1 = 0.0f;
        }
        if (!(var21 < var23)) {
          param0 = param0 - param1;
          param1 = param1 - param2;
          param2 = (float)this.field_p[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param11, var25, param8, var27);
            param3 = param3 + var21;
            param5 = param5 + var23;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
            param4 = param4 + var22;
            param5 = param5 + var23;
            param11 = param11 + var26;
            param8 = param8 + var28;
            param2 = param2 + (float)this.field_t;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_p[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param11, var25, param8, var27);
          param3 = param3 + var21;
          param5 = param5 + var23;
          param11 = param11 + var26;
          param8 = param8 + var28;
          param2 = param2 + (float)this.field_t;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
          param4 = param4 + var22;
          param5 = param5 + var23;
          param11 = param11 + var26;
          param8 = param8 + var28;
          param2 = param2 + (float)this.field_t;
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var12Lifetime1Lifetime3;
        int var12Lifetime1Lifetime4;
        if (this.field_q) {
          if (param6 > this.field_h) {
            param6 = this.field_h;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        param2 = param2 + (param5 - 1);
        param4 = param6 - param5 >> 2;
        param7 = param7 + param8 * (float)param5;
        if (!this.field_o.field_n) {
          if (this.field_b == 0) {
            while (true) {
              param4--;
              if (param4 < 0) {
                param4 = param6 - param5 & 3;
                while (true) {
                  param4--;
                  if (param4 < 0) {
                    return;
                  }
                  param2++;
                  if (param7 < param1[param2]) {
                    param0[param2] = param3;
                  }
                  param7 = param7 + param8;
                }
              }
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
            }
          }
          if (this.field_b == 254) {
            if (param5 == 0) {
              return;
            }
            if (param6 > this.field_h - 1) {
              return;
            }
            param4--;
            while (param4 >= 0) {
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
              param4--;
            }
            param4 = param6 - param5 & 3;
            while (true) {
              param4--;
              if (param4 < 0) {
                return;
              }
              param2++;
              if (param7 < param1[param2]) {
                param0[param2 - 1] = param0[param2];
              }
              param7 = param7 + param8;
            }
          }
          var10 = this.field_b;
          var11 = 256 - this.field_b;
          param3 = ((param3 & 16711935) * var11 >> 8 & 16711935) + ((param3 & 65280) * var11 >> 8 & 65280);
          while (true) {
            param4--;
            if (param4 < 0) {
              param4 = param6 - param5 & 3;
              while (true) {
                param4--;
                if (param4 < 0) {
                  return;
                }
                param2++;
                if (param7 < param1[param2]) {
                  var12 = param0[param2];
                  param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                }
                param7 = param7 + param8;
              }
            }
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime2 = param0[param2];
              param0[param2] = param3 + ((var12Lifetime2 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime2 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime3 = param0[param2];
              param0[param2] = param3 + ((var12Lifetime3 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime3 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime4 = param0[param2];
              param0[param2] = param3 + ((var12Lifetime4 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime4 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              var12Lifetime5 = param0[param2];
              param0[param2] = param3 + ((var12Lifetime5 & 16711935) * var10 >> 8 & 16711935) + ((var12Lifetime5 & 65280) * var10 >> 8 & 65280);
            }
            param7 = param7 + param8;
          }
        }
        if (this.field_b == 0) {
          while (true) {
            param4--;
            if (param4 < 0) {
              param4 = param6 - param5 & 3;
              while (true) {
                param4--;
                if (param4 < 0) {
                  return;
                }
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
              }
            }
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
          }
        }
        if (this.field_b == 254) {
          if (param5 == 0) {
            return;
          }
          if (param6 > this.field_h - 1) {
            return;
          }
          param4--;
          while (param4 >= 0) {
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
            param4--;
          }
          param4 = param6 - param5 & 3;
          while (true) {
            param4--;
            if (param4 < 0) {
              return;
            }
            param2++;
            if (param7 < param1[param2]) {
              param0[param2 - 1] = param0[param2];
            }
            param7 = param7 + param8;
          }
        }
        var10Lifetime1 = this.field_b;
        var11Lifetime1 = 256 - this.field_b;
        param3 = ((param3 & 16711935) * var11Lifetime1 >> 8 & 16711935) + ((param3 & 65280) * var11Lifetime1 >> 8 & 65280);
        while (true) {
          param4--;
          if (param4 < 0) {
            param4 = param6 - param5 & 3;
            while (true) {
              param4--;
              if (param4 < 0) {
                return;
              }
              param2++;
              if (param7 < param1[param2]) {
                var12Lifetime1 = param0[param2];
                param0[param2] = param3 + ((var12Lifetime1 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1 & 65280) * var10Lifetime1 >> 8 & 65280);
                param1[param2] = param7;
              }
              param7 = param7 + param8;
            }
          }
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime1 = param0[param2];
            param0[param2] = param3 + ((var12Lifetime1Lifetime1 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime1 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime2 = param0[param2];
            param0[param2] = param3 + ((var12Lifetime1Lifetime2 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime2 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime3 = param0[param2];
            param0[param2] = param3 + ((var12Lifetime1Lifetime3 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime3 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
          param2++;
          if (param7 < param1[param2]) {
            var12Lifetime1Lifetime4 = param0[param2];
            param0[param2] = param3 + ((var12Lifetime1Lifetime4 & 16711935) * var10Lifetime1 >> 8 & 16711935) + ((var12Lifetime1Lifetime4 & 65280) * var10Lifetime1 >> 8 & 65280);
            param1[param2] = param7;
          }
          param7 = param7 + param8;
        }
    }

    private final void b(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14) {
        int incrementValue$21 = 0;
        int incrementValue$20 = 0;
        int incrementValue$19 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int var16_int = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        if (this.field_q) {
          if (param6 > this.field_h) {
            param6 = this.field_h;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        if (this.field_m) {
          param2 = param2 + param5;
          param9 = param9 + param10 * (float)param5;
          param11 = param11 + param12 * (float)param5;
          param13 = param13 + param14 * (float)param5;
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                incrementValue$21 = param2;
                param2++;
                param0[incrementValue$21] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param4--;
              } while (param4 > 0);
              return;
            }
            if (!this.field_g) {
              var16_int = this.field_b;
              var17 = 256 - this.field_b;
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$20 = param2;
                param2++;
                param0[incrementValue$20] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param4--;
              } while (param4 > 0);
              return;
            }
            do {
              var27 = param0;
              var16 = var27;
              incrementValue$19 = param2;
              param2++;
              var17 = incrementValue$19;
              var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              var19 = var27[var17];
              var20 = var18 + var19;
              var21 = (var18 & 16711935) + (var19 & 16711935);
              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
              var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          param4 = param6 - param5 >> 2;
          param10 = param10 * 4.0f;
          param12 = param12 * 4.0f;
          param14 = param14 * 4.0f;
          if (this.field_b == 0) {
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param0[param2++] = param3;
                param0[param2++] = param3;
                param0[param2++] = param3;
                param0[param2++] = param3;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 <= 0) {
              return;
            }
            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
            do {
              param0[param2++] = param3;
              param4--;
            } while (param4 > 0);
            return;
          }
          if (this.field_g) {
            if (param4 > 0) {
              do {
                param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                var22 = param0;
                var16 = var22;
                incrementValue$22 = param2;
                param2++;
                var17 = incrementValue$22;
                var18 = param3;
                var19 = var22[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                var23 = param0;
                var16 = var23;
                incrementValue$23 = param2;
                param2++;
                var17 = incrementValue$23;
                var18 = param3;
                var19 = var23[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                var24 = param0;
                var16 = var24;
                incrementValue$24 = param2;
                param2++;
                var17 = incrementValue$24;
                var18 = param3;
                var19 = var24[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                var25 = param0;
                var16 = var25;
                incrementValue$25 = param2;
                param2++;
                var17 = incrementValue$25;
                var18 = param3;
                var19 = var25[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              do {
                var26 = param0;
                var16 = var26;
                incrementValue$26 = param2;
                param2++;
                var17 = incrementValue$26;
                var18 = param3;
                var19 = var26[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                param4--;
              } while (param4 > 0);
              return;
            }
          } else {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$27 = param2;
                param2++;
                param0[incrementValue$27] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$28 = param2;
                param2++;
                param0[incrementValue$28] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$29 = param2;
                param2++;
                param0[incrementValue$29] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                var18 = param0[param2];
                incrementValue$30 = param2;
                param2++;
                param0[incrementValue$30] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
              do {
                var18 = param0[param2];
                incrementValue$31 = param2;
                param2++;
                param0[incrementValue$31] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param4--;
              } while (param4 > 0);
              return;
            }
          }
          return;
        }
        param2 = param2 + (param5 - 1);
        param7 = param7 + param8 * (float)param5;
        param9 = param9 + param10 * (float)param5;
        param11 = param11 + param12 * (float)param5;
        param13 = param13 + param14 * (float)param5;
        if (!this.field_o.field_n) {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_b == 0) {
              do {
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param4--;
              } while (param4 > 0);
              return;
            }
            if (!this.field_g) {
              var16_int = this.field_b;
              var17 = 256 - this.field_b;
              do {
                param2++;
                if (param7 < param1[param2]) {
                  param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                  param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param4--;
              } while (param4 > 0);
              return;
            }
            do {
              param2++;
              if (param7 < param1[param2]) {
                var39 = param0;
                var16 = var39;
                var17 = param2;
                var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                var19 = var39[var17];
                var20 = var18 + var19;
                var21 = (var18 & 16711935) + (var19 & 16711935);
                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
              }
              param7 = param7 + param8;
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          param4 = param6 - param5 >> 2;
          param10 = param10 * 4.0f;
          param12 = param12 * 4.0f;
          param14 = param14 * 4.0f;
          if (this.field_b == 0) {
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  param0[param2] = param3;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 <= 0) {
              return;
            }
            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
            do {
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
              }
              param7 = param7 + param8;
              param4--;
            } while (param4 > 0);
            return;
          }
          if (this.field_g) {
            if (param4 > 0) {
              do {
                param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param2++;
                if (param7 < param1[param2]) {
                  var34 = param0;
                  var16 = var34;
                  var17 = param2;
                  var18 = param3;
                  var19 = var34[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var35 = param0;
                  var16 = var35;
                  var17 = param2;
                  var18 = param3;
                  var19 = var35[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var36 = param0;
                  var16 = var36;
                  var17 = param2;
                  var18 = param3;
                  var19 = var36[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var37 = param0;
                  var16 = var37;
                  var17 = param2;
                  var18 = param3;
                  var19 = var37[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var38 = param0;
                  var16 = var38;
                  var17 = param2;
                  var18 = param3;
                  var19 = var38[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
              return;
            }
          } else {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
              return;
            }
          }
          return;
        }
        if (!this.field_j) {
          param4 = param6 - param5;
          if (this.field_b == 0) {
            do {
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          if (!this.field_g) {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            do {
              param2++;
              if (param7 < param1[param2]) {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                var18 = param0[param2];
                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param4--;
            } while (param4 > 0);
            return;
          }
          do {
            param2++;
            if (param7 < param1[param2]) {
              var33 = param0;
              var16 = var33;
              var17 = param2;
              var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              var19 = var33[var17];
              var20 = var18 + var19;
              var21 = (var18 & 16711935) + (var19 & 16711935);
              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
              var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param9 = param9 + param10;
            param11 = param11 + param12;
            param13 = param13 + param14;
            param4--;
          } while (param4 > 0);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        param4 = param6 - param5 >> 2;
        param10 = param10 * 4.0f;
        param12 = param12 * 4.0f;
        param14 = param14 * 4.0f;
        if (this.field_b == 0) {
          if (param4 > 0) {
            do {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param9 = param9 + param10;
              param11 = param11 + param12;
              param13 = param13 + param14;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param2++;
              if (param7 < param1[param2]) {
                param0[param2] = param3;
                param1[param2] = param7;
              }
              param7 = param7 + param8;
              param4--;
            } while (param4 > 0);
          }
          param4 = param6 - param5 & 3;
          if (param4 <= 0) {
            return;
          }
          param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
          do {
            param2++;
            if (param7 < param1[param2]) {
              param0[param2] = param3;
              param1[param2] = param7;
            }
            param7 = param7 + param8;
            param4--;
          } while (param4 > 0);
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_g) {
            if (param4 > 0) {
              do {
                param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param2++;
                if (param7 < param1[param2]) {
                  var28 = param0;
                  var16 = var28;
                  var17 = param2;
                  var18 = param3;
                  var19 = var28[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var29 = param0;
                  var16 = var29;
                  var17 = param2;
                  var18 = param3;
                  var19 = var29[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var30 = param0;
                  var16 = var30;
                  var17 = param2;
                  var18 = param3;
                  var19 = var30[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var31 = param0;
                  var16 = var31;
                  var17 = param2;
                  var18 = param3;
                  var19 = var31[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var32 = param0;
                  var16 = var32;
                  var17 = param2;
                  var18 = param3;
                  var19 = var32[var17];
                  var20 = var18 + var19;
                  var21 = (var18 & 16711935) + (var19 & 16711935);
                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                  var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
          } else {
            var16_int = this.field_b;
            var17 = 256 - this.field_b;
            if (param4 > 0) {
              do {
                param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                param9 = param9 + param10;
                param11 = param11 + param12;
                param13 = param13 + param14;
                param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
            param4 = param6 - param5 & 3;
            if (param4 > 0) {
              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
              do {
                param2++;
                if (param7 < param1[param2]) {
                  var18 = param0[param2];
                  param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                  param1[param2] = param7;
                }
                param7 = param7 + param8;
                param4--;
              } while (param4 > 0);
            }
          }
        }

    }

    iua(sfa param0, tw param1) {
        this.field_j = true;
        this.field_m = false;
        this.field_p = new int[4096];
        this.field_c = -1;
        this.field_s = false;
        this.field_w = null;
        this.field_r = 0;
        this.field_g = false;
        this.field_q = false;
        this.field_b = 0;
        this.field_i = 0;
        this.field_f = 0;
        this.field_d = true;
        this.field_k = param0;
        this.field_o = param1;
        this.field_t = this.field_k.field_K;
        this.field_a = this.field_k.field_r;
        this.field_u = this.field_k.field_n;
    }
}
