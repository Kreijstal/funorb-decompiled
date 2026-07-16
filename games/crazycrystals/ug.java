/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ug implements Iterable {
    static String field_a;
    int field_e;
    private jb field_b;
    static String field_d;
    jb[] field_c;

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = CrazyCrystals.field_B;
              if (null != oi.field_d) {
                oi.field_d.a((byte) 43);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (null != hc.field_a) {
                hc.field_a.a(-3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != fj.field_c) {
                try {
                  L3: {
                    fj.field_c.d(-200000001);
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L4;
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            L5: {
              if (param0 == -127) {
                break L5;
              } else {
                ug.a((byte) 124);
                break L5;
              }
            }
            if (li.field_d != null) {
              var1 = 0;
              L6: while (true) {
                if (var1 >= li.field_d.length) {
                  return;
                } else {
                  if (var3 == 0) {
                    L7: {
                      if (li.field_d[var1] == null) {
                        break L7;
                      } else {
                        try {
                          L8: {
                            li.field_d[var1].d(-200000001);
                            var1++;
                            decompiledRegionSelector0 = 0;
                            break L8;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L9: {
                            var2 = (IOException) (Object) decompiledCaughtException;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var1++;
                    continue L6;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ii((ug) this);
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 32) {
            field_d = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackOut_7_0 = null;
        String stackOut_17_0 = null;
        var5 = CrazyCrystals.field_B;
        var6 = "(" + fl.field_m + " " + ea.field_n + " " + qn.field_u + ") " + bf.field_b;
        if (param0 == -1815) {
          if ((rk.field_b ^ -1) < -1) {
            var1 = var6 + ":";
            var2 = 0;
            L0: while (true) {
              if (rk.field_b > var2) {
                L1: {
                  stackOut_7_0 = var1 + 32;
                  stackIn_18_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var7 = stackIn_8_0;
                        var3 = kd.field_n.field_h[var2] & 255;
                        var4 = var3 >> 1055252964;
                        var3 = var3 & 15;
                        if ((var4 ^ -1) <= -11) {
                          break L3;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 += 55;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var8 = var7 + (char)var4;
                        if (10 <= var3) {
                          break L5;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 += 55;
                      break L4;
                    }
                    var1 = var8 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      stackOut_17_0 = (String) var1;
                      stackIn_18_0 = stackOut_17_0;
                      break L1;
                    }
                  }
                }
                return stackIn_18_0;
              } else {
                return var1;
              }
            }
          } else {
            return var6;
          }
        } else {
          return null;
        }
    }

    final jb a(long param0, int param1) {
        jb var4 = null;
        int var5 = 0;
        jb var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var4 = ((ug) this).field_c[(int)((long)(-1 + ((ug) this).field_e) & param0)];
        var5 = -65 % ((param1 - -31) / 54);
        ((ug) this).field_b = var4.field_b;
        L0: while (true) {
          if (var4 != ((ug) this).field_b) {
            if (var7 == 0) {
              if (param0 == ((ug) this).field_b.field_e) {
                var6 = ((ug) this).field_b;
                ((ug) this).field_b = ((ug) this).field_b.field_b;
                return var6;
              } else {
                ((ug) this).field_b = ((ug) this).field_b.field_b;
                continue L0;
              }
            } else {
              return null;
            }
          } else {
            ((ug) this).field_b = null;
            return null;
          }
        }
    }

    private ug() throws Throwable {
        throw new Error();
    }

    final void a(long param0, byte param1, jb param2) {
        jb var5 = null;
        L0: {
          if (null != param2.field_d) {
            param2.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = ((ug) this).field_c[(int)((long)(-1 + ((ug) this).field_e) & param0)];
        param2.field_b = var5;
        param2.field_d = var5.field_d;
        if (param1 != 42) {
          field_a = null;
          param2.field_d.field_b = param2;
          param2.field_b.field_d = param2;
          param2.field_e = param0;
          return;
        } else {
          param2.field_d.field_b = param2;
          param2.field_b.field_d = param2;
          param2.field_e = param0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_d = "Members only";
    }
}
