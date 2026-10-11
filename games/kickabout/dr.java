/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr {
    static String field_f;
    static bb field_g;
    static String[] field_c;
    static String field_e;
    static boolean field_a;
    static hd field_d;
    static String field_b;

    public static void a(byte param0) {
        if (param0 != -127) {
          return;
        }
        field_e = null;
        field_b = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        jm var4_ref_jm = null;
        int var4 = 0;
        jm var5 = null;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          if (un.field_c != jn.field_rb) {
            return false;
          }
          if (param0 >= -1) {
            dr.a((byte) 127);
          }
          var2_long = nj.a(-90);
          if (cu.field_c != 0 &&
            ll.field_i < 0) {
            var4_ref_jm = (jm) (be.field_i.g(24009));
            if (var4_ref_jm != null &&
              var4_ref_jm.field_f < var2_long) {
              var4_ref_jm.c((byte) -109);
              ms.field_b = var4_ref_jm.field_k.length;
              un.field_e.field_n = 0;
              for (var5_int = 0; var5_int < ms.field_b; var5_int++) {
                un.field_e.field_f[var5_int] = var4_ref_jm.field_k[var5_int];
              }
              dj.field_A = wb.field_n;
              wb.field_n = kq.field_Ab;
              kq.field_Ab = so.field_b;
              so.field_b = var4_ref_jm.field_j;
              return true;
            }
          }
          while (true) {
            if (0 > ll.field_i) {
              un.field_e.field_n = 0;
              if (!uj.a((byte) 83, 1)) {
                return false;
              }
              ll.field_i = un.field_e.k((byte) 107);
              un.field_e.field_n = 0;
              ms.field_b = param1[ll.field_i];
            }
            if (!ps.a(180)) {
              return false;
            }
            if (cu.field_c == 0) {
              dj.field_A = wb.field_n;
              wb.field_n = kq.field_Ab;
              kq.field_Ab = so.field_b;
              so.field_b = ll.field_i;
              ll.field_i = -1;
              return true;
            }
            var4 = cu.field_c;
            if (0.0 != i.field_B) {
              var4 = (int)((double)var4 + ac.field_d.nextGaussian() * i.field_B);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new jm(var2_long + (long)var4, ll.field_i, new byte[ms.field_b]);
            for (var6 = 0; var6 < ms.field_b; var6++) {
              var5.field_k[var6] = un.field_e.field_f[var6];
            }
            be.field_i.a(var5, 3);
            ll.field_i = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("dr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static hd a(int param0) {
        if (param0 != 0) {
          return (hd) null;
        }
        return sp.field_Jb.field_Ab;
    }

    final static String a(int param0, Class param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -87) {
            field_b = (String) null;
          }
          if (param1.isArray()) {
            stackIn_6_0 = dr.a(-126, param1.getComponentType()) + "[]";
            return stackIn_6_0;
          }
          stackIn_4_0 = param1.getName().substring(1 + param1.getName().lastIndexOf("."));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("dr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"A born defender, the Tank is the muscle of the team. He moves slowly - thanks to his enormous weight and thick skull - but his wide-ranging tackle is dangerous to even the most nimble attacker.<br><br>The Tank can turn (using the direction keys) while tackling, making it a pain to get the ball around him.", "Your last line of defence, the Keeper is not a playable character and is instead controlled by the computer.<br><br>Tall, nimble and without fear, he will dive in the way of powerful shots and tackle anyone who comes too close.<br><br>You don't have to worry about your Keeper; let him do his job so you can get on with yours.", "The tiny Ranger is so small and fast that other characters struggle to keep up with him.<br><br>His speed is useful in defence, midfield and up front, although his shots lack power.<br><br>The Ranger can sprint even when he has the ball, allowing him to slip past attackers.", "Always getting in the spotlight, the Hotshot is the man of the match (at least, he'd like to think so).<br><br>His tackling ability doesn't impress anybody, but he makes up for it with low, fast, powerful shots, perfect for getting past the Keeper and hitting the back of the net.<br><br>He's always available for a champagne photo-shoot after the match, of course.", "A classic all-rounder, the Elite is your jack-of-all-trades.<br><br>He favours no single stat or style - at least at first. By training him up and using Elite-only trinkets, he can inherit the custom abilities of other players and become a very powerful end-game player."};
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_e = "Who can join";
        field_f = "<%0> wins the tournament for having a higher posession percentage than <%1>";
        field_a = false;
    }
}
