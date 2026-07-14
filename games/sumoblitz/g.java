/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class g {
    int field_d;
    static int field_c;
    static ta field_a;
    String field_b;

    public static void a(int param0) {
        int var1 = 58 % ((param0 - 20) / 45);
        field_a = null;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param2 != null) {
          var3 = param2.length();
          if (var3 < 1) {
            return false;
          } else {
            if (-13 <= (var3 ^ -1)) {
              L0: {
                var4 = uk.a(-1, param2);
                if (var4 == null) {
                  break L0;
                } else {
                  if (1 <= var4.length()) {
                    L1: {
                      if (wv.a((byte) -124, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (!wv.a((byte) -84, var4.charAt(var4.length() - 1))) {
                          var5 = 0;
                          var6 = param1;
                          L2: while (true) {
                            if (param2.length() <= var6) {
                              L3: {
                                if (0 < var5) {
                                  stackOut_27_0 = 0;
                                  stackIn_28_0 = stackOut_27_0;
                                  break L3;
                                } else {
                                  stackOut_26_0 = 1;
                                  stackIn_28_0 = stackOut_26_0;
                                  break L3;
                                }
                              }
                              return stackIn_28_0 != 0;
                            } else {
                              L4: {
                                var7 = param2.charAt(var6);
                                if (wv.a((byte) -85, (char) var7)) {
                                  var5++;
                                  break L4;
                                } else {
                                  var5 = 0;
                                  break L4;
                                }
                              }
                              if ((var5 ^ -1) <= -3) {
                                if (!param0) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final static dk a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) < -65) {
            return cn.field_ib;
          } else {
            if (34 != param1.charAt(0)) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var2) {
                  if (param0 > -118) {
                    field_c = -60;
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  var5 = param1.charAt(var4);
                  if (var5 != 46) {
                    if (0 == (se.field_b.indexOf(var5) ^ -1)) {
                      return gs.field_a;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    L1: {
                      if (var4 == 0) {
                        break L1;
                      } else {
                        if (var4 == var2 + -1) {
                          break L1;
                        } else {
                          if (var3 != 0) {
                            break L1;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L0;
                          }
                        }
                      }
                    }
                    return gs.field_a;
                  }
                }
              }
            } else {
              if (34 == param1.charAt(-1 + var2)) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var5 != 34) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return gs.field_a;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return gs.field_a;
              }
            }
          }
        } else {
          return qo.field_a;
        }
    }

    abstract java.net.Socket b(byte param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 <= 94) {
            return null;
        }
        return new java.net.Socket(((g) this).field_b, ((g) this).field_d);
    }

    static {
    }
}
