/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa {
    boolean field_n;
    int[] field_k;
    private int[] field_e;
    boolean field_i;
    private float[] field_h;
    private sob field_f;
    int field_g;
    private boolean field_l;
    private co field_c;
    int field_b;
    private int field_m;
    boolean field_d;
    boolean field_j;
    int field_a;

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        if (this.field_l) {
          this.field_f.c((int)param4, 1, param9, (int)param1, (int)param3, (int)param0);
          this.field_f.c((int)param5, 1, param9, (int)param2, (int)param4, (int)param1);
          this.field_f.c((int)param3, 1, param9, (int)param0, (int)param5, (int)param2);
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
          if (param0 >= (float)this.field_g) {
            return;
          }
          if (param1 > (float)this.field_g) {
            param1 = (float)this.field_g;
          }
          if (param2 > (float)this.field_g) {
            param2 = (float)this.field_g;
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
              param0 = (float)this.field_k[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_m;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_m;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_k[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_m;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_m;
              }
              return;
            }
            if (!(var19 > var18)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_k[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                param5 = param5 + var19;
                param3 = param3 + var17;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_m;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                param5 = param5 + var19;
                param4 = param4 + var18;
                param6 = param6 + var22;
                param0 = param0 + (float)this.field_m;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
              param5 = param5 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
              param5 = param5 + var19;
              param4 = param4 + var18;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
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
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            return;
          }
          if (!(var18 > var17)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
              param4 = param4 + var19;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
              param5 = param5 + var18;
              param3 = param3 + var17;
              param6 = param6 + var22;
              param0 = param0 + (float)this.field_m;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_k[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
            param4 = param4 + var19;
            param3 = param3 + var17;
            param6 = param6 + var22;
            param0 = param0 + (float)this.field_m;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
            param5 = param5 + var18;
            param3 = param3 + var17;
            param6 = param6 + var22;
            param0 = param0 + (float)this.field_m;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_g) {
            return;
          }
          if (param2 > (float)this.field_g) {
            param2 = (float)this.field_g;
          }
          if (param0 > (float)this.field_g) {
            param0 = (float)this.field_g;
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
              param1 = (float)this.field_k[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_m;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_m;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_k[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_m;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_m;
              }
              return;
            }
            if (!(var17 > var19)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_k[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                param3 = param3 + var17;
                param4 = param4 + var18;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_m;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                param3 = param3 + var17;
                param5 = param5 + var19;
                param7 = param7 + var22;
                param1 = param1 + (float)this.field_m;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_k[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
              param3 = param3 + var17;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_m;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
              param3 = param3 + var17;
              param5 = param5 + var19;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_m;
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
            param1 = (float)this.field_k[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
              param5 = param5 + var17;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_m;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
              param3 = param3 + var19;
              param4 = param4 + var18;
              param7 = param7 + var22;
              param1 = param1 + (float)this.field_m;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_k[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
            param5 = param5 + var17;
            param4 = param4 + var18;
            param7 = param7 + var22;
            param1 = param1 + (float)this.field_m;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
            param3 = param3 + var19;
            param4 = param4 + var18;
            param7 = param7 + var22;
            param1 = param1 + (float)this.field_m;
          }
          return;
        }
        if (param2 >= (float)this.field_g) {
          return;
        }
        if (param0 > (float)this.field_g) {
          param0 = (float)this.field_g;
        }
        if (param1 > (float)this.field_g) {
          param1 = (float)this.field_g;
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
            param2 = (float)this.field_k[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
              param4 = param4 + var18;
              param5 = param5 + var19;
              param8 = param8 + var22;
              param2 = param2 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
              param4 = param4 + var18;
              param3 = param3 + var17;
              param8 = param8 + var22;
              param2 = param2 + (float)this.field_m;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_k[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
            param4 = param4 + var18;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_m;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
            param4 = param4 + var18;
            param3 = param3 + var17;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_m;
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
          param2 = (float)this.field_k[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
            param3 = param3 + var18;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_m;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
            param4 = param4 + var17;
            param5 = param5 + var19;
            param8 = param8 + var22;
            param2 = param2 + (float)this.field_m;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_k[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
          param3 = param3 + var18;
          param5 = param5 + var19;
          param8 = param8 + var22;
          param2 = param2 + (float)this.field_m;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
          param4 = param4 + var17;
          param5 = param5 + var19;
          param8 = param8 + var22;
          param2 = param2 + (float)this.field_m;
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
        if (this.field_n) {
          if (param6 > this.field_b) {
            param6 = this.field_b;
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
        if (!this.field_c.field_f) {
          if (this.field_a == 0) {
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
          if (this.field_a == 254) {
            if (param5 == 0) {
              return;
            }
            if (param6 > this.field_b - 1) {
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
          var10 = this.field_a;
          var11 = 256 - this.field_a;
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
        if (this.field_a == 0) {
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
        if (this.field_a == 254) {
          if (param5 == 0) {
            return;
          }
          if (param6 > this.field_b - 1) {
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
        var10Lifetime1 = this.field_a;
        var11Lifetime1 = 256 - this.field_a;
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

    final int a() {
        return this.field_k[0] % this.field_m;
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
        if (this.field_l) {
          this.field_f.c((int)param4, 1, -16777216 | param9, (int)param1, (int)param3, (int)param0);
          this.field_f.c((int)param5, 1, -16777216 | param9, (int)param2, (int)param4, (int)param1);
          this.field_f.c((int)param3, 1, -16777216 | param9, (int)param0, (int)param5, (int)param2);
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
          if (param0 >= (float)this.field_g) {
            return;
          }
          if (param1 > (float)this.field_g) {
            param1 = (float)this.field_g;
          }
          if (param2 > (float)this.field_g) {
            param2 = (float)this.field_g;
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
              param0 = (float)this.field_k[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_m;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_m;
              }
              return;
            }
            if (param0 != param1) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_k[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_m;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_m;
              }
              return;
            }
            if (!(var27 > var25)) {
              param2 = param2 - param1;
              param1 = param1 - param0;
              param0 = (float)this.field_k[(int)param0];
              while (true) {
                param1 = param1 - 1.0f;
                if (!(param1 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param3 = param3 + var26;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_m;
              }
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                param5 = param5 + var27;
                param4 = param4 + var25;
                param6 = param6 + var30;
                var37 = var37 + var32;
                var38 = var38 + var34;
                var39 = var39 + var36;
                param0 = param0 + (float)this.field_m;
              }
              return;
            }
            param2 = param2 - param1;
            param1 = param1 - param0;
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var27;
              param4 = param4 + var25;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
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
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            return;
          }
          if (param0 != param2) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            return;
          }
          if (!(var25 > var26)) {
            param1 = param1 - param2;
            param2 = param2 - param0;
            param0 = (float)this.field_k[(int)param0];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
              param4 = param4 + var27;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
              param5 = param5 + var25;
              param3 = param3 + var26;
              param6 = param6 + var30;
              var37 = var37 + var32;
              var38 = var38 + var34;
              var39 = var39 + var36;
              param0 = param0 + (float)this.field_m;
            }
            return;
          }
          param1 = param1 - param2;
          param2 = param2 - param0;
          param0 = (float)this.field_k[(int)param0];
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
            param4 = param4 + var27;
            param3 = param3 + var26;
            param6 = param6 + var30;
            var37 = var37 + var32;
            var38 = var38 + var34;
            var39 = var39 + var36;
            param0 = param0 + (float)this.field_m;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
            param5 = param5 + var25;
            param3 = param3 + var26;
            param6 = param6 + var30;
            var37 = var37 + var32;
            var38 = var38 + var34;
            var39 = var39 + var36;
            param0 = param0 + (float)this.field_m;
          }
          return;
        }
        if (param1 <= param2) {
          if (param1 >= (float)this.field_g) {
            return;
          }
          if (param2 > (float)this.field_g) {
            param2 = (float)this.field_g;
          }
          if (param0 > (float)this.field_g) {
            param0 = (float)this.field_g;
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
              param1 = (float)this.field_k[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_m;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_m;
              }
              return;
            }
            if (param1 != param2) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_k[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_m;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_m;
              }
              return;
            }
            if (!(var26 > var27)) {
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_k[(int)param1];
              while (true) {
                param2 = param2 - 1.0f;
                if (!(param2 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param4 = param4 + var25;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_m;
              }
              while (true) {
                param0 = param0 - 1.0f;
                if (!(param0 >= 0.0f)) {
                  break;
                }
                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
                param3 = param3 + var26;
                param5 = param5 + var27;
                param7 = param7 + var30;
                var37Lifetime1 = var37Lifetime1 + var32;
                var38Lifetime1 = var38Lifetime1 + var34;
                var39Lifetime1 = var39Lifetime1 + var36;
                param1 = param1 + (float)this.field_m;
              }
              return;
            }
            param0 = param0 - param2;
            param2 = param2 - param1;
            param1 = (float)this.field_k[(int)param1];
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var26;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_m;
            }
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var26;
              param5 = param5 + var27;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_m;
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
            param1 = (float)this.field_k[(int)param1];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param5 = param5 + var26;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_m;
            }
            while (true) {
              param2 = param2 - 1.0f;
              if (!(param2 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
              param3 = param3 + var27;
              param4 = param4 + var25;
              param7 = param7 + var30;
              var37Lifetime1 = var37Lifetime1 + var32;
              var38Lifetime1 = var38Lifetime1 + var34;
              var39Lifetime1 = var39Lifetime1 + var36;
              param1 = param1 + (float)this.field_m;
            }
            return;
          }
          param2 = param2 - param0;
          param0 = param0 - param1;
          param1 = (float)this.field_k[(int)param1];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
            param5 = param5 + var26;
            param4 = param4 + var25;
            param7 = param7 + var30;
            var37Lifetime1 = var37Lifetime1 + var32;
            var38Lifetime1 = var38Lifetime1 + var34;
            var39Lifetime1 = var39Lifetime1 + var36;
            param1 = param1 + (float)this.field_m;
          }
          while (true) {
            param2 = param2 - 1.0f;
            if (!(param2 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37Lifetime1, var31, var38Lifetime1, var33, var39Lifetime1, var35);
            param3 = param3 + var27;
            param4 = param4 + var25;
            param7 = param7 + var30;
            var37Lifetime1 = var37Lifetime1 + var32;
            var38Lifetime1 = var38Lifetime1 + var34;
            var39Lifetime1 = var39Lifetime1 + var36;
            param1 = param1 + (float)this.field_m;
          }
          return;
        }
        if (param2 >= (float)this.field_g) {
          return;
        }
        if (param0 > (float)this.field_g) {
          param0 = (float)this.field_g;
        }
        if (param1 > (float)this.field_g) {
          param1 = (float)this.field_g;
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
            param2 = (float)this.field_k[(int)param2];
            while (true) {
              param0 = param0 - 1.0f;
              if (!(param0 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
              param4 = param4 + var25;
              param5 = param5 + var27;
              param8 = param8 + var30;
              var37Lifetime2 = var37Lifetime2 + var32;
              var38Lifetime2 = var38Lifetime2 + var34;
              var39Lifetime2 = var39Lifetime2 + var36;
              param2 = param2 + (float)this.field_m;
            }
            while (true) {
              param1 = param1 - 1.0f;
              if (!(param1 >= 0.0f)) {
                break;
              }
              this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
              param4 = param4 + var25;
              param3 = param3 + var26;
              param8 = param8 + var30;
              var37Lifetime2 = var37Lifetime2 + var32;
              var38Lifetime2 = var38Lifetime2 + var34;
              var39Lifetime2 = var39Lifetime2 + var36;
              param2 = param2 + (float)this.field_m;
            }
            return;
          }
          param1 = param1 - param0;
          param0 = param0 - param2;
          param2 = (float)this.field_k[(int)param2];
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var25;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_m;
          }
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var25;
            param3 = param3 + var26;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_m;
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
          param2 = (float)this.field_k[(int)param2];
          while (true) {
            param1 = param1 - 1.0f;
            if (!(param1 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param3 = param3 + var25;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_m;
          }
          while (true) {
            param0 = param0 - 1.0f;
            if (!(param0 >= 0.0f)) {
              break;
            }
            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
            param4 = param4 + var26;
            param5 = param5 + var27;
            param8 = param8 + var30;
            var37Lifetime2 = var37Lifetime2 + var32;
            var38Lifetime2 = var38Lifetime2 + var34;
            var39Lifetime2 = var39Lifetime2 + var36;
            param2 = param2 + (float)this.field_m;
          }
          return;
        }
        param0 = param0 - param1;
        param1 = param1 - param2;
        param2 = (float)this.field_k[(int)param2];
        while (true) {
          param1 = param1 - 1.0f;
          if (!(param1 >= 0.0f)) {
            break;
          }
          this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
          param3 = param3 + var25;
          param5 = param5 + var27;
          param8 = param8 + var30;
          var37Lifetime2 = var37Lifetime2 + var32;
          var38Lifetime2 = var38Lifetime2 + var34;
          var39Lifetime2 = var39Lifetime2 + var36;
          param2 = param2 + (float)this.field_m;
        }
        while (true) {
          param0 = param0 - 1.0f;
          if (!(param0 >= 0.0f)) {
            break;
          }
          this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37Lifetime2, var31, var38Lifetime2, var33, var39Lifetime2, var35);
          param4 = param4 + var26;
          param5 = param5 + var27;
          param8 = param8 + var30;
          var37Lifetime2 = var37Lifetime2 + var32;
          var38Lifetime2 = var38Lifetime2 + var34;
          var39Lifetime2 = var39Lifetime2 + var36;
          param2 = param2 + (float)this.field_m;
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
        if (this.field_n) {
          if (param6 > this.field_b) {
            param6 = this.field_b;
          }
          if (param5 < 0) {
            param5 = 0;
          }
        }
        if (param5 >= param6) {
          return;
        }
        if (this.field_i) {
          param2 = param2 + param5;
          param9 = param9 + param10 * (float)param5;
          param11 = param11 + param12 * (float)param5;
          param13 = param13 + param14 * (float)param5;
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_a == 0) {
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
            if (!this.field_d) {
              var16_int = this.field_a;
              var17 = 256 - this.field_a;
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
          if (this.field_a == 0) {
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
          if (this.field_d) {
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
            var16_int = this.field_a;
            var17 = 256 - this.field_a;
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
        if (!this.field_c.field_f) {
          if (!this.field_j) {
            param4 = param6 - param5;
            if (this.field_a == 0) {
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
            if (!this.field_d) {
              var16_int = this.field_a;
              var17 = 256 - this.field_a;
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
          if (this.field_a == 0) {
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
          if (this.field_d) {
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
            var16_int = this.field_a;
            var17 = 256 - this.field_a;
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
          if (this.field_a == 0) {
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
          if (!this.field_d) {
            var16_int = this.field_a;
            var17 = 256 - this.field_a;
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
        if (this.field_a == 0) {
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
          if (this.field_d) {
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
            var16_int = this.field_a;
            var17 = 256 - this.field_a;
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

    final int b() {
        return this.field_k[0] / this.field_m;
    }

    daa(sob param0, co param1) {
        this.field_k = new int[4096];
        this.field_i = false;
        this.field_l = false;
        this.field_n = false;
        this.field_d = false;
        this.field_j = true;
        this.field_a = 0;
        this.field_f = param0;
        this.field_c = param1;
        this.field_m = this.field_f.field_i;
        this.field_e = this.field_f.field_k;
        this.field_h = this.field_f.field_r;
    }
}
