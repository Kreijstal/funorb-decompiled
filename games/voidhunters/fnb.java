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
        RuntimeException var6 = null;
        qw var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        ana var9 = null;
        int var9_int = 0;
        qw var10 = null;
        int var11 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                fnb.a(-3, 82, -123, true, 37, 119);
                break L1;
              }
            }
            L2: {
              if (null == ms.field_y) {
                break L2;
              } else {
                if (null == kba.field_a) {
                  break L2;
                } else {
                  var6_ref = (qw) ((Object) ms.field_y.d(0));
                  L3: while (true) {
                    if (var6_ref == null) {
                      L4: {
                        var6_int = uv.a(128, param2);
                        var7 = pja.b((byte) 95, param2, param1);
                        if (-257 != (param5 ^ -1)) {
                          var7 = var7 * param5 >> 1235488040;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var8 = param4;
                        if (1 < fbb.field_j[param4]) {
                          var8 = param4 + hob.a(jp.field_Jc, fbb.field_j[param4], 117);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var9 = coa.a(var7, 100, var6_int, fa.field_d[var8]);
                      var10 = new qw();
                      var10.field_m = true;
                      var10.field_h = param1;
                      var10.field_f = param4;
                      var10.field_k = var9;
                      var10.field_i = jia.field_o;
                      var10.field_d = param2;
                      ms.field_y.b(-10258, var10);
                      break L2;
                    } else {
                      L6: {
                        if (var6_ref.field_f != param4) {
                          break L6;
                        } else {
                          if (!var6_ref.field_m) {
                            break L6;
                          } else {
                            if (Math.abs(-jia.field_o + var6_ref.field_i) >= param0) {
                              break L6;
                            } else {
                              if (var6_ref.field_i != jia.field_o) {
                                var7 = -param2 + var6_ref.field_d;
                                var8 = var6_ref.field_h + -param1;
                                var9_int = ar.a(var7, (byte) 109, var8);
                                if (var9_int < tj.field_q) {
                                  cqb.a(var6_ref.field_d + 65536, var6_ref.field_h, var6_ref.field_h, var6_ref.field_d, (byte) -54);
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                      var6_ref = (qw) ((Object) ms.field_y.a((byte) 127));
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "fnb.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
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
        field_b = 5120;
        field_a = (int)((double)field_b * Math.sin(1.0471975511965976));
        field_c = new Hashtable();
    }
}
