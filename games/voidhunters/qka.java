/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qka extends llb {
    private StringBuilder field_yb;
    private llb field_vb;
    private int field_wb;
    private llb field_xb;

    final boolean a(boolean param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var2;
        int var2Lifetime1;
        if (this.field_wb != 0) {
          return false;
        }
        if (pma.field_o != 85) {
          if (this.field_yb.length() < 12) {
            var2 = Character.toLowerCase(jl.field_r);
            if (var2 == 32) {
              var2 = 95;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var2 == 95) {
              if (0 >= this.field_yb.length()) {
                if (cs.a((char) var2, 0)) {
                  discarded$6 = this.field_yb.append((char) var2);
                } else {
                  if (haa.a((char) var2, true)) {
                    discarded$7 = this.field_yb.append((char) var2);
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                discarded$5 = this.field_yb.append((char) var2);
              }
            }
            if (decompiledFrameRemainder0) {
              if (cs.a((char) var2, 0)) {
                discarded$8 = this.field_yb.append((char) var2);
                if (pma.field_o == 84) {
                  if (this.field_yb.length() <= 0) {
                    this.field_wb = 1;
                  } else {
                    this.field_R = this.field_yb.toString();
                    this.field_wb = 2;
                  }
                }
                if (pma.field_o == 13) {
                  this.field_wb = 1;
                }
                if (param0) {
                  return false;
                }
                return true;
              }
              if (haa.a((char) var2, true)) {
                discarded$9 = this.field_yb.append((char) var2);
                if (pma.field_o == 84) {
                  if (this.field_yb.length() <= 0) {
                    this.field_wb = 1;
                  } else {
                    this.field_R = this.field_yb.toString();
                    this.field_wb = 2;
                  }
                }
                if (pma.field_o == 13) {
                  this.field_wb = 1;
                }
                if (param0) {
                  return false;
                }
                return true;
              }
            }
          }
          if (pma.field_o == 84) {
            if (this.field_yb.length() <= 0) {
              this.field_wb = 1;
            } else {
              this.field_R = this.field_yb.toString();
              this.field_wb = 2;
            }
          }
          if (pma.field_o == 13) {
            this.field_wb = 1;
          }
          if (param0) {
            return false;
          }
          return true;
        }
        if (this.field_yb.length() > 0) {
          npa.a(this.field_yb.length() - 1, param0, this.field_yb, ' ');
        }
        if (this.field_yb.length() >= 12) {
          if (pma.field_o == 84) {
            if (this.field_yb.length() <= 0) {
              this.field_wb = 1;
            } else {
              this.field_R = this.field_yb.toString();
              this.field_wb = 2;
            }
          }
          if (pma.field_o == 13) {
            this.field_wb = 1;
          }
          if (!param0) {
            return true;
          }
          return false;
        }
        var2Lifetime1 = Character.toLowerCase(jl.field_r);
        if (var2Lifetime1 == 32) {
          var2Lifetime1 = 95;
        }
        if (var2Lifetime1 == 95) {
          if (0 >= this.field_yb.length()) {
            if (cs.a((char) var2Lifetime1, 0)) {
              discarded$1 = this.field_yb.append((char) var2Lifetime1);
            } else {
              if (haa.a((char) var2Lifetime1, true)) {
                discarded$2 = this.field_yb.append((char) var2Lifetime1);
              }
            }
            if (pma.field_o == 84) {
              if (this.field_yb.length() <= 0) {
                this.field_wb = 1;
              } else {
                this.field_R = this.field_yb.toString();
                this.field_wb = 2;
              }
            }
            if (pma.field_o == 13) {
              this.field_wb = 1;
            }
            if (param0) {
              return false;
            }
            return true;
          }
          discarded$0 = this.field_yb.append((char) var2Lifetime1);
        }
        if (cs.a((char) var2Lifetime1, 0)) {
          discarded$3 = this.field_yb.append((char) var2Lifetime1);
          if (pma.field_o == 84) {
            if (this.field_yb.length() <= 0) {
              this.field_wb = 1;
            } else {
              this.field_R = this.field_yb.toString();
              this.field_wb = 2;
            }
          }
          if (pma.field_o == 13) {
            this.field_wb = 1;
          }
          if (!param0) {
            return true;
          }
          return false;
        }
        if (!haa.a((char) var2Lifetime1, true)) {
          if (pma.field_o == 84) {
            if (this.field_yb.length() <= 0) {
              this.field_wb = 1;
            } else {
              this.field_R = this.field_yb.toString();
              this.field_wb = 2;
            }
          }
          if (pma.field_o == 13) {
            this.field_wb = 1;
          }
          if (!param0) {
            return true;
          }
          return false;
        }
        discarded$4 = this.field_yb.append((char) var2Lifetime1);
        if (pma.field_o == 84) {
          if (this.field_yb.length() <= 0) {
            this.field_wb = 1;
          } else {
            this.field_R = this.field_yb.toString();
            this.field_wb = 2;
          }
        }
        if (pma.field_o == 13) {
          this.field_wb = 1;
        }
        if (!param0) {
          return true;
        }
        return false;
    }

    final int a(int param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != 0) {
          this.field_vb = (llb) null;
        }
        this.a(param1, 1332);
        if (!param1) {
          this.field_vb.field_R = this.field_yb.toString();
          if (param1 &&
            pba.field_o != 0 &&
            this.field_o == 0) {
            this.field_wb = 1;
          }
          return this.field_wb;
        }
        while (true) {
          if (!ata.e(127)) {
            this.field_vb.field_R = this.field_yb.toString();
            if (!param1) {
              return this.field_wb;
            }
            if (pba.field_o == 0) {
              return this.field_wb;
            }
            if (this.field_o != 0) {
              return this.field_wb;
            }
            this.field_wb = 1;
            return this.field_wb;
          }
          if (pma.field_o == 85 &&
            this.field_yb.length() > 0) {
            npa.a(-1 + this.field_yb.length(), false, this.field_yb, ' ');
          }
          if (dtb.a(jl.field_r, 109, (CharSequence) ((Object) this.field_yb))) {
            discarded$0 = this.field_yb.append(jl.field_r);
          } else {
            if (this.field_yb.length() == 0 &&
              jl.field_r == 91) {
              discarded$1 = this.field_yb.append(jl.field_r);
            } else {
              if (this.field_yb.length() == 1 &&
                35 == jl.field_r) {
                discarded$2 = this.field_yb.append(jl.field_r);
              } else {
                if (93 == jl.field_r) {
                  discarded$3 = this.field_yb.append(jl.field_r);
                }
              }
            }
          }
          if (pma.field_o != 84) {
            if (pma.field_o == 13) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (0 >= this.field_yb.length()) {
          return 1;
        }
        this.field_R = this.field_yb.toString();
        return 2;
    }

    qka(int param0, int param1, int param2, int param3, String param4, llb param5, llb param6, llb param7) {
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
        this.field_wb = 0;
        try {
          this.field_xb = new llb(0L, param6, param4);
          this.b(-561, this.field_xb);
          this.field_vb = new llb(0L, param7);
          this.field_vb.field_Y = 16764006;
          this.b(-561, this.field_vb);
          this.field_vb.field_s = "|";
          this.field_yb = new StringBuilder(12);
          var9_int = this.field_xb.e(57);
          this.field_xb.a(5, 119, var9_int, 3, nna.field_w);
          this.field_vb.a(5, 43, var9_int, 3 + nna.field_w, nna.field_w);
          var10 = 10 + var9_int;
          var11 = 3 + 2 * nna.field_w + 3;
          var12 = jv.a((byte) -109, param0, param2, var10);
          var13 = lma.a(param3, param1, var11, (byte) -16);
          this.a(var12, 122, var10, var13, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("qka.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
