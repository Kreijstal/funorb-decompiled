/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fi {
    private short[] field_e;
    private int field_d;
    private int field_f;
    private short[] field_g;
    private int field_b;
    static int field_c;
    int field_a;
    private int field_h;

    abstract void a(int param0, byte param1, int param2);

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          this.field_g = new short[this.field_a];
          if (param0 == -15063) {
            break L0;
          } else {
            this.a(-68);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            if (var2 >= this.field_a) {
              break L2;
            } else {
              this.field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
              var2++;
              if (var3 != 0) {
                break L2;
              } else {
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    abstract void c(int param0);

    abstract void a(byte param0);

    private final void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Random var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = new Random((long)this.field_h);
          var3 = 0;
          if (param0 == -256) {
            break L0;
          } else {
            field_c = 100;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= -256) {
                break L3;
              } else {
                this.field_e[var3] = (short)var3;
                var3++;
                if (var7 != 0) {
                  break L2;
                } else {
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var3 = 0;
            break L2;
          }
          L4: while (true) {
            L5: {
              if (var3 >= 255) {
                break L5;
              } else {
                var4 = -var3 + 255;
                var5 = jqa.a(var4, var8, -120);
                var6 = this.field_e[var5];
                this.field_e[var5] = this.field_e[var4];
                this.field_e[256 + var4] = (short) var6;
                this.field_e[var4] = (short) var6;
                var3++;
                if (var7 != 0) {
                  break L5;
                } else {
                  continue L4;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var36 = 0;
        int var37 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var43 = TombRacer.field_G ? 1 : 0;
          var48 = new int[param2];
          var45 = var48;
          var39 = var45;
          var47 = new int[param0];
          var44 = var47;
          var40 = var44;
          var49 = new int[param1];
          var46 = var49;
          var41 = var46;
          if (param3 <= -87) {
            break L0;
          } else {
            this.field_f = 92;
            break L0;
          }
        }
        var42 = 0;
        L1: while (true) {
          L2: {
            if (var42 >= param2) {
              var42 = 0;
              break L2;
            } else {
              var39[var42] = (var42 << -191673428) / param2;
              var42++;
              if (var43 != 0) {
                break L2;
              } else {
                continue L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (var42 >= param0) {
                var42 = 0;
                break L4;
              } else {
                var40[var42] = (var42 << -454181364) / param0;
                var42++;
                if (var43 != 0) {
                  break L4;
                } else {
                  continue L3;
                }
              }
            }
            L5: while (true) {
              L6: {
                if (param1 <= var42) {
                  this.a((byte) 50);
                  break L6;
                } else {
                  var41[var42] = (var42 << 1854122060) / param1;
                  var42++;
                  if (var43 != 0) {
                    break L6;
                  } else {
                    continue L5;
                  }
                }
              }
              var37 = 0;
              L7: while (true) {
                stackOut_19_0 = var37;
                stackIn_20_0 = stackOut_19_0;
                L8: while (true) {
                  L9: {
                    if (stackIn_20_0 >= param1) {
                      break L9;
                    } else {
                      if (var43 != 0) {
                        break L9;
                      } else {
                        var36 = 0;
                        if ((var36 ^ -1) <= (param0 ^ -1)) {
                          var37++;
                          if (var43 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        } else {
                          stackOut_23_0 = 0;
                          stackIn_20_0 = stackOut_23_0;
                          continue L8;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    fi(int param0, int param1, int param2, int param3, int param4) {
        this.field_d = 4;
        this.field_f = 4;
        this.field_a = 4;
        this.field_e = new short[512];
        this.field_h = 0;
        this.field_b = 4;
        this.field_b = param4;
        this.field_h = param0;
        this.field_a = param1;
        this.field_f = param2;
        this.field_d = param3;
        this.a(-15063);
        this.b(-256);
    }

    static {
    }
}
