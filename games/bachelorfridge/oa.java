/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends sna {
    private StringBuilder field_Ab;
    static int field_vb;
    private sna field_xb;
    static String field_wb;
    private int field_zb;
    private sna field_yb;
    static kv field_Bb;

    oa(int param0, int param1, int param2, int param3, String param4, sna param5, sna param6, sna param7) {
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
        this.field_zb = 0;
        try {
          this.field_xb = new sna(0L, param6, param4);
          this.a(-1, this.field_xb);
          this.field_yb = new sna(0L, param7);
          this.field_yb.field_gb = 16764006;
          this.a(-1, this.field_yb);
          this.field_yb.field_pb = "|";
          this.field_Ab = new StringBuilder(12);
          var9_int = this.field_xb.e(-1);
          this.field_xb.a(rg.field_h, 31407, var9_int, 5, 3);
          this.field_yb.a(rg.field_h, 31407, var9_int, 5, 3 + rg.field_h);
          var10 = 5 + var9_int + 5;
          var11 = 6 + rg.field_h * 2;
          var12 = oi.a(param2, var10, param0, -21264);
          var13 = nga.a(var11, param1, (byte) 99, param3);
          this.a(var11, 31407, var10, var12, var13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("oa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int b(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        var3 = -46 / ((param1 - 30) / 32);
        this.a(19842, param0);
        if (!param0) {
          this.field_yb.field_Z = this.field_Ab.toString();
          if (!param0) {
            return this.field_zb;
          }
          if (lf.field_c == 0) {
            return this.field_zb;
          }
          if (this.field_R != 0) {
            return this.field_zb;
          }
          this.field_zb = 1;
          return this.field_zb;
        }
        while (true) {
          if (!kaa.b(127)) {
            this.field_yb.field_Z = this.field_Ab.toString();
            if (!param0) {
              return this.field_zb;
            }
            if (lf.field_c == 0) {
              return this.field_zb;
            }
            if (this.field_R != 0) {
              return this.field_zb;
            }
            this.field_zb = 1;
            return this.field_zb;
          }
          if (gf.field_k == 85 &&
            this.field_Ab.length() > 0) {
            sw.a(this.field_Ab, 4, this.field_Ab.length() - 1, ' ');
          }
          if (ok.a((CharSequence) ((Object) this.field_Ab), dla.field_j, (byte) -19)) {
            discarded$0 = this.field_Ab.append(dla.field_j);
          } else {
            if (this.field_Ab.length() == 0 &&
              dla.field_j == 91) {
              discarded$1 = this.field_Ab.append(dla.field_j);
            } else {
              if (this.field_Ab.length() == 1 &&
                dla.field_j == 35) {
                discarded$2 = this.field_Ab.append(dla.field_j);
              } else {
                if (dla.field_j == 93) {
                  discarded$3 = this.field_Ab.append(dla.field_j);
                }
              }
            }
          }
          if (84 != gf.field_k) {
            if (gf.field_k != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.field_Ab.length() <= 0) {
          return 1;
        }
        this.field_Z = this.field_Ab.toString();
        return 2;
    }

    public static void f(int param0) {
        field_Bb = null;
        field_wb = null;
        if (param0 <= 107) {
          field_Bb = (kv) null;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9, boolean param10, int param11, boolean param12, boolean param13) {
        jja.field_m = null;
        er.e(9941);
        param1 = ot.a(param8, param11, param1, param3, param2, param6, (byte) 92);
        lr.a(param7, param5, param0, param9, param2, 1, param4, param13, param10, param1);
        bf.a(param5, param10, (byte) -88);
        rh.a(param5, 67, param1, param8);
        if (!param12) {
          return;
        }
        field_Bb = (kv) null;
    }

    final boolean b(boolean param0) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_zb != 0) {
          return false;
        }
        if (param0) {
          if (85 == gf.field_k &&
            this.field_Ab.length() > 0) {
            sw.a(this.field_Ab, 4, this.field_Ab.length() - 1, ' ');
          }
          if (this.field_Ab.length() < 12) {
            var2 = Character.toLowerCase(dla.field_j);
            if (var2 == 32) {
              var2 = 95;
            }
            if (var2 == 95 &&
              0 < this.field_Ab.length()) {
              discarded$12 = this.field_Ab.append((char) var2);
              if (ml.a(-130697146, (char) var2)) {
                discarded$13 = this.field_Ab.append((char) var2);
              } else {
                if (ula.a((char) var2, 48)) {
                  discarded$14 = this.field_Ab.append((char) var2);
                }
              }
              if (gf.field_k == 84) {
                if (this.field_Ab.length() > 0) {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                } else {
                  this.field_zb = 1;
                }
              }
              if (13 != gf.field_k) {
                return true;
              }
              this.field_zb = 1;
              return true;
            }
            if (ml.a(-130697146, (char) var2)) {
              discarded$15 = this.field_Ab.append((char) var2);
              if (gf.field_k == 84) {
                if (this.field_Ab.length() > 0) {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                } else {
                  this.field_zb = 1;
                }
              }
              if (13 == gf.field_k) {
                this.field_zb = 1;
              }
              return true;
            }
            if (ula.a((char) var2, 48)) {
              discarded$16 = this.field_Ab.append((char) var2);
              if (gf.field_k == 84) {
                if (this.field_Ab.length() > 0) {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                } else {
                  this.field_zb = 1;
                }
              }
              if (13 == gf.field_k) {
                this.field_zb = 1;
              }
              return true;
            }
          }
          if (gf.field_k != 84) {
            if (13 != gf.field_k) {
              return true;
            }
            this.field_zb = 1;
            return true;
          }
          if (this.field_Ab.length() <= 0) {
            this.field_zb = 1;
          } else {
            this.field_Z = this.field_Ab.toString();
            this.field_zb = 2;
          }
          if (13 == gf.field_k) {
            this.field_zb = 1;
          }
          return true;
        }
        this.b(true, -4);
        if (85 != gf.field_k) {
          if (this.field_Ab.length() < 12) {
            var2Lifetime1 = Character.toLowerCase(dla.field_j);
            if (var2Lifetime1 == 32) {
              var2Lifetime1 = 95;
            }
            if (var2Lifetime1 == 95 &&
              0 < this.field_Ab.length()) {
              discarded$7 = this.field_Ab.append((char) var2Lifetime1);
              if (ml.a(-130697146, (char) var2Lifetime1)) {
                discarded$8 = this.field_Ab.append((char) var2Lifetime1);
              } else {
                if (ula.a((char) var2Lifetime1, 48)) {
                  discarded$9 = this.field_Ab.append((char) var2Lifetime1);
                }
              }
              if (gf.field_k == 84) {
                if (this.field_Ab.length() > 0) {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                } else {
                  this.field_zb = 1;
                }
              }
              if (13 == gf.field_k) {
                this.field_zb = 1;
              }
              return true;
            }
            if (ml.a(-130697146, (char) var2Lifetime1)) {
              discarded$10 = this.field_Ab.append((char) var2Lifetime1);
              if (gf.field_k == 84) {
                if (this.field_Ab.length() > 0) {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                } else {
                  this.field_zb = 1;
                }
              }
              if (13 == gf.field_k) {
                this.field_zb = 1;
              }
              return true;
            }
            if (ula.a((char) var2Lifetime1, 48)) {
              discarded$11 = this.field_Ab.append((char) var2Lifetime1);
              if (gf.field_k == 84) {
                if (this.field_Ab.length() > 0) {
                  this.field_Z = this.field_Ab.toString();
                  this.field_zb = 2;
                } else {
                  this.field_zb = 1;
                }
              }
              if (13 == gf.field_k) {
                this.field_zb = 1;
              }
              return true;
            }
          }
          if (gf.field_k != 84) {
            if (13 != gf.field_k) {
              return true;
            }
            this.field_zb = 1;
            return true;
          }
          if (this.field_Ab.length() <= 0) {
            this.field_zb = 1;
          } else {
            this.field_Z = this.field_Ab.toString();
            this.field_zb = 2;
          }
          if (13 == gf.field_k) {
            this.field_zb = 1;
          }
          return true;
        }
        if (this.field_Ab.length() > 0) {
          sw.a(this.field_Ab, 4, this.field_Ab.length() - 1, ' ');
        }
        if (this.field_Ab.length() >= 12) {
          if (gf.field_k == 84) {
            if (this.field_Ab.length() <= 0) {
              this.field_zb = 1;
            } else {
              this.field_Z = this.field_Ab.toString();
              this.field_zb = 2;
            }
          }
          if (13 != gf.field_k) {
            return true;
          }
          this.field_zb = 1;
          return true;
        }
        var2Lifetime2 = Character.toLowerCase(dla.field_j);
        if (var2Lifetime2 == 32) {
          var2Lifetime2 = 95;
        }
        if (var2Lifetime2 != 95) {
          if (ml.a(-130697146, (char) var2Lifetime2)) {
            discarded$5 = this.field_Ab.append((char) var2Lifetime2);
            if (gf.field_k == 84) {
              if (this.field_Ab.length() > 0) {
                this.field_Z = this.field_Ab.toString();
                this.field_zb = 2;
              } else {
                this.field_zb = 1;
              }
            }
            if (13 != gf.field_k) {
              return true;
            }
            this.field_zb = 1;
            return true;
          }
          if (ula.a((char) var2Lifetime2, 48)) {
            discarded$6 = this.field_Ab.append((char) var2Lifetime2);
            if (gf.field_k != 84) {
              if (13 != gf.field_k) {
                return true;
              }
              this.field_zb = 1;
              return true;
            }
            if (this.field_Ab.length() <= 0) {
              this.field_zb = 1;
            } else {
              this.field_Z = this.field_Ab.toString();
              this.field_zb = 2;
            }
            if (13 == gf.field_k) {
              this.field_zb = 1;
            }
            return true;
          }
        } else {
          if (0 < this.field_Ab.length()) {
            discarded$0 = this.field_Ab.append((char) var2Lifetime2);
            if (ml.a(-130697146, (char) var2Lifetime2)) {
              discarded$1 = this.field_Ab.append((char) var2Lifetime2);
            } else {
              if (ula.a((char) var2Lifetime2, 48)) {
                discarded$2 = this.field_Ab.append((char) var2Lifetime2);
              }
            }
            if (gf.field_k == 84) {
              if (this.field_Ab.length() > 0) {
                this.field_Z = this.field_Ab.toString();
                this.field_zb = 2;
              } else {
                this.field_zb = 1;
              }
            }
            if (13 == gf.field_k) {
              this.field_zb = 1;
            }
            return true;
          }
          if (ml.a(-130697146, (char) var2Lifetime2)) {
            discarded$3 = this.field_Ab.append((char) var2Lifetime2);
            if (gf.field_k == 84) {
              if (this.field_Ab.length() > 0) {
                this.field_Z = this.field_Ab.toString();
                this.field_zb = 2;
              } else {
                this.field_zb = 1;
              }
            }
            if (13 != gf.field_k) {
              return true;
            }
            this.field_zb = 1;
            return true;
          }
          if (ula.a((char) var2Lifetime2, 48)) {
            discarded$4 = this.field_Ab.append((char) var2Lifetime2);
            if (gf.field_k != 84) {
              if (13 != gf.field_k) {
                return true;
              }
              this.field_zb = 1;
              return true;
            }
            if (this.field_Ab.length() <= 0) {
              this.field_zb = 1;
            } else {
              this.field_Z = this.field_Ab.toString();
              this.field_zb = 2;
            }
            if (13 == gf.field_k) {
              this.field_zb = 1;
            }
            return true;
          }
        }
        if (gf.field_k == 84) {
          if (this.field_Ab.length() <= 0) {
            this.field_zb = 1;
          } else {
            this.field_Z = this.field_Ab.toString();
            this.field_zb = 2;
          }
        }
        if (13 != gf.field_k) {
          return true;
        }
        this.field_zb = 1;
        return true;
    }

    static {
        field_wb = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
