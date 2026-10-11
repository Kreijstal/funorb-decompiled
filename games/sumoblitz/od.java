/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class od implements nr {
    int field_b;
    int field_a;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0;
        int var3Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var2Lifetime9;
        int var2Lifetime10;
        int var2Lifetime11;
        int var2Lifetime12;
        int var2Lifetime13;
        if (param1 > 8) {
          var3 = param0;
          if (var3 == 1) {
            var2 = fi.a(8, he.field_o, (byte) -96);
            fe.a(91, nt.field_n[1][var2]);
            return;
          }
          if (var3 == 2) {
            var2Lifetime8 = fi.a(8, he.field_o, (byte) -96);
            fe.a(91, nt.field_n[1][var2Lifetime8]);
            return;
          }
          if (var3 == 3) {
            var2Lifetime9 = fi.a(8, he.field_o, (byte) -96);
            fe.a(91, nt.field_n[1][var2Lifetime9]);
            return;
          }
          if (var3 == 0) {
            var2Lifetime10 = fi.a(8, he.field_o, (byte) -96);
            fe.a(91, nt.field_n[1][var2Lifetime10]);
            return;
          }
          if (4 == var3) {
            var2Lifetime11 = fi.a(5, he.field_o, (byte) -96);
            fe.a(80, nt.field_n[2][var2Lifetime11]);
            return;
          }
          if (var3 != 6) {
            if (var3 == 5) {
              var2Lifetime12 = fi.a(8, he.field_o, (byte) -96);
              fe.a(78, nt.field_n[0][var2Lifetime12]);
              return;
            }
            return;
          }
          var2Lifetime13 = fi.a(8, he.field_o, (byte) -96);
          fe.a(78, nt.field_n[0][var2Lifetime13]);
          return;
        }
        od.a(71);
        var3Lifetime1 = param0;
        if (var3Lifetime1 == 1) {
          var2Lifetime1 = fi.a(8, he.field_o, (byte) -96);
          fe.a(91, nt.field_n[1][var2Lifetime1]);
          return;
        }
        if (var3Lifetime1 == 2) {
          var2Lifetime2 = fi.a(8, he.field_o, (byte) -96);
          fe.a(91, nt.field_n[1][var2Lifetime2]);
          return;
        }
        if (var3Lifetime1 == 3) {
          var2Lifetime3 = fi.a(8, he.field_o, (byte) -96);
          fe.a(91, nt.field_n[1][var2Lifetime3]);
          return;
        }
        if (var3Lifetime1 == 0) {
          var2Lifetime4 = fi.a(8, he.field_o, (byte) -96);
          fe.a(91, nt.field_n[1][var2Lifetime4]);
          return;
        }
        if (4 == var3Lifetime1) {
          var2Lifetime5 = fi.a(5, he.field_o, (byte) -96);
          fe.a(80, nt.field_n[2][var2Lifetime5]);
          return;
        }
        if (var3Lifetime1 != 6) {
          if (var3Lifetime1 == 5) {
            var2Lifetime6 = fi.a(8, he.field_o, (byte) -96);
            fe.a(78, nt.field_n[0][var2Lifetime6]);
            return;
          }
          return;
        }
        var2Lifetime7 = fi.a(8, he.field_o, (byte) -96);
        fe.a(78, nt.field_n[0][var2Lifetime7]);
    }

    final static void a(int param0) {
        rf.field_a.a((byte) 117);
        if (param0 == 5178) {
          if (he.field_n == null) {
            he.field_n = new m(rf.field_a, t.field_s);
          }
          rf.field_a.a((byte) 115, he.field_n);
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 >= -50) {
          return;
        }
        try {
          if (11 == jv.field_a) {
            tu.a((byte) -126);
          }
          hu.a(hn.field_k, ur.field_R, ch.field_h, 122);
          um.a(0, 0, param1, (byte) 124);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "od.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    od(int param0, int param1) {
        this.field_b = param0;
        this.field_a = param1;
    }

    static {
    }
}
