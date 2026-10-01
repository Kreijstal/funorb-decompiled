/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    private int[] field_b;
    int field_e;
    private float[][] field_c;
    private int field_f;
    private int[] field_a;
    private int[] field_d;

    final int b() {
        int var1 = 0;
        while (this.field_d[var1] >= 0) {
            var1 = MusicDecoder.readBit() != 0 ? this.field_d[var1] : var1 + 1;
        }
        return this.field_d[var1] ^ -1;
    }

    private final void c() {
        int[] var2_ref_int__;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var9_int;
        int var10;
        int var11;
        int[] var12;
        int[] var14;
        int[] var17;
        var17 = new int[this.field_f];
        var14 = new int[33];
        var12 = var14;
        var2_ref_int__ = var12;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.field_f) {
            this.field_d = new int[8];
            var2 = 0;
            var3 = 0;
            L1: while (true) {
              if (var3 >= this.field_f) {
                return;
              } else {
                var4 = this.field_a[var3];
                if (var4 != 0) {
                  var5 = var17[var3];
                  var6 = 0;
                  for (var7 = 0; var7 < var4; var7++) {
                    var8 = -2147483648 >>> var7;
                    if ((var5 & var8) == 0) {
                      var6++;
                    } else {
                      if (this.field_d[var6] == 0) {
                        this.field_d[var6] = var2;
                      }
                      var6 = this.field_d[var6];
                    }
                    L5: {
                      if (var6 >= this.field_d.length) {
                        var9 = new int[this.field_d.length * 2];
                        var11 = 0;
                        var10 = var11;
                        L6: while (var11 < this.field_d.length) {
                          var9[var11] = this.field_d[var11];
                          var11++;
                        }
                        this.field_d = var9;
                        break L5;
                      }
                    }
                    var8 = var8 >>> 1;
                  }
                  this.field_d[var6] = var3 ^ -1;
                  if (var6 >= var2) {
                    var2 = var6 + 1;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = this.field_a[var3];
            if (var4 != 0) {
              L7: {
                var5 = 1 << 32 - var4;
                var6 = var14[var4];
                var17[var3] = var6;
                if ((var6 & var5) == 0) {
                  var7 = var6 | var5;
                  var8 = var4 - 1;
                  L8: while (true) {
                    if (var8 < 1) {
                      break L7;
                    } else {
                      var9_int = var14[var8];
                      if (var9_int != var6) {
                        break L7;
                      } else {
                        var10 = 1 << 32 - var8;
                        if ((var9_int & var10) == 0) {
                          var2_ref_int__[var8] = var9_int | var10;
                          var8--;
                          continue L8;
                        } else {
                          var2_ref_int__[var8] = var2_ref_int__[var8 - 1];
                          break L7;
                        }
                      }
                    }
                  }
                } else {
                  var7 = var2_ref_int__[var4 - 1];
                }
              }
              var14[var4] = var7;
              var8 = var4 + 1;
              L9: while (true) {
                if (var8 <= 32) {
                  var9_int = var14[var8];
                  if (var9_int == var6) {
                    var14[var8] = var7;
                    var8++;
                    continue L9;
                  } else {
                    var8++;
                    continue L9;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    private final static int a(int param0, int param1) {
        int var2 = 0;
        for (var2 = (int)Math.pow((double)param0, 1.0 / (double)param1) + 1; gi.a(param1, (byte) 21, var2) > param0; var2--) {
        }
        return var2;
    }

    final float[] a() {
        return this.field_c[this.b()];
    }

    ae() {
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int var1;
        int var2;
        int var3_int;
        float var3;
        int var4_int;
        float var4;
        int var5;
        int var6;
        int var7;
        int var8;
        float var9;
        int var10;
        int var11;
        float var12;
        int var12_int;
        float var13;
        int var14;
        MusicDecoder.readBits(24);
        this.field_e = MusicDecoder.readBits(16);
        this.field_f = MusicDecoder.readBits(24);
        this.field_a = new int[this.field_f];
        if (MusicDecoder.readBit() == 0) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = 1;
        }
        L1: {
          var1 = stackIn_3_0;
          if (var1 == 0) {
            if (MusicDecoder.readBit() == 0) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = 1;
            }
            var2 = stackIn_13_0;
            var14 = 0;
            var3_int = var14;
            L3: while (var14 < this.field_f) {
              if (var2 != 0) {
                if (MusicDecoder.readBit() == 0) {
                  this.field_a[var14] = 0;
                  var14++;
                  continue L3;
                }
              }
              this.field_a[var14] = MusicDecoder.readBits(5) + 1;
              var14++;
            }
            break L1;
          } else {
            var2 = 0;
            var3_int = MusicDecoder.readBits(5) + 1;
            L5: while (var2 < this.field_f) {
              var4_int = MusicDecoder.readBits(hj.a((byte) 58, this.field_f - var2));
              for (var5 = 0; var5 < var4_int; var5++) {
                incrementValue$0 = var2;
                var2++;
                this.field_a[incrementValue$0] = var3_int;
              }
              var3_int++;
            }
            break L1;
          }
        }
        L7: {
          this.c();
          var2 = MusicDecoder.readBits(4);
          if (var2 > 0) {
            var3 = MusicDecoder.d(MusicDecoder.readBits(32));
            var4 = MusicDecoder.d(MusicDecoder.readBits(32));
            var5 = MusicDecoder.readBits(4) + 1;
            if (MusicDecoder.readBit() == 0) {
              stackIn_23_0 = 0;
            } else {
              stackIn_23_0 = 1;
            }
            var6 = stackIn_23_0;
            if (var2 != 1) {
              var7 = this.field_f * this.field_e;
            } else {
              var7 = ae.a(this.field_f, this.field_e);
            }
            this.field_b = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              this.field_b[var8] = MusicDecoder.readBits(var5);
            }
            this.field_c = new float[this.field_f][this.field_e];
            if (var2 != 1) {
              var8 = 0;
              L11: while (true) {
                if (var8 >= this.field_f) {
                  break L7;
                } else {
                  var9 = 0.0f;
                  var10 = var8 * this.field_e;
                  var11 = 0;
                  L12: while (true) {
                    if (var11 >= this.field_e) {
                      var8++;
                      continue L11;
                    } else {
                      var12 = (float)this.field_b[var10] * var4 + var3 + var9;
                      this.field_c[var8][var11] = var12;
                      if (var6 != 0) {
                        var9 = var12;
                        var10++;
                        var11++;
                        continue L12;
                      } else {
                        var10++;
                        var11++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            } else {
              for (var8 = 0; var8 < this.field_f; var8++) {
                var9 = 0.0f;
                var10 = 1;
                for (var11 = 0; var11 < this.field_e; var11++) {
                  var12_int = var8 / var10 % var7;
                  var13 = (float)this.field_b[var12_int] * var4 + var3 + var9;
                  this.field_c[var8][var11] = var13;
                  if (var6 != 0) {
                    var9 = var13;
                  }
                  var10 = var10 * var7;
                }
              }
              break L7;
            }
          }
        }
    }
}
