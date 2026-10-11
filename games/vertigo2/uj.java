/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private int field_d;
    static String field_e;
    private int field_l;
    int field_b;
    static boolean field_g;
    private int field_a;
    static String field_h;
    private boolean field_f;
    private int field_i;
    static String field_k;
    static String[] field_j;
    int field_c;

    final static boolean c(byte param0) {
        if (param0 != -87) {
          uj.a(-74, 73, 75, true, 41, -1);
          if (null == nj.field_b) {
            return pm.field_a ? true : false;
          }
          return true;
        }
        if (null != nj.field_b) {
          return true;
        }
        if (!pm.field_a) {
          return false;
        }
        return true;
    }

    final void d(byte param0) {
        this.field_i = 0;
        this.field_a = 0;
        if (this.field_l == 0) {
          this.field_i = de.field_f;
        }
        if (0 == this.field_l &&
          de.field_f == 98) {
          if (this.field_c <= 0) {
            this.field_c = this.field_b;
          }
          this.field_c = this.field_c - 1;
          this.field_f = false;
        }
        if (param0 <= 32) {
          field_k = (String) null;
        }
        if (0 != this.field_l) {
          return;
        }
        if (99 != de.field_f) {
          return;
        }
        this.field_c = this.field_c + 1;
        this.field_f = false;
        if (this.field_c < this.field_b) {
          return;
        }
        this.field_c = 0;
    }

    final boolean a(int param0) {
        if (param0 != 84) {
          field_h = (String) null;
          if (0 != this.field_a) {
            return true;
          }
          if (84 != this.field_i) {
            return this.field_i == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_a) {
          return true;
        }
        if (84 == this.field_i) {
          return true;
        }
        if (this.field_i != 83) {
          return false;
        }
        return true;
    }

    final void a(byte param0, int param1, int param2) {
        if (this.field_b <= param1) {
          throw new IllegalArgumentException();
        }
        if (this.field_b <= param2) {
          throw new IllegalArgumentException();
        }
        this.field_a = 0;
        if (param0 == -29) {
          this.field_i = 0;
          if (kf.field_c != 0) {
            this.field_l = kf.field_c;
            this.field_a = kf.field_c;
            this.field_c = param2;
            this.field_f = true;
            this.field_d = uh.field_mc;
          }
          if (this.field_l != 0 &&
            q.field_v != 0) {
            if (0 >= this.field_d) {
              this.field_d = ol.field_I;
              this.field_d = this.field_d - 1;
              if (kf.field_c == 0 &&
                q.field_v == 0) {
                this.field_l = 0;
              }
              if (0 == this.field_l) {
                if (!this.field_f &&
                  !wo.field_s) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_f) {
                    this.field_c = -1;
                  }
                } else {
                  if (this.field_c == param1) {
                    this.field_c = param1;
                    this.field_f = true;
                  } else {
                    this.field_c = param1;
                    this.field_f = true;
                  }
                }
              }
              return;
            }
            this.field_d = this.field_d - 1;
          }
          if (kf.field_c == 0) {
            if (q.field_v != 0) {
              if (0 == this.field_l) {
                if (!this.field_f &&
                  !wo.field_s) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_f) {
                    this.field_c = -1;
                  }
                } else {
                  if (this.field_c == param1) {
                    this.field_c = param1;
                    this.field_f = true;
                  } else {
                    this.field_c = param1;
                    this.field_f = true;
                  }
                }
              }
              return;
            }
            this.field_l = 0;
          }
          if (0 != this.field_l) {
            return;
          }
          if (!this.field_f &&
            !wo.field_s) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_f) {
              return;
            }
            this.field_c = -1;
            return;
          }
          if (this.field_c == param1) {
          }
          this.field_c = param1;
          this.field_f = true;
          return;
        }
        this.field_d = -6;
        this.field_i = 0;
        if (kf.field_c == 0) {
          if (this.field_l != 0 &&
            q.field_v != 0) {
            if (0 >= this.field_d) {
              this.field_d = ol.field_I;
              this.field_d = this.field_d - 1;
              if (kf.field_c == 0 &&
                q.field_v == 0) {
                this.field_l = 0;
              }
              if (0 == this.field_l) {
                if (!this.field_f &&
                  !wo.field_s) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_f) {
                    this.field_c = -1;
                  }
                } else {
                  if (this.field_c == param1) {
                    this.field_c = param1;
                    this.field_f = true;
                  } else {
                    this.field_c = param1;
                    this.field_f = true;
                  }
                }
              }
              return;
            }
            this.field_d = this.field_d - 1;
          }
          if (kf.field_c == 0) {
            if (q.field_v != 0) {
              if (0 == this.field_l) {
                if (!this.field_f &&
                  !wo.field_s) {
                  return;
                }
                if (param1 < 0) {
                  if (this.field_f) {
                    this.field_c = -1;
                  }
                } else {
                  if (this.field_c == param1) {
                    this.field_c = param1;
                    this.field_f = true;
                  } else {
                    this.field_c = param1;
                    this.field_f = true;
                  }
                }
              }
              return;
            }
            this.field_l = 0;
          }
          if (0 != this.field_l) {
            return;
          }
          if (!this.field_f &&
            !wo.field_s) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_f) {
              return;
            }
            this.field_c = -1;
            return;
          }
          if (this.field_c == param1) {
          }
          this.field_c = param1;
          this.field_f = true;
          return;
        }
        this.field_l = kf.field_c;
        this.field_a = kf.field_c;
        this.field_c = param2;
        this.field_f = true;
        this.field_d = uh.field_mc;
        if (this.field_l == 0) {
          if (kf.field_c == 0 &&
            q.field_v == 0) {
            this.field_l = 0;
          }
          if (0 != this.field_l) {
            return;
          }
          if (!this.field_f &&
            !wo.field_s) {
            return;
          }
          if (param1 < 0) {
            if (!this.field_f) {
              return;
            }
            this.field_c = -1;
            return;
          }
          if (this.field_c == param1) {
          }
          this.field_c = param1;
          this.field_f = true;
          return;
        }
        if (q.field_v != 0) {
          if (0 >= this.field_d) {
            this.field_d = ol.field_I;
            this.field_d = this.field_d - 1;
            if (kf.field_c != 0) {
              if (0 != this.field_l) {
                return;
              }
              if (!this.field_f &&
                !wo.field_s) {
                return;
              }
              if (param1 < 0) {
                if (!this.field_f) {
                  return;
                }
                this.field_c = -1;
                return;
              }
              if (this.field_c != param1) {
                this.field_c = param1;
                this.field_f = true;
                return;
              }
              this.field_c = param1;
              this.field_f = true;
              return;
            }
            if (q.field_v == 0) {
              this.field_l = 0;
            }
            if (0 != this.field_l) {
              return;
            }
            if (!this.field_f &&
              !wo.field_s) {
              return;
            }
            if (param1 < 0) {
              if (!this.field_f) {
                return;
              }
              this.field_c = -1;
              return;
            }
            if (this.field_c != param1) {
              this.field_c = param1;
              this.field_f = true;
              return;
            }
            this.field_c = param1;
            this.field_f = true;
            return;
          }
          this.field_d = this.field_d - 1;
        }
        if (kf.field_c == 0) {
          if (q.field_v != 0) {
            if (0 != this.field_l) {
              return;
            }
            if (!this.field_f &&
              !wo.field_s) {
              return;
            }
            if (param1 < 0) {
              if (!this.field_f) {
                return;
              }
              this.field_c = -1;
              return;
            }
            if (this.field_c == param1) {
            }
            this.field_c = param1;
            this.field_f = true;
            return;
          }
          this.field_l = 0;
        }
        if (0 == this.field_l) {
          if (!this.field_f &&
            !wo.field_s) {
            return;
          }
          if (param1 >= 0) {
            if (this.field_c == param1) {
            }
            this.field_c = param1;
            this.field_f = true;
            return;
          }
          if (!this.field_f) {
            return;
          }
          this.field_c = -1;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_i = 0;
        this.field_a = 0;
        if (this.field_l != 0) {
          if (0 == this.field_l &&
            de.field_f == 96) {
            if (this.field_c > 0) {
              this.field_c = this.field_c - 1;
              this.field_f = false;
              if (this.field_l == 0 &&
                de.field_f == 97) {
                this.field_c = this.field_c + 1;
                if (this.field_c >= this.field_b) {
                  this.field_c = 0;
                }
                this.field_f = false;
              }
              if (!param1) {
                this.field_f = true;
              }
              if (0 == this.field_l) {
                if (de.field_f != 98 &&
                  de.field_f != 99) {
                  return;
                }
                this.field_f = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            this.field_c = this.field_b;
            this.field_c = this.field_c - 1;
            this.field_f = false;
            if (this.field_l == 0 &&
              de.field_f == 97) {
              this.field_c = this.field_c + 1;
              if (this.field_c >= this.field_b) {
                this.field_c = 0;
              }
              this.field_f = false;
            }
            if (!param1) {
              this.field_f = true;
            }
            if (0 == this.field_l) {
              if (de.field_f != 98 &&
                de.field_f != 99) {
                return;
              }
              this.field_f = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
            }
            return;
          }
          if (this.field_l == 0) {
            if (de.field_f != 97) {
              if (!param1) {
                this.field_f = true;
              }
              if (0 == this.field_l) {
                if (de.field_f != 98 &&
                  de.field_f != 99) {
                  return;
                }
                this.field_f = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            this.field_c = this.field_c + 1;
            if (this.field_c >= this.field_b) {
              this.field_c = 0;
            }
            this.field_f = false;
          }
          if (!param1) {
            this.field_f = true;
            if (0 == this.field_l) {
              if (de.field_f != 98 &&
                de.field_f != 99) {
                return;
              }
              this.field_f = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
            }
            return;
          }
          if (0 != this.field_l) {
            return;
          }
          if (de.field_f == 98) {
            this.field_f = false;
            if (0 <= this.field_c) {
              return;
            }
            this.field_c = param0;
            return;
          }
          if (de.field_f != 99) {
            return;
          }
          this.field_f = false;
          if (0 > this.field_c) {
            this.field_c = param0;
          }
          return;
        }
        this.field_i = de.field_f;
        if (0 != this.field_l) {
          if (this.field_l == 0) {
            if (de.field_f != 97) {
              if (!param1) {
                this.field_f = true;
              }
              if (0 == this.field_l) {
                if (de.field_f != 98 &&
                  de.field_f != 99) {
                  return;
                }
                this.field_f = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            this.field_c = this.field_c + 1;
            if (this.field_c >= this.field_b) {
              this.field_c = 0;
            }
            this.field_f = false;
          }
          if (!param1) {
            this.field_f = true;
            if (0 == this.field_l) {
              if (de.field_f != 98 &&
                de.field_f != 99) {
                return;
              }
              this.field_f = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
            }
            return;
          }
          if (0 != this.field_l) {
            return;
          }
          if (de.field_f == 98) {
            this.field_f = false;
            if (0 <= this.field_c) {
              return;
            }
            this.field_c = param0;
            return;
          }
          if (de.field_f != 99) {
            return;
          }
          this.field_f = false;
          if (0 > this.field_c) {
            this.field_c = param0;
          }
          return;
        }
        if (de.field_f == 96) {
          if (this.field_c > 0) {
            this.field_c = this.field_c - 1;
            this.field_f = false;
            if (this.field_l == 0 &&
              de.field_f == 97) {
              this.field_c = this.field_c + 1;
              if (this.field_c >= this.field_b) {
                this.field_c = 0;
              }
              this.field_f = false;
            }
            if (!param1) {
              this.field_f = true;
            }
            if (0 == this.field_l) {
              if (de.field_f != 98 &&
                de.field_f != 99) {
                return;
              }
              this.field_f = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
            }
            return;
          }
          this.field_c = this.field_b;
          this.field_c = this.field_c - 1;
          this.field_f = false;
          if (this.field_l == 0 &&
            de.field_f == 97) {
            this.field_c = this.field_c + 1;
            if (this.field_c >= this.field_b) {
              this.field_c = 0;
            }
            this.field_f = false;
          }
          if (!param1) {
            this.field_f = true;
          }
          if (0 != this.field_l) {
            return;
          }
          if (de.field_f == 98) {
            this.field_f = false;
            if (0 > this.field_c) {
              this.field_c = param0;
            }
          } else {
            if (de.field_f == 99) {
              this.field_f = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
            }
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_l == 0) {
          if (de.field_f != 97) {
            if (!param1) {
              this.field_f = true;
              if (0 == this.field_l) {
                if (de.field_f != 98 &&
                  de.field_f != 99) {
                  return;
                }
                this.field_f = false;
                if (0 > this.field_c) {
                  this.field_c = param0;
                }
              }
              return;
            }
            if (0 != this.field_l) {
              return;
            }
            decompiledFrameRemainder0 = (de.field_f != 98);
            if (decompiledFrameRemainder0) {
              if (de.field_f != 99) {
                return;
              }
              this.field_f = false;
              if (0 > this.field_c) {
                this.field_c = param0;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            this.field_c = this.field_c + 1;
            if (this.field_c >= this.field_b) {
              this.field_c = 0;
            }
            this.field_f = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (!param1) {
            this.field_f = true;
          }
          if (0 != this.field_l) {
            return;
          }
          if (de.field_f != 98 &&
            de.field_f != 99) {
            return;
          }
        }
        this.field_f = false;
        if (0 <= this.field_c) {
          return;
        }
        this.field_c = param0;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_j = null;
        if (param0) {
          field_k = null;
          field_e = null;
          return;
        }
        field_k = (String) null;
        field_k = null;
        field_e = null;
    }

    final boolean c(int param0) {
        if (param0 == 0) {
          return this.field_i == 103 ? true : false;
        }
        uj.c((byte) -98);
        return this.field_i == 103 ? true : false;
    }

    final boolean d(int param0) {
        if (param0 == -98) {
          return this.field_i == 97 ? true : false;
        }
        this.c(-119);
        return this.field_i == 97 ? true : false;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = param2 - param4;
          var7 = param1 - param0;
          if (var7 == 0) {
            if (var6_int != 0) {
              ce.a(param0, (byte) -86, param4, param5, param2);
            }
            return;
          }
          if (var6_int == 0) {
            oq.a(param1, param0, (byte) -84, param4, param5);
            return;
          }
          if (0 > var7) {
            var7 = -var7;
          }
          if (var6_int < 0) {
            var6_int = -var6_int;
          }
          stackIn_16_0 = (var7 >= var6_int) ? 0 : 1;
          var8 = stackIn_16_0;
          if (var8 != 0) {
            var9 = param0;
            param0 = param4;
            var10 = param1;
            param1 = param2;
            param4 = var9;
            param2 = var10;
          }
          if (param0 > param1) {
            var9Lifetime1 = param0;
            param0 = param1;
            var10Lifetime1 = param4;
            param4 = param2;
            param1 = var9Lifetime1;
            param2 = var10Lifetime1;
          }
          var9Lifetime2 = param4;
          var10Lifetime2 = -param0 + param1;
          var11 = param2 - param4;
          var12 = -(var10Lifetime2 >> 1);
          stackIn_25_0 = (param2 > param4) ? 1 : -1;
          var13 = stackIn_25_0;
          if (var11 < 0) {
            var11 = -var11;
          }
          if (var8 == 0) {
            for (var14 = param0; param1 >= var14; var14++) {
              vl.field_e[var9Lifetime2][var14] = param5;
              var12 = var12 + var11;
              if (var12 > 0) {
                var9Lifetime2 = var9Lifetime2 + var13;
                var12 = var12 - var10Lifetime2;
              }
            }
          } else {
            var16 = param0;
            var14 = var16;
            while (param1 >= var16) {
              var12 = var12 + var11;
              vl.field_e[var16][var9Lifetime2] = param5;
              if (var12 > 0) {
                var12 = var12 - var10Lifetime2;
                var9Lifetime2 = var9Lifetime2 + var13;
              }
              var16++;
            }
          }
          if (!param3) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "uj.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(String param0, String param1, int param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param3.length();
          var5 = param0.length();
          var6 = param1.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param3.indexOf(param0, var9_int);
              if (var9_int < 0) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = param2;
          while (true) {
            var11 = param3.indexOf(param0, var10);
            if (var11 < 0) {
              discarded$2 = var9.append(param3.substring(var10));
              stackIn_12_0 = var9.toString();
              return stackIn_12_0;
            }
            discarded$0 = var9.append(param3.substring(var10, var11));
            var10 = var5 + var11;
            discarded$1 = var9.append(param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("uj.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 <= -58) {
          return this.field_i == 96 ? true : false;
        }
        field_j = (String[]) null;
        return this.field_i == 96 ? true : false;
    }

    final boolean a(byte param0) {
        if (param0 != 45) {
          return false;
        }
        return 102 == this.field_i ? true : false;
    }

    final void a(boolean param0, int param1, int param2, byte param3) {
        this.field_l = 0;
        if (param3 != 80) {
          this.field_b = -66;
          this.field_f = param0 ? true : false;
          if (!this.field_f) {
            this.field_c = param2;
            return;
          }
          this.field_c = param1;
          return;
        }
        this.field_f = param0 ? true : false;
        if (!this.field_f) {
          this.field_c = param2;
          return;
        }
        this.field_c = param1;
    }

    final boolean b(byte param0) {
        if (param0 == 85) {
          return this.field_l != 0 ? true : false;
        }
        field_k = (String) null;
        return this.field_l != 0 ? true : false;
    }

    uj(int param0) {
        this.field_f = false;
        this.field_c = 0;
        this.field_b = param0;
    }

    static {
        field_k = "<times> <%0>";
        field_e = "you died";
        field_h = "Players";
        field_j = new String[]{"Paint all these purple to complete each level.", "You can jump higher while on a fan.", "Green portals transport you to red portals.", "You can't jump while on a gluey tile.", "You can't pass these blocks, and if you land on one you'll slide off of it.", "Danger: this block will kill you!", "Moving onto it will cause the bomb to blow up, destroying nearby blocks.", "This block crumbles when you move off of it, and must be destroyed to complete the level.", "Pulls you towards it.", "Pushes you away.", "You can't paint this block (but you don't have to).", "These blocks phase in and out of existence. You'll fall through them when they're transparent."};
    }
}
