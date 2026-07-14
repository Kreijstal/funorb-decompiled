/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fnb {
    static int field_a;
    static int field_b;
    static Hashtable field_c;

    abstract int a(int param0, boolean param1);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        qw var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ana var9_ref = null;
        qw var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (!param3) {
          if (null != ms.field_y) {
            if (null != kba.field_a) {
              var6 = (qw) (Object) ms.field_y.d(0);
              L0: while (true) {
                if (var6 != null) {
                  L1: {
                    if (var6.field_f != param4) {
                      break L1;
                    } else {
                      if (!var6.field_m) {
                        break L1;
                      } else {
                        if (Math.abs(-jia.field_o + var6.field_i) >= param0) {
                          break L1;
                        } else {
                          if (var6.field_i != jia.field_o) {
                            var7 = -param2 + var6.field_d;
                            var8 = var6.field_h + -param1;
                            var9 = ar.a(var7, (byte) 109, var8);
                            if (var9 < tj.field_q) {
                              cqb.a(var6.field_d + 65536, var6.field_h, var6.field_h, var6.field_d, (byte) -54);
                              return;
                            } else {
                              break L1;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  var6 = (qw) (Object) ms.field_y.a((byte) 127);
                  continue L0;
                } else {
                  L2: {
                    var6_int = uv.a(128, param2);
                    var7 = pja.b((byte) 95, param2, param1);
                    if (-257 != (param5 ^ -1)) {
                      var7 = var7 * param5 >> 1235488040;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var8 = param4;
                    if (1 < fbb.field_j[param4]) {
                      var8 = param4 + hob.a(jp.field_Jc, fbb.field_j[param4], 117);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var9_ref = coa.a(var7, 100, var6_int, fa.field_d[var8]);
                  var10 = new qw();
                  var10.field_m = true;
                  var10.field_h = param1;
                  var10.field_f = param4;
                  var10.field_k = var9_ref;
                  var10.field_i = jia.field_o;
                  var10.field_d = param2;
                  ms.field_y.b(-10258, (ksa) (Object) var10);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          fnb.a(-3, 82, -123, true, 37, 119);
          if (null != ms.field_y) {
            if (null != kba.field_a) {
              var6 = (qw) (Object) ms.field_y.d(0);
              L4: while (true) {
                if (var6 != null) {
                  L5: {
                    if (var6.field_f != param4) {
                      break L5;
                    } else {
                      if (!var6.field_m) {
                        break L5;
                      } else {
                        if (Math.abs(-jia.field_o + var6.field_i) >= param0) {
                          break L5;
                        } else {
                          if (var6.field_i != jia.field_o) {
                            var7 = -param2 + var6.field_d;
                            var8 = var6.field_h + -param1;
                            var9 = ar.a(var7, (byte) 109, var8);
                            if (var9 < tj.field_q) {
                              cqb.a(var6.field_d + 65536, var6.field_h, var6.field_h, var6.field_d, (byte) -54);
                              return;
                            } else {
                              break L5;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  var6 = (qw) (Object) ms.field_y.a((byte) 127);
                  continue L4;
                } else {
                  L6: {
                    var6_int = uv.a(128, param2);
                    var7 = pja.b((byte) 95, param2, param1);
                    if (-257 != (param5 ^ -1)) {
                      var7 = var7 * param5 >> 1235488040;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var8 = param4;
                    if (1 < fbb.field_j[param4]) {
                      var8 = param4 + hob.a(jp.field_Jc, fbb.field_j[param4], 117);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9_ref = coa.a(var7, 100, var6_int, fa.field_d[var8]);
                  var10 = new qw();
                  var10.field_m = true;
                  var10.field_h = param1;
                  var10.field_f = param4;
                  var10.field_k = var9_ref;
                  var10.field_i = jia.field_o;
                  var10.field_d = param2;
                  ms.field_y.b(-10258, (ksa) (Object) var10);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -8) {
            field_a = -67;
            field_c = null;
            return;
        }
        field_c = null;
    }

    abstract qp a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 5120;
        field_a = (int)((double)field_b * Math.sin(1.0471975511965976));
        field_c = new Hashtable();
    }
}
